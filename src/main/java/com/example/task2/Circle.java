package com.example.task2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shape {

    public Circle() {
        super(Color.YELLOW);
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillOval(150, 150, 100, 100);
    }

    @Override
    public String descriptor() {
        return "Окружность";
    }
}

