package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVING = "DrivingTask";
    public static final String PAINTING = "PaintingTask";
    public static final String SHOPPING = "ShoppingTask";
    public final Task makeTask(final String taskClass){
        switch (taskClass){
            case DRIVING:
                return new DrivingTask("Drive slowly","to Rome","by Car");
            case PAINTING:
                return new PaintingTask("Painting image","white","Image with landscape");
            case SHOPPING:
                return new ShoppingTask("Manufactura", "Buy T-Shirt", 2.0);
            default:
                return null;
        }
    }
}
