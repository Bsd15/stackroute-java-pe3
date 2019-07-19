package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Java - Practice Exercise 3
 * Question - 7
 * Create a class with a main( ) that throws an object of class Exception inside a try block.
 * a. Give the constructor for Exception a String argument.
 * b. Catch the exception inside a catch clause and print the String argument.
 * c. Add a finally clause and print a message to prove you were there.
 */
public class ExceptionCatcherTest {

    ExceptionCatcher exceptionCatcher;

    @Before
    public void setUp() throws Exception {
        exceptionCatcher = new ExceptionCatcher();
    }

    @After
    public void tearDown() throws Exception {
        exceptionCatcher = null;
    }

    /**
     * Test - createException()
     * Test if the method return the same exception message given in
     * setExceptionMessage()
     */
    @Test
    public void givenExceptionMessageShouldReturnStringArrayOfMessages() {
        String[] expectedMessages = {
                "Exception recieved from test",
                "Finally block reached"
        };
        exceptionCatcher.setExceptionsMessage(expectedMessages[0]);
        assertArrayEquals("givenExceptionMessageShouldThrowExceptions: createException() should return string array of correct messages.",
                expectedMessages, exceptionCatcher.createException());
    }

    /**
     * Test - createException()
     * Check if null is given as message of exception a default message is returned or not.
     */
    @Test
    public void givenNullMessageShouldReturnDefaultMessageInArray() {
        String[] expectedMessages = {
                "Default exception message",
                "Finally block reached"
        };
        exceptionCatcher.setExceptionsMessage(null);
        assertArrayEquals("givenExceptionMessageShouldThrowExceptions: createException() should return string array of correct messages.",
                expectedMessages, exceptionCatcher.createException());
    }

    /**
     * Test - createException()
     * Check if the method return default error message when empty string or string
     * containing only spaces is given.
     */
    @Test
    public void givenEmptyStringShouldReturnDefaultMessageInArray() {
        String[] expectedMessages = {
                "Default exception message",
                "Finally block reached"
        };
        exceptionCatcher.setExceptionsMessage("");
        assertArrayEquals("givenExceptionMessageShouldThrowExceptions: createException() should return string array of correct messages.",
                expectedMessages, exceptionCatcher.createException());
        exceptionCatcher.setExceptionsMessage("   ");
        assertArrayEquals("givenExceptionMessageShouldThrowExceptions: createException() should return string array of correct messages.",
                expectedMessages, exceptionCatcher.createException());
    }

    /**
     * Test - createException()
     * Check if the expected message does not change by comparing different strings
     * in assertion.
     */
    @Test
    public void givenExceptionMessageShouldReturnCorrectMessage() {
        String[] expectedMessages = {
                "Default exception message",
                "Finally block reached"
        };
        exceptionCatcher.setExceptionsMessage("This is another exception message");
        assertNotEquals("givenExceptionMessageShouldThrowExceptions: createException() should return string array of correct messages.",
                expectedMessages[0], exceptionCatcher.createException()[0]);
    }
}