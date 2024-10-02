package com.example.task2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Angle extends Shape {

    public Angle() {
        super(Color.ORANGE);
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setStroke(color);
        gc.setLineWidth(5);
        gc.strokeLine(150, 250, 200, 150);
        gc.strokeLine(200, 150, 250, 250);
    }

    @Override
    public String descriptor() {
        return "Угол";
    }
}

