package com.kodilla.exception.test.io;

import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @DisplayName("Test if Second Challenge is working properlly")
    @Test
    void testSecondChallenge() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When&Then
        assertAll(
                //obie liczby w zakresie
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(3, 1.5)),
                //obie poza zakresem
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1.49)),
                //x w zakresie, y poza
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.5, 1.51)),
                //x poza zakresem, y w zakresie
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.99, 1.5)),
                //x poza zakresem liczba ujemna, y w zakresie
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(-0.99, 1.5))
        );
//            assertAll(
//                    () -> assertThrows(FileReaderException.class, () -> fileReader.readFile("nie_ma_takiego_pliku.txt")),
//                    () -> assertThrows(FileReaderException.class, () -> fileReader.readFile(null)),
//                    () -> assertDoesNotThrow(() -> fileReader.readFile("names.txt"))
//            );
    }
}
