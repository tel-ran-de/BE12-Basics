package with_callable_interface;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.concurrent.Callable;

public class Downloader implements Callable<File> {

    private final URL imageUrl;
    private final String path;

    public Downloader(URL imageUrl, String path) {
        this.imageUrl = imageUrl;
        this.path = path;
    }

    @Override
    public File call() throws Exception {
        BufferedImage image = ImageIO.read(imageUrl);
        String name = imageUrl.getPath().substring(imageUrl.getPath().lastIndexOf("-"));
        System.out.println(name);
        File downloadedImage = new File(path, name);
        ImageIO.write(image, "jpg", downloadedImage);

        return downloadedImage;
    }
}

