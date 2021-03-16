package with_runnable_interface;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Downloader implements Runnable {

    private final URL imageUrl;
    private final String path;

    public Downloader(URL imageUrl, String path) {
        this.imageUrl = imageUrl;
        this.path = path;
    }

    @Override
    public void run() {
        BufferedImage image;
        try {
            image = ImageIO.read(imageUrl);

            String name = imageUrl.getPath().substring(imageUrl.getPath().lastIndexOf("-"));
            File downloadedImage = new File(path, name);
            ImageIO.write(image, "jpg", downloadedImage);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

