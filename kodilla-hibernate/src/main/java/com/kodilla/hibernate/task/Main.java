package com.kodilla.hibernate.task;

public class Main {
    public static void main (String [] args){
        Task task = new Task();

        System.out.println("task1");
        System.out.println("task");
        System.out.println(task.getDescription());
        System.out.println(task.getDuration());
        task.setDescription("new description task");
        System.out.println(task.getDescription());
        System.out.println(task.getCreated());
        Task task1 = new Task("abc", 12);
        System.out.println(task1.getDescription());
        System.out.println(task1.getDuration());
        System.out.println(task1.getCreated());
    }
}
