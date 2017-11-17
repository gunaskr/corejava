import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WebCrawler{
    //ExecutorService executor = Executors.newFixedThreadPool(100);
    ExecutorService executorService = Executors.newFixedThreadPool(5);
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    List<String> getUrls(String url){
        List<String> list = new ArrayList<>(10);
        if (url.length() > 7){
            return Arrays.asList();
        }
        for(int i=0;i<1;i++){
            list.add(url+i);
        }
        return list;
    }
    public static void main(String... args){
        WebCrawler crawl = new WebCrawler();
        try {
            MyLogger.setup();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Problems with creating the log files");
        }
        LOGGER.setLevel(Level.SEVERE);
        LOGGER.severe("some thing serous");
        Thread.setDefaultUncaughtExceptionHandler((t,e)->{
            LOGGER.log(Level.SEVERE, "some", e);
        });
        crawl.crawl("parent");
    }

    public void crawl(String startingUrl){
        List<String> urls = this.getUrls(startingUrl);
        
        try{
            crawlList(urls);
        }catch(Exception e){
            LOGGER.severe(e.toString());
        }
        
        //System.out.println(urls);
        //urls.parallelStream().forEach(u -> crawl(u));
        //urls.forEach(u -> crawl(u));
        /*urls.forEach(u -> {
            this.executorService.submit(() -> {
                crawl(u);
            });
        });*/
    }

    public void crawlList(List<String> urls){
        System.out.println(urls);
        // get all the urls in the urls
        List<String> resultingUrls = new ArrayList<String>();
        urls.forEach(url -> resultingUrls.addAll(this.getUrls(url)));
        crawlList(resultingUrls);
    }

}
