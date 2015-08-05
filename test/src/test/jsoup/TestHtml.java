package test.jsoup;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.xml.bind.Element;

/**
 * Created by klisly on 8/5/15.
 */
public class TestHtml {
    public  static  void main(String[] args){
        String html = "<html><head><title>First parse</title></head>"
                + "<body><p>Parsed HTML into a doc.</p></body></html>";

        Document document = Jsoup.parse(html);
        System.out.println(document);
        System.out.println("----------------------------");
        org.jsoup.nodes.Element element = document.body();
        System.out.println(element);
        System.out.println("----------------------------");
        String element1 = document.text();
        System.out.println(element1);
        System.out.println("----------------------------");
        String title = document.title();
        System.out.println(title);
        System.out.println("----------------------------");
        String nodeName = document.nodeName();
        System.out.println(nodeName);
        System.out.println("----------------------------");
        org.jsoup.nodes.Element tagName = document.tagName("Parsed HTML into a doc.");
        System.out.println(tagName);


    }


}
