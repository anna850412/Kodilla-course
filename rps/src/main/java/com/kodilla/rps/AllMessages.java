package com.kodilla.rps;

public class AllMessages {
    public void startGame() {
        System.out.println("Welcome on our platform. Let's start new game.");
    }

    public void getNameOfFirstPlayer() {
        System.out.println("Please fill in your Name");
    }

    public void getNameOfSecondPlayer() {
        System.out.println("Please fill in your Name");
    }

    public void selectNumberOfGames() {
        System.out.println("Please fill in number of rounds to win the game.");
    }

    public void possibleChoice() {
        System.out.println("Choose:" +
                "\n\'1\' Rock" +
                "\n\'2\' Paper" +
                "\n\'3\' Scissors" +
                "\n\'x\' End the game" +
                "\n\'n\' End this game and start new game");
    }
    public void gameResult(int firstPlayerWins, int secondPlayerWins){
        System.out.println("Current result: " +
                "\nFirst player wins " + firstPlayerWins + " round(s)" +
                "\nSecond player wins " + secondPlayerWins + " round(s)");
    }
    public void nextMove(){
        System.out.println("What are you going to do?" +
                "\n\'n\' Start new game" +
                "\n\'x\' End the game");
    }

    public void firstPlayerName() {
        System.out.println("First player Name is: ");
    }

    public void secondPlayerName() {
        System.out.println("Second player Name is: ");
    }

    public void firstPlayerWin() {
        System.out.println("First player win");
    }

    public void secondPlayerWin() {
        System.out.println("Second player win");
    }
    public void draw(){
        System.out.println("It is draw");
    }


    public void endOfTheGame() {
        System.out.println("This game is ended");
    }

    public void firstPlayerMove() {
        System.out.println("First player move");
    }

    public void secondPlayerMove() {
        System.out.println("Second player move");
    }

    public void mistake() {
        System.out.println("Mistake. Please try again");
    }

}
