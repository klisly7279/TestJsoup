package test.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.xml.bind.Element;

/**
 * Created by klisly on 8/5/15.
 */
public class TestBody1 {
    public static void main(String[] args) {
        String html = "<div><p>this is my sencond test body";
        Document document = Jsoup.parseBodyFragment(html);
        System.out.println(html);

        System.out.println("===========");

        org.jsoup.nodes.Element element = document.body();
        System.out.println(element);

        System.out.println("===========");

        Document document1 = Jsoup.parse(html);
        System.out.println(html);

        System.out.println("===========");

        System.out.println(document1.body());

        System.out.println( document1.getElementsByTag("body"));


    }
}
