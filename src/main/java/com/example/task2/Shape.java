package com.example.task2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    // Абстрактный метод для рисования
    public abstract void draw(GraphicsContext gc);

    // Абстрактный метод для описания фигуры
    public abstract String descriptor();
}