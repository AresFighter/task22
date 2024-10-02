package com.example.task2;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField fieldsides;

    @FXML
    private Canvas canvas;

    public void drawShape() {
        // Получаем количество сторон из поля
        int numberOfSides;
        try {
            numberOfSides = Integer.parseInt(fieldsides.getText());
        } catch (NumberFormatException e) {
            System.out.println("Введите корректное число");
            return;
        }

        // Получаем фигуру через фабрику
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createPolygon(numberOfSides);

        if (shape != null) {
            // Очищаем холст и рисуем фигуру
            GraphicsContext gc = canvas.getGraphicsContext2D();
            gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
            shape.draw(gc);

            // Выводим описание фигуры
            System.out.println(shape.descriptor());
        } else {
            System.out.println("Фигура с таким количеством сторон не поддерживается");
        }
    }
}
