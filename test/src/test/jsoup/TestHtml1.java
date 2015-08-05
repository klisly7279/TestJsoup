package test.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Created by klisly on 8/5/15.
 */
public class TestHtml1 {
    public static void main(String[] args){
        String html = "<html>\n<head> second html <head/>\n<body>my second html test<body/>\n<html/>";
        Document document = Jsoup.parse(html);
        System.out.println(html);

    }
}
