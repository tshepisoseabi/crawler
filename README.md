Getting Started
These instructions will help you set up and run the project on your local machine.

Prerequisites
Java 8 or higher
Maven

Installing
1. Clone the repository:
   git clone <repository_url>
   cd webcrawler

2. Add Jsoup dependency:

Make sure your pom.xml includes the Jsoup dependency as follows:
<dependencies>
    <dependency>
        <groupId>org.jsoup</groupId>
        <artifactId>jsoup</artifactId>
        <version>1.14.3</version>
    </dependency>
</dependencies>

3. Build the project:

   mvn clean install

Running the Crawler

1. Run the main class:
   mvn exec:java -Dexec.mainClass="Main"

2. Enter a URL to crawl:
   When prompted, enter a URL to start crawling. The crawler will list all found URLs within the specified domain. To exit, type exit.
   Enter a URL: https://sedna.com
   URLs found within https://sedna.com:
   https://sedna.com
   https://sedna.com/about-us
   https://sedna.com/terms-and-conditions
   https://sedna.com/careers

   
Notes
The crawler ensures that only URLs starting with the specified domain are collected.
It uses a Set to store URLs to avoid duplicates.

Dependencies
Jsoup: A Java library for working with real-world HTML. It provides a very convenient API for extracting and manipulating data, using the best of DOM, CSS, and jquery-like methods.

By: Tshepiso Seabi
