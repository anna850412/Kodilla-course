package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{

    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(ExerciseQueue exerciseQueue) {
        System.out.println(username + ": New exercise in topic " + exerciseQueue.getName() + "\n" +
                " (total: " + exerciseQueue.getExercises().size() + " exercises)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
