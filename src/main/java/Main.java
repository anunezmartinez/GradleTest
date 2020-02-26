import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").userAgent("Chrome").get();
        Elements elementTemp = doc.getElementsByClass("today_nowcard-temp");
        String temp = elementTemp.text();
        Elements elementTime = doc.getElementsByClass("today_nowcard-phrase");
        String time = elementTime.text();
        System.out.println(temp + " C" + time + " data extracted from " + doc.title());

    }
}
