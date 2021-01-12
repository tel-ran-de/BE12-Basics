package de.ovsiannikov.shapes;

import de.ovsiannikov.shapes.entity.Picture;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class ShapeFlow implements ApplicationRunner {

    final Picture picture;

    public ShapeFlow(Picture picture) {
        this.picture = picture;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        picture.draw();
    }
}
