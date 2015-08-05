package test.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.xml.bind.Element;
import java.io.IOException;

/**
 * Created by klisly on 8/5/15.
 */
public class TestElement {
    public static void main(String[] args) {
        try {
            Document html = Jsoup.connect("http://www.gushiwen.org/shiju/").get();
                System.out.println(html);
            org.jsoup.nodes.Element content = html.getElementById("no-siteapp");
                System.out.println(content);


                Elements elements = html.getElementsByTag("strong");

                for (org.jsoup.nodes.Element element:elements){
                    System.out.println(element);

            }
                    String text = elements.text();
                    System.out.println(text);

                  //  System.out.println(  html.data());
                    System.out.println(html.attr("href"));



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
