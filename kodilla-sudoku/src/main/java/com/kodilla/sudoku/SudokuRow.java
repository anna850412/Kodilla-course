package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow<sudokuElementList> {
    List<SudokuElement> sudokuElementList = new ArrayList<>();

    public List<SudokuElement> getSudokuElementList() {
        return sudokuElementList;
    }

    public void addElement(SudokuElement element) {
        if (element.getValue() > 0 && element.getValue() < 10) {
            sudokuElementList.add(element);
        }
    }


}
