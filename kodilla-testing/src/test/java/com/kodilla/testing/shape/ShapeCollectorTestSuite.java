package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Test functionality of shape collector")
public class ShapeCollectorTestSuite {

    @Test
    void testAddingFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(1);
        Triangle triangle = new Triangle(2,4);

        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);

        //Then
        Assertions.assertEquals(2, shapeCollector.getShapeList().size());
        Assertions.assertEquals(circle,shapeCollector.getShapeList().get(0));
        Assertions.assertEquals(triangle,shapeCollector.getShapeList().get(1));

    }

    @Test
    void testRemovingFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(1);
        Triangle triangle = new Triangle(2,4);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);

        //When
        shapeCollector.removeFigure(circle);

        //Then
        Assertions.assertEquals(1, shapeCollector.getShapeList().size());
        Assertions.assertEquals(triangle,shapeCollector.getShapeList().get(0));

    }

    @Test
    void testGettingOfFigureFromNPositionOfTheList() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(1));
        shapeCollector.addFigure(new Triangle(2, 2));
        shapeCollector.addFigure(new Square(3));
        shapeCollector.addFigure(new Circle(5));
        Shape expectedResult = new Square(3);

        //When
        Shape result = shapeCollector.getFigure(2);

        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void testGettingANameOfAllFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(1));
        shapeCollector.addFigure(new Triangle(1, 3));
        shapeCollector.addFigure(new Square(1));
        //When
        String result = shapeCollector.showFigures();
        String expectedResult = "[Circle{r=1.0}, Triangle{a=1, h=3}, Square{a=1.0}]";
        //Then
        Assertions.assertEquals(expectedResult, result);

    }

}
