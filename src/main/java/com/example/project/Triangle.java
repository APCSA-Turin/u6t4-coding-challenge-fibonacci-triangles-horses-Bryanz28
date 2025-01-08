package com.example.project;

public class Triangle {
    private Point[] vertices;

    public Triangle(Point p1, Point p2, Point p3) {
        vertices = new Point[3];
        vertices[0] = p1;
        vertices[1] = p2;
        vertices[2] = p3;
    }

    public Point[] getVertices() {
        return vertices;
    }

    public double perimeter() {
        double side1 = vertices[0].distanceTo(vertices[1]);
        double side2 = vertices[1].distanceTo(vertices[2]);
        double side3 = vertices[2].distanceTo(vertices[0]);
        return side1 + side2 + side3;
    }

    public String triangleInfo() {
        return "[" +
                "(" + vertices[0].getX() + ", " + vertices[0].getY() + "), " +
                "(" + vertices[1].getX() + ", " + vertices[1].getY() + "), " +
                "(" + vertices[2].getX() + ", " + vertices[2].getY() + ")]";
    }
}
