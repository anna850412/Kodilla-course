package com.kodilla.stream.exercise;

public class Square implements Shape{
    double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return a*a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;

        Square square = (Square) o;

        return Double.compare(square.getA(), getA()) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(getA());
        return (int) (temp ^ (temp >>> 32));
    }
}
