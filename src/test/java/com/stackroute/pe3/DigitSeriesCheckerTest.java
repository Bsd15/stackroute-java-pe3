package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Java - Practice Exercise - Question 6
 * Write a program to find out if a series of 7 digits are consecutive numbers. To make this
 * easier, assume the digits are a string and use split()
 */
public class DigitSeriesCheckerTest {

    DigitSeriesChecker digitSeriesChecker;

    @Before
    public void setUp() throws Exception {
        digitSeriesChecker = new DigitSeriesChecker();
    }

    @After
    public void tearDown() throws Exception {
        digitSeriesChecker = null;
    }

    /**
     * Test - readDigits()
     * Method should throw NullPointerException when null is given
     */
    @Test(expected = NullPointerException.class)
    public void givenNullShouldThrowError() {
        digitSeriesChecker.readDigits(null);
    }

    /**
     * Test - readDigits()
     * Should throw null pointer exception when an empty string is given
     */
    @Test(expected = NullPointerException.class)
    public void givenEmptyStringShouldThrowNullPointerException() {
        digitSeriesChecker.readDigits("");
    }

    /**
     * Test - readDigits()
     * Should thrown NullPointerException when a string containing only spaces
     * is given
     */
    @Test(expected = NullPointerException.class)
    public void givenOnlySpacesShouldThrowNullPointerException() {
        digitSeriesChecker.readDigits("   ");
    }

    /**
     * Test - getIntArray()
     * Check if the method creates int[] from the string given in
     * readDigits().
     */
    @Test
    public void givenStringShouldReturnIntegerArray() {
        digitSeriesChecker.readDigits("98, 96, 95, 94, 93");
        int[] expectedArray = {98, 96, 95, 94, 93};
        assertArrayEquals("givenStringShouldReturnIntegerArray: check getIntArray() method. It should return an int array.",
                expectedArray, digitSeriesChecker.getIntarray());
    }

    /**
     * Test - checkSeries()
     * Given a string of numbers not in series, the method should return false.
     */
    @Test
    public void givenInputShouldReturnFalse() {
        digitSeriesChecker.readDigits("98, 96, 95, 94, 93");
        assertFalse("givenInputShouldReturnTrue: check checkForSeries(). Should return false.",
                digitSeriesChecker.checkSeries());
        digitSeriesChecker.readDigits("1,2,3,4,5,6,6");
        assertFalse("givenInputShouldReturnTrue: check checkForSeries(). Should return false.",
                digitSeriesChecker.checkSeries());
    }

    /**
     * Test - checkSeries()
     * Given as string of numbers in series, the method should return true.
     */
    @Test
    public void givenInputShouldReturnFalse() {
        digitSeriesChecker.readDigits("54,53,52,51,50,49,48");
        assertTrue("givenInputShouldReturnFalse: check checkForSeries(). Should return true.",
                digitSeriesChecker.checkSeries());
    }
}