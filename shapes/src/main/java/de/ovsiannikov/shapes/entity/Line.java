package de.ovsiannikov.shapes.entity;

public class Line extends Shape {

    protected char symbol;
    private int length;

    public Line(char symbol, int length) {
        this.symbol = symbol;
        this.length = length;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder();
        System.out.println("\n");
        System.out.println(sb.append(String.valueOf(symbol).repeat(Math.max(0, length))));

    }
}
