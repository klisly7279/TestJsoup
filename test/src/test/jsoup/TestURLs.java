package test.jsoup;

import org.jsoup.Jsoup;

import javax.swing.text.Document;
import javax.xml.bind.Element;
import java.io.IOException;

/**
 * Created by klisly on 8/5/15.
 */
public class TestURLs {
    public static void main(String[] args) {
        org.jsoup.nodes.Document doc = null;
        try {
            doc = Jsoup.connect("http://www.gushiwen.org/shiju/yu.aspx").get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        org.jsoup.nodes.Element link = doc.select("a").first();
        String relHref = link.attr("href");
        String absHref = link.attr("abs:href");
        System.out.println(absHref);

    }
}
