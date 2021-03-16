package with_callable_interface;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DownloadProcessor {

    private final static String urlsFile = "images_url.txt";
    private final static String path = "/Users/sergiiovsiannikov/Desktop/tel_ran_10/Reiteration_with_group_12/Back_end_Java/BE12-Basics/downloaded_images";

    public static void main(String[] args) throws IOException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        List<String> listOfURLs = Files.readAllLines(new File(urlsFile).toPath());
        List<Downloader> listOfTasks = new ArrayList<>(listOfURLs.size());

        for (String url : listOfURLs) {
            listOfTasks.add(new Downloader(new URL(url), path));
        }
        executor.invokeAll(listOfTasks);
        executor.shutdown();
    }
}
