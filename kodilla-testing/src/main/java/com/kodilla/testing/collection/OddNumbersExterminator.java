package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

class OddNumbersExterminator {


    //        int i = 0;
//    Random randomGenerator = new Random();
//    private List<Integer> numbers = Collections.singletonList(randomGenerator.nextInt(100));
//    for (int i = 0; i < numbers.size(); i++) {
//        numbers.add(i);
//    }
    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenList = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenList.add(number);
            }
        }
        return evenList;
    }
}
