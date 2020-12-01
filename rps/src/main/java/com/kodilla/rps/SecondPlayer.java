package com.kodilla.rps;

public class SecondPlayer implements Player{
    private String secondPlayerName;
    private AllMessages message = new AllMessages();
    private ScannerMove scannerMove = new ScannerMove();
    public String getSecondPlayerName() {
        return secondPlayerName;
    }

    public void setSecondPlayerName(String secondPlayerName) {
        this.secondPlayerName = secondPlayerName;
    }
    public AllMessages getMessage() {
        return message;
    }

    @Override
    public String chooseYourMove() {
        String getMove;
        message.possibleChoice();
        getMove = scannerMove.secondPlayerChoose();
        if (getMove.equals("n") || getMove.equals("x")) {
            message.nextMove();
            if (scannerMove.nextMove().equals("n")) {
                return getMove;
            }
        }
        return getMove;
    }
}
