package com.kodilla.stream.exercise;

import static com.kodilla.stream.exercise.PoemDecorator.*;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator){

        String result = poemDecorator.decorate(text);
        System.out.println(result);
    }
}


