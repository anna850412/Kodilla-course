package com.kodilla.rps;

public class NewGame extends Rules {
    public void runNewGame(){
        AllMessages allMessages = new AllMessages();
      allMessages.startGame();
      allMessages.getNameOfFirstPlayer();

    }
}
