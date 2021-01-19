package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    @Test
    void testGetLastLog() {
        //Given
        Logger logger = Logger.LOG;
        logger.log("opening of the file");
        //When
        String result = logger.getLastLog();
        //Then
        Assertions.assertEquals("opening of the file", result);
    }
}
