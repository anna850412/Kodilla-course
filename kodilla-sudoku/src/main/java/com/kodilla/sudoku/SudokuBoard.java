package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {

    String pipe = "|";
    String dash = "-";
    List<SudokuRow> sudokuRowList = new ArrayList<>();
    @Override
    public String toString() {
        return "SudokuBoard{" +
                "pipe='" + pipe + '\'' +
                ", dash='" + dash + '\'' +
                '}';
    }

    public SudokuBoard(String pipe, String dash) {
        this.pipe = pipe;
        this.dash = dash;
        System.out.println(pipe);
    }
}
