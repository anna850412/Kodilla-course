package com.kodilla.exception.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

        @DisplayName("Text if Second Challenge is working properlly")
        @Test
        void testSecondChallenge () {
            //Given
            SecondChallenge secondChallenge = new SecondChallenge();
            try {
                String result = secondChallenge.probablyIWillThrowException(1, 1.5);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //When&Then
//            Assertions.assertAll(
//                    () -> assertThrows(ExceptionHandling.class, () -> secondChallenge.probablyIWillThrowException(1, 1.5)),
//                    () -> assertThrows(ExceptionHandling.class, () -> secondChallenge.probablyIWillThrowException(null, 5)),
//                    () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException("a","b"))
//            );
//            assertAll(
//                    () -> assertThrows(FileReaderException.class, () -> fileReader.readFile("nie_ma_takiego_pliku.txt")),
//                    () -> assertThrows(FileReaderException.class, () -> fileReader.readFile(null)),
//                    () -> assertDoesNotThrow(() -> fileReader.readFile("names.txt"))
//            );
        }
        }
