package com.kodilla.sudoku;

public class SudokuGame {
    boolean newGame;

    public SudokuGame() {
        System.out.println("|");
        System.out.println("-");

    }

    boolean resolveSudoku() {
        if (newGame) {
            return true;
        } else {
            return false;
        }
    }
}

