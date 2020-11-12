package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class OddNumbersExterminator {
 
    private final List oddList;
    private final List evenList;
    Random randomGenerator = new Random();
    private List<Integer> numbers = Collections.singletonList(randomGenerator.nextInt(100));

    public OddNumbersExterminator (List<Integer>oddList, List<Integer>evenList) {
        this.evenList = evenList;
        this.oddList = oddList;
    }
    public List<Integer> exterminate(List<Integer> numbers){
        if (numbers % 2 == 0) {  List<Integer> oddList = new ArrayList<Integer>();
            System.out.println(oddList);
        } else {
            List<Integer> evenList = new ArrayList<Integer>();
            System.out.println(evenList);
        }
        return numbers;
    }
    public List getEvenList() {
        return this.evenList;
    }
    public List getOddList() {
        return this.oddList;
    }
}
