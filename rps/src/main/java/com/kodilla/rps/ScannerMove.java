package com.kodilla.rps;

import java.util.Scanner;

public class ScannerMove {
    public Scanner scannerMove = new Scanner(System.in);
    public AllMessages message = new AllMessages();

public String firstPlayerChoose(){
    while(true){
      String text = scannerMove.nextLine();

        if(text.equals("1") || text.equals("2")|| text.equals("3")
        ||text.equals("n") || text.equals("x")){
            return text;
        } else {
            message.mistake();
        }
    }
}
    public String secondPlayerChoose(){
        while(true){
            String text = scannerMove.nextLine();

            if(text.equals("1") || text.equals("2")|| text.equals("3")
                    ||text.equals("n") || text.equals("x")){
                return text;
            } else {
                message.mistake();
            }
        }
    }
    public String firstPlayerName(){
        return scannerMove.nextLine();
    }
    public String secondPlayerName(){
        return scannerMove.nextLine();
    }
    public String nextMove(){
        while (true){
            String text =  scannerMove.nextLine();
            if (text.equals("x") || text.equals("n")){
                return text;
            } else {
                message.mistake();
            }
        }
    }

}
