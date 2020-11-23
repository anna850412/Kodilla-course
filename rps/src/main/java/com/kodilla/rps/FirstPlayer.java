package com.kodilla.rps;

public class FirstPlayer implements Player{
    private String playerName;
    private AllMessages message = new AllMessages();

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public AllMessages getMessage() {
        return message;
    }

    @Override
    public String chooseYourMove() {
        message.startGame();
        message.getNameOfFirstPlayer();
        message.firstPlayerName();
        message.selectNumberOfGames();
        message.possibleChoice();
        message.firstPlayerChoice();
        return null;
    }
}
