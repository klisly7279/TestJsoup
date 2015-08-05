package test.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.xml.bind.Element;
import java.io.File;
import java.io.IOException;

/**
 * Created by klisly on 8/5/15.
 */
public class TestFile {
    public static void main(String[] args) {
        File file = new File("/home/klisly/TestJsoup/input.html");
        try {
            Document document = Jsoup.parse(file,"UTF-8","http://www.gushiwen.org/shiju/");
            System.out.println(document);

           // System.out.println(document.body());

           // System.out.println(document.html());
            Elements elements = document.getElementsByTag("a");
            for (org.jsoup.nodes.Element element: elements){
                System.out.println(elements);
            }












        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
