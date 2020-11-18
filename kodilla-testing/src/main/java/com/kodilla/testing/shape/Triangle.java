package com.kodilla.testing.shape;

public class Triangle implements Shape {
    int a;
    int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    public int getA() {
        return a;
    }

    public int getH() {
        return h;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", h=" + h +
                '}';
    }

    @Override
    public double getField() {
        return (a * h)/2;
    }
}
