package de.ovsiannikov.shapes.entity;

public class Rectangle extends Shape {

    protected char symbol;
    private int width;
    private int height;

    public Rectangle(char symbol, int width, int height) {
        this.symbol = symbol;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("\n");
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= width; j++) {
                if (i == 0 || j == 0 || i == height || j == width) {
                    System.out.print(symbol + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

