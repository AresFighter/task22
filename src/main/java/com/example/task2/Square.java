package com.example.task2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends Shape {

    public Square() {
        super(Color.BLUE);
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillRect(150, 150, 100, 100);
    }

    @Override
    public String descriptor() {
        return "Квадрат";
    }
}

