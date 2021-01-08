package com.kodilla.rps;

import org.w3c.dom.ls.LSOutput;

public class NewGame extends Rules {
    private Player firstPlayer;
    private Player secondPlayer;
    private int firstPlayerWin;
    private int secondPlayerWin;
    private String first, second;
    private int roundsToWin;
    private ScannerMove scannerMove = new ScannerMove();
    private boolean play = true;
    private AllMessages message = new AllMessages();

    public void runNewGame() throws FristPlayerNullPointerException {

        message.startGame();
        message.getNameOfFirstPlayer();
        message.firstPlayerName();
        message.getNameOfSecondPlayer();
        message.secondPlayerName();
        startPlaying();
    }

    public void startPlaying() throws FristPlayerNullPointerException {
        while (this.play) {
            message.selectNumberOfGames();
            //    roundsToWin =scannerMove.intFirstPlayerChoose();
            firstPlayerWin = 0;
            secondPlayerWin = 0;
            continuePlaying();
        }
    }

    public void continuePlaying() throws FristPlayerNullPointerException {
        boolean continuePlay = true;
        while (continuePlay) {
            message.firstPlayerMove();
            if (firstPlayer != null) {
                first = firstPlayer.chooseYourMove();
                if (first.equals("n")) {
                    break;
                } else if (first.equals("x")) {
                    this.play = false;
                    break;
                }
            }

            message.secondPlayerMove();
            second = secondPlayer.chooseYourMove();
            if (second.equals("n")) {
                break;
            } else if (second.equals("x")) {
                this.play = false;
                break;
            }
            winnerOfRound();
            continuePlay = enoughRoundsToWinTheGame();
            if (!continuePlay) {
                this.play = nextMove();
            }
        }
    }

    public boolean nextMove() throws FristPlayerNullPointerException {
        message.nextMove();
        String nextMoveInfo = scannerMove.nextMove();
        if (nextMoveInfo.equals("x")) {
            message.endOfTheGame();
            return false;
        }
        return true;
    }

    public boolean enoughRoundsToWinTheGame() {
        if (roundsToWin == firstPlayerWin || roundsToWin == secondPlayerWin) {
            message.gameResult(firstPlayerWin, secondPlayerWin);
            if (roundsToWin == firstPlayerWin) {
                message.firstPlayerWin();
            } else {
                message.secondPlayerWin();
            }
            message.endOfTheGame();
            return false;
        } else {
            return true;
        }
    }

    public void winnerOfRound() {
        Player theRoundWinner = whoWinTheRound(firstPlayer, secondPlayer, scannerMove.firstPlayerChoose(), scannerMove.secondPlayerChoose());
        if (theRoundWinner != null) {
            if (theRoundWinner.equals(firstPlayer)) {
                firstPlayerWin++;
                message.firstPlayerWin();
            } else if (theRoundWinner.equals(secondPlayer)) {
                secondPlayerWin++;
                message.secondPlayerWin();
            } else {
                message.draw();
            }
        }
    }
}
