package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Java - Practice Exercise 3
 * Question 8
 * Write a program that will generate exceptions of type NegativeArraySizeException,
 * IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by
 * displaying the message stored in the exception object.
 */
public class ExceptionGeneratorTest {

    ExceptionGenerator exceptionGenerator;

    @Before
    public void setUp() throws Exception {
        exceptionGenerator = new ExceptionGenerator();
    }

    @After
    public void tearDown() throws Exception {
        exceptionGenerator = null;
    }

    /**
     * Test - createNegativeArraySizeException()
     * Check if the method gives out the correct exception message when method is called.
     */
    @Test
    public void givenMethodCallShouldReturnNegativeArraySizeExceptionMessage() {
        String expectedMessage = "NegativeArraySizeException raised";
        assertEquals("givenMethodCallShouldReturnNegativeArraySizeExceptionMessage: check createNegativeArraySizeException().",
                expectedMessage, exceptionGenerator.createNegativeArraySizeException());
    }

    /**
     * Test - createIndexOutOfBoundsException()
     * Check if the method gives out the correct exception message when method is called.
     */
    @Test
    public void givenMethodCallShouldReturnIndexOutOfBoundsExceptionMessage() {
        String expectedMessage = "IndexOutOfBoundsException raised";
        assertEquals("givenMethodCallShouldReturnIndexOutOfBoundsExceptionMessage: check createIndexOutOfBoundsException().",
                expectedMessage, exceptionGenerator.createIndexOutOfBoundsException());
    }

    /**
     * Test - createNullPointerException()
     * Check if the method gives out the correct exception message when method is called.
     */
    @Test
    public void givenMethodCallShouldReturnNullPointerExceptionMessage() {
        String expectedMessage = "NullPointerException raised";
        assertEquals("givenMethodCallShouldReturnNullPointerExceptionMessage: check createNullPointerException().",
                expectedMessage, exceptionGenerator.createNullPointerException());
    }
}