package de.ovsiannikov.shapes.config;

import de.ovsiannikov.shapes.entity.Line;
import de.ovsiannikov.shapes.entity.Picture;
import de.ovsiannikov.shapes.entity.Rectangle;
import de.ovsiannikov.shapes.entity.Shape;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.Arrays;

@Configuration
public class ShapesConfig {

    @Bean
    @Order(1)
    public Line line() {
        return new Line('*', 10);
    }

    @Bean
    @Order(2)
    public Rectangle rectangle() {
        return new Rectangle(('x'), 5, 3);
    }

    @Bean
    @Order(3)
    public Picture picture(Line line, Rectangle rectangle) {
        return new Picture('+', Arrays.asList(line, rectangle));
    }
}
