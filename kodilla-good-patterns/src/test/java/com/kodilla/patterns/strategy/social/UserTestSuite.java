package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies(){
        //Given
        User milena = new Millenials("Milena Lis");
        User eva = new YGeneration("Eva O'neil");
        User zenon = new ZGeneration("Zenon Martyniuk");

        //When
        String milenaIsUsing = milena.sharePost();
        System.out.println("Milena said: " + milenaIsUsing);
        String evaIsUsing = eva.sharePost();
        System.out.println("Eva said: " + evaIsUsing);
        String zenonIsUsing = zenon.sharePost();
        System.out.println("Zenon said: " + zenonIsUsing);

        //Then
        Assertions.assertEquals("I am using Facebook", milenaIsUsing);
        Assertions.assertEquals("I am using Twitter", evaIsUsing);
        Assertions.assertEquals("I am using Snapchat", zenonIsUsing);

    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        User zenon = new ZGeneration("Zenon Martyniuk");

        //When
        String zenonIsUsing = zenon.sharePost();
        System.out.println("Zenon should said: " + zenonIsUsing);
        zenon.setSocialPublisher(new FacebookPublisher());
        zenonIsUsing = zenon.sharePost();
        System.out.println("Zenon now said: " + zenonIsUsing);

        //Then
        Assertions.assertEquals("I am using Facebook", zenonIsUsing);
    }
}
