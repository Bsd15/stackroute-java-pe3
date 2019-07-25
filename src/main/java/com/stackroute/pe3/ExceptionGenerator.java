package com.stackroute.pe3;

public class ExceptionGenerator {

    /*
    Should return the error message if one of this method is called.
     */
    public String createNegativeArraySizeException() {
        return "NegativeArraySizeException raised";
    }

    public String createIndexOutOfBoundsException() {
        return "IndexOutOfBoundsException raised";
    }

    public String createNullPointerException() {
        return "NullPointerException raised";
    }
}
