import java.io.IOException;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static Set<String> returnedUrlsLinks = new HashSet<>();
    public static final String DOMAIN = "https://sedna.com";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a URL: ");
            String inputUrl = scanner.nextLine();
            if (inputUrl.equals("exit")) {
                System.out.println("Exiting program...");
                break;
            }

            if (!inputUrl.startsWith("http://") && !inputUrl.startsWith("https://")) {
                inputUrl = "https://" + inputUrl;
            }
                crawlUrls(inputUrl);

                for (String url : returnedUrlsLinks) {
                    System.out.println(url);
                }

        }
    }

    public static void crawlUrls(String url){

            try {

                Document document = Jsoup.connect(url).get();

                Elements links = document.select("a[href]");

                for (Element link : links) {
                    String urlFound = link.absUrl("href");

                    if (urlFound.startsWith(DOMAIN)) {
                            returnedUrlsLinks.add(urlFound);
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
