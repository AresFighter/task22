package com.example.task2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Line extends Shape {

    public Line () {
        super(Color.BLACK);
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setStroke(color);
        gc.setLineWidth(5);
        gc.strokeLine(150, 150, 250, 250);
    }

    @Override
    public String descriptor() {
        return "Линия";
    }
}
