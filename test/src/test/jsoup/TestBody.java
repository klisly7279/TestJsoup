package test.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Created by klisly on 8/5/15.
 */
public class TestBody {
    public static void main(String[] args) {
        String html = "<div id=\"BAIDU_DUP_fp_wrapper\" style" +
                "=\"position: absolute; left: -1px; bottom: -1px; " +
                "z-index: 0; width: 0px; height: 0px; overflow: hidden; visibility: hidden; display: none;\">";
        Document document = Jsoup.parseBodyFragment(html);

        System.out.println(html);
    }
}
