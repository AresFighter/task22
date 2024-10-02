package com.example.task2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Pentagon extends Shape {

    public Pentagon() {
        super(Color.RED);
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        double[] xPoints = { 200, 240, 220, 180, 160 };
        double[] yPoints = { 100, 150, 200, 200, 150 };
        gc.fillPolygon(xPoints, yPoints, 5);
    }

    @Override
    public String descriptor() {
        return "Пятиугольник";
    }
}

