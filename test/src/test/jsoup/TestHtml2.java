package test.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by klisly on 8/5/15.
 */
public class TestHtml2 {
    public static void main(String[] args) {
        try {
            Document document = Jsoup.connect("http://www.gushiwen.org/").get();
            Element element = document.select("a").first();
            Element element1 = document.select("a").last();
            System.out.println(element);

            System.out.println("-------------------");

            String text = document.body().text();
            System.out.println(text);

            System.out.println("-------------------");

            String link = document.attr("href");
            System.out.println(link);

            System.out.println("-------------------");

            String linktext = element1.text();
            System.out.println(linktext);

            System.out.println("-------------------");

            String outerLinkH = document.outerHtml();
            System.out.println(outerLinkH);

            System.out.println("-------------------");

            Element innerLink = document.head();
            System.out.println(innerLink);







        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
