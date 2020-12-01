package com.kodilla.rps;


@SpringBootApplication
public class RpsRunner {
    public static void main (String [] args){
        SpringApplication.run(RpsRunner.class, args);

        NewGame game = new NewGame();
        game.runNewGame();

    }
}
