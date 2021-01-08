package com.kodilla.stream;

import java.util.Arrays;
import java.util.Random;

import static java.lang.Integer.parseInt;

public class Exercise {

    private static int[] Array;

    public static int[] digitize(long n) {
//            Random random = new Random();
//            int result = random.nextInt(10);
//           Arrays.stream(digitize(12345678)).toArray();
          //  result = (long)digitize();
        var initialArray = (""+n).split("");
       // var reversedArray = new int [];
        for (var i = initialArray.length - 1; i >= 0; i--) {
        //    reversedArray[i] = parseInt(initialArray.shift(),10);
        }
     //   return reversedArray;


        return new int[0];
    }

}
    class Application{
        public static void main (String [] arg) {
            Exercise e = new Exercise();
            long result = 0;
            e.digitize(result);
            Random random = new Random();
            //   digitize = (long)result;
            result = random.nextInt(1000);
            System.out.println(result);
//            new result = result.toString();
//            reverseArray();



        }
    }


