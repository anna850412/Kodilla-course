package com.kodilla.rps;
import com.kodilla.rps.ScannerMove;
import java.util.Scanner;

public class FirstPlayer implements Player {
    private String firstPlayerName;
    private AllMessages message = new AllMessages();
    private ScannerMove scannerMove = new ScannerMove();

    public String getFirstPlayerName() {
        return firstPlayerName;
    }

    public void setFirstPlayerName(String firstPlayerName) {
        this.firstPlayerName = firstPlayerName;
    }

    @Override
    public String chooseYourMove() {
        String getMove;
        message.possibleChoice();
        getMove = scannerMove.firstPlayerChoose();
        if (getMove.equals("n") || getMove.equals("x")) {
            message.nextMove();
            if (scannerMove.nextMove().equals("n")) {
                return getMove;
            }
        }
        return getMove;
    }
}


