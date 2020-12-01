package com.kodilla.testing.shape;

public class ShapeDrawer {
    private Shape shape;
    public ShapeDrawer() {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }

    public void getShapeName() {
        this.shape.getShapeName();
    }

    public void getField() {
        this.shape.getField();
    }

    public void getNameAndField() {
        System.out.println("Start");
        this.shape.getShapeName();
        this.shape.getField();
        System.out.println("End");
    }

}

