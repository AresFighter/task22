package com.example.task2;

public class ShapeFactory {

    public Shape createPolygon(int numberOfSides) {
        if (numberOfSides == 0) {
            return new Circle();  // Класс для окружности
        } else if (numberOfSides == 1) {
            return new Line();  // Класс для отрезка
        } else if (numberOfSides == 2) {
            return new Angle();  // Класс для угла
        } else if (numberOfSides == 3) {
            return new Triangle();
        } else if (numberOfSides == 4) {
            return new Square();
        } else if (numberOfSides == 5) {
            return new Pentagon();
        } else {return null; // Нет фигуры с таким количеством сторон
        }
    }
}
