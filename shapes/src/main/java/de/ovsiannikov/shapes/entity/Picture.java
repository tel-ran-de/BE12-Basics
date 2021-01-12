package de.ovsiannikov.shapes.entity;

import java.util.List;

public class Picture extends Shape {

    protected char symbol;
    private List<Shape> shapes;

    public Picture(char symbol, List<Shape> shapes) {
        this.symbol = symbol;
        this.shapes = shapes;
    }

    @Override
    public void draw() {

        System.out.print("\n");

        System.out.println(String.valueOf(symbol).repeat(Math.max(0, 20)));

        for (Shape shape : shapes) {
            shape.draw();
        }
        System.out.println("\n");

        System.out.println(String.valueOf(symbol).repeat(Math.max(0, 20)));

        System.out.print("\n");
    }
}
