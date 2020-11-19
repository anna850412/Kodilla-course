package com.kodilla.stream.beautifier;

import org.w3c.dom.Text;

public class PoemBeautifier implements PoemDecorator{

    public void beautify(String text, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(text);

        String Str = new String("Welcome in my World");

        System.out.print("Return Value :" );
        System.out.println(Str.toUpperCase() );
        System.out.println(Str.toLowerCase() );
        System.out.println(Str.replace("World", "Life"));
        System.out.println("ABC" + " " + Str + " " + "ABC");
        System.out.println(result);
    }

    @Override
    public String decorate(String text) {
        return text;
    }
}
