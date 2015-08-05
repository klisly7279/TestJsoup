package test.jsoup;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

/**
 * Created by klisly on 8/5/15.
 */
public class TestFile1 {
    public static void main(String[] args) {
       File file = new File("/home/klisly/TestJsoup/file.html");
        Document document = null;
        try {
            document = Jsoup.parse(file, "UTF-8", "http://www.gushiwen.org/shiju/");
            //System.out.println(document.body());
           // System.out.println(document);
            //System.out.println(document.location());
            System.out.println(document.html());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
