package com.kodilla.rps;

public class NewGame extends Rules {
    private Player firstPlayer;
    private Player secondPlayer;
    private int roundsToWin;
    private ScannerMove scannerMove = new ScannerMove();
    private boolean play = true;
    private AllMessages message = new AllMessages();

    public void runNewGame(){

        message.startGame();
        message.getNameOfFirstPlayer();
        message.firstPlayerName();
      //  firstPlayer = createChoosenPlayer(scannerMove.firstPlayerChoose());
        message.getNameOfSecondPlayer();
        message.secondPlayerName();
       // secondPlayer = createChoosenPlayer(scannerMove.secondPlayerChoose());

        message.selectNumberOfGames();
        message.possibleChoice();
        message.firstPlayerMove();
        message.secondPlayerMove();

    }
    }

