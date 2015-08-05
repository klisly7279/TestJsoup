package test.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.xml.bind.Element;
import java.io.IOException;

/**
 * Created by klisly on 8/5/15.
 */
public class TestUrlConnect {
    public static void main(String[] args) {

        try {
            Document document = Jsoup.connect("http://www.gushiwen.org/shiju/").get();
        //    System.out.println(document);
            String title = document.title();
       //     System.out.println(title);
            String text = document.text();
     //       System.out.println(text);
            String text1 = document.location();
      //      System.out.println(text1);
            org.jsoup.nodes.Element element = document.body();
         //   System.out.println(element);

         //   System.out.println(element.getAllElements());

           // System.out.println(element.getElementsByTag("a"));

         //   System.out.println(element.select("a[href]"));














        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
