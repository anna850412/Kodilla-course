package com.kodilla.exception.test.io;

import com.kodilla.exception.io.FileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FileReaderTestSuite {
    @Test
    void testReadFile(){
        //Given
        FileReader fileReader = new FileReader();
        //When & Then
        Assertions.assertDoesNotThrow(()->fileReader.readFile());
    }
}
