package com.example.task2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle extends Shape {

    public Triangle() {
        super(Color.GREEN);
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        double[] xPoints = { 200, 250, 150 };
        double[] yPoints = { 100, 200, 200 };
        gc.fillPolygon(xPoints, yPoints, 3);
    }

    @Override
    public String descriptor() {
        return "Треугольник";
    }
}

