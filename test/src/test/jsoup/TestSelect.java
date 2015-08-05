package test.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by klisly on 8/5/15.
 */
public class TestSelect {
    public static void main(String[] args) {
        Document document = null;
        try {
            document = Jsoup.connect("http://www.gushiwen.org/shiju/").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
       // System.out.println(document);

        //String text = document.text();
        //System.out.println(text);

        Elements links = document.select("a[href]");
        //System.out.println(links);

        Element masthead = document.select("div.masthead").last();
        System.out.println(masthead);

        Elements link = document.select("h3.r >a");
        System.out.println(link);










    }
}
