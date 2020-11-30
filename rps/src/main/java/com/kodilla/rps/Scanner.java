package com.kodilla.rps;


public class Scanner {
    //public Scanner scanner = new Scanner(System.in);
    public AllMessages allMessages = new AllMessages();
    String text;
public String choose(){
    while(true){
      //  String text = scanner.nextLine();

        if(text.equals("1") || text.equals("2")|| text.equals("3")
        ||text.equals("n") || text.equals("x")){
            return text;
        } else {
            allMessages.mistake();
        }


    }

}

}
