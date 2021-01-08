package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapeList = new ArrayList<>();

    public static String showFigures(List<Shape> shapeList) {
        return String.valueOf(shapeList);
    }

    public List<Shape> getShapeList() {
        return shapeList;
    }

    public Shape addFigure(Shape shape) {
        shapeList.add(shape);
        return shape;
    }

    public boolean removeFigure(Shape shape) {
        shapeList.remove(shape);
        return false;
    }

    public Shape getFigure(int n) {
        return shapeList.get(n);
    }

    public String showFigures() {
        System.out.println(shapeList);
        return shapeList.toString();
    }
}