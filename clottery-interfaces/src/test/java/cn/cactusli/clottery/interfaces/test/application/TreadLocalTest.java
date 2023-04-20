package cn.cactusli.clottery.interfaces.test.application;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: TreadLocalTest
 * Package: cn.cactusli.clottery.interfaces.test.application
 * Description:
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/13 15:01
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class TreadLocalTest {

    private Logger logger = LoggerFactory.getLogger(TreadLocalTest.class);


    // 线程不安全
    private static SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    // 线程安全
    private static ThreadLocal<SimpleDateFormat> threadLocal = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

    @Test
    public void testSimple2() {
        while (true) {
            new Thread(() -> {
                String dateStr = threadLocal.get().format(new Date());
                try {
                    Date parseDate = threadLocal.get().parse(dateStr);
                    String dateStrCheck = threadLocal.get().format(parseDate);
                    boolean equals = dateStr.equals(dateStrCheck);
                    if (!equals) {
                        System.out.println(equals + " " + dateStr + " " + dateStrCheck);
                    } else {
                        System.out.println(equals);
                    }
                } catch (ParseException e) {
                    System.out.println(e.getMessage());
                }
            }).start();
        }
    }

    @Test
    public void testSimple() {
        while (true) {
            new Thread(() -> {
                String dateStr = f.format(new Date());
                try {
                    Date parseDate = f.parse(dateStr);
                    String dateStrCheck = f.format(parseDate);
                    boolean equals = dateStr.equals(dateStrCheck);
                    if (!equals) {
                        System.out.println(equals + " " + dateStr + " " + dateStrCheck);
                    } else {
                        System.out.println(equals);
                    }
                } catch (ParseException e) {
                    System.out.println(e.getMessage());
                }
            }).start();

        }
    }

    @Test
    public void test_idx() {
        int HASH_INCREMENT = 0x61c88647;

        int hashCode = 0;
        for (int i = 0; i < 16; i++) {
            hashCode = i * HASH_INCREMENT + HASH_INCREMENT;
            int idx = hashCode & 15;
            System.out.println("斐波那契散列：" + idx + " 普通散列：" + (String.valueOf(i).hashCode() & 15));
        }
    }

    @Test
    public void test_threadLocalHashCode() throws Exception {
        for (int i = 0; i < 5; i++) {
            ThreadLocal<Object> objectThreadLocal = new ThreadLocal<>();
            objectThreadLocal.set("cactusli" + i);
            objectThreadLocal.get();
            Field threadLocalHashCode = objectThreadLocal.getClass().getDeclaredField("threadLocalHashCode");
            threadLocalHashCode.setAccessible(true);
            System.out.println("objectThreadLocal：" + threadLocalHashCode.get(objectThreadLocal));
        }
    }




    @Test
    public void outPutExcel() throws IOException {
        for (int i = 7; i >0 ; i-- ) {
            Document doc;
            if(i == 7) {
                doc = Jsoup.connect("https://ecsf.ac.cn/rcjs/rcdw/fyjy.htm").get();
            } else {
                doc = Jsoup.connect("https://ecsf.ac.cn/rcjs/rcdw/fyjy/"+i+".htm").get();
            }
            //logger.info(doc.title());
            Elements newsHeadlines = doc.select(".ReserList ul");
            for (Element headline : newsHeadlines) {
                Elements lis = headline.select("li a");
                String li_a = "";
                for (Element li : lis) {
                    if (li_a.equals(li.attr("href"))) {
                        continue;
                    }
                    li_a = li.attr("href");

                    StringBuilder  str = new StringBuilder();
                    String href = li.attr("href").replace("../../", "https://ecsf.ac.cn/");
                    href = href.replace("../", "");
                    Document doc2 = Jsoup.connect(href).get();
                    Elements trLines = doc2.select(".SinglePageInfoTable tr");
                    for (Element trLine : trLines) {
                        Elements tdLines = trLine.select("td");
                        for (Element tdLine : tdLines) {
                            str.append(tdLine.text()+ " ");
                        }
                    }
                    System.out.println(str);
                }
            }
        }
    }


}
