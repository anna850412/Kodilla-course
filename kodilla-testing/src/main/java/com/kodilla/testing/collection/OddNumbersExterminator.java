package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class OddNumbersExterminator {

    private List <Integer> oddList = new ArrayList<>();
    private List <Integer> evenList = new ArrayList<>();
    private  List<Integer> numbers = new ArrayList<>();
    public OddNumbersExterminator (List<Integer>oddList, List<Integer>evenList) {
        this.evenList = evenList;
        this.oddList = oddList;
    }
    int i = 0;
    Random randomGenerator = new Random();
    private List<Integer> numbers = Collections.singletonList(randomGenerator.nextInt(100));
    for (int i = 0; i < numbers.size(); i++) {
        numbers.add(i);
    }
    public List<Integer> exterminate(List<Integer> numbers){
        if (numbers.size() % 2 == 0) {  List<List<Integer>> oddList = new ArrayList<>();
            oddList.add(numbers);
            System.out.println(oddList);
        } else {
            List<Integer> evenList = new ArrayList<Integer>();
            evenList.add(numbers);
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

    public List<Integer> getNumbers() {
        return numbers;
    }
}
