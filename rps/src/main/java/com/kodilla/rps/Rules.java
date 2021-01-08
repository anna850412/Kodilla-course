package com.kodilla.rps;

public abstract class Rules {
   // protected int [][] winRulesTab;
    protected int [][] rules;
    protected int firstPlayerWin = 0;
    protected int secondPlayerWin = 0;
    Player firstPlayer;
    Player secondPlayer;
    protected AllMessages message = new AllMessages();

/*      \gracz 2
gracz 1/ papier | kamień | nożyce
papier      0   |   1    |  -1
kamień     -1   |   0    |   1
nożyce      1   |  -1    |   0

 */
    public Rules() {
        int[][] rules = new int[][]{
                {0, 1, -1},
                {-1, 0, 1},
                {1, -1, 0}
        };
//    this.winRulesTab = new int [3][3];
//    this.winRulesTab[0][0] = 0;
//    this.winRulesTab[0][1] = 1;
//    this.winRulesTab[0][2] = -1;
//    this.winRulesTab[1][0] = -1;
//    this.winRulesTab[1][1] = 0;
//    this.winRulesTab[1][2] = 1;
//    this.winRulesTab[2][0] = 1;
//    this.winRulesTab[2][1] = -1;
//    this.winRulesTab[2][2] = 0;
//    }

    }
    public Player whoWinTheRound(Player firstPlayer, Player secondPlayer, String firstPlayerChoose, String secondPlayerChoose){
        int firstInt = (int)firstPlayerChoose.charAt(0);
        int secondInt = (int)secondPlayerChoose.charAt(0);

        int result = rules[firstInt -1][secondInt-1];

        if(result == -1){
            secondPlayerWin++;
            message.secondPlayerWin();
        } else if (result == 1){
            firstPlayerWin++;
            message.firstPlayerWin();
        } else {
            message.draw();
        }
        return null;
    }
    }
