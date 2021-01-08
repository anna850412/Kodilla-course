package com.kodilla.rps;

public class RpsRunnerApplication {
    public static void main (String [] args) throws FristPlayerNullPointerException {


        NewGame game = new NewGame();
        try {
            game.runNewGame();
        } catch (FristPlayerNullPointerException e){
            throw new FristPlayerNullPointerException("First Player is equal null but we can play the game");
        }

    }
}
