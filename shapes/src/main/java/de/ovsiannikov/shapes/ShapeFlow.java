package de.ovsiannikov.shapes;

import de.ovsiannikov.shapes.entity.Line;
import de.ovsiannikov.shapes.entity.Picture;
import de.ovsiannikov.shapes.entity.Rectangle;
import de.ovsiannikov.shapes.entity.Shape;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShapeFlow implements ApplicationRunner {

    final Line line;
    final Rectangle rectangle;
    final Picture picture;
    final List<Shape> shapes;

    public ShapeFlow(Line line, Rectangle rectangle, Picture picture, List<Shape> shapes) {
        this.line = line;
        this.rectangle = rectangle;
        this.picture = picture;
        this.shapes = shapes;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        picture.draw();
    }
}
