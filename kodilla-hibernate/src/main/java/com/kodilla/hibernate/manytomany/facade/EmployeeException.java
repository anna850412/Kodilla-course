package com.kodilla.hibernate.manytomany.facade;

public class EmployeeException extends Exception{
    public static String ERR_NOT_EXIST = "Such employee doesn't exist";

    public EmployeeException(String message) {
        super(message);
    }
}
