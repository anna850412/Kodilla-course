package com.kodilla.rps;

public abstract class Rules {
   // protected int [][] winRulesTab;
    protected int [][] rules;
    protected int firstPlayerWin = 0;
    protected int secondPlayerWin = 0;
    protected AllMessages message = new AllMessages();

/*      \gracz 2
gracz 1/ papier | kamień | nożyce
papier      0   |   1    |  -1
kamień     -1   |   0    |   1
nożyce      1   |  -1   |   0

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
    public int whoWinTheRound(String firstPlayerChoose, String secondPlayerChoose){
        int result = whoWinTheRound(firstPlayerChoose, secondPlayerChoose);
        if(result == -1){
            secondPlayerWin++;
            message.secondPlayerWin();
        } else if (result == 1){
            firstPlayerWin++;
            message.firstPlayerWin();
        } else {
            message.draw();
        }
        return result;
    }
    }
