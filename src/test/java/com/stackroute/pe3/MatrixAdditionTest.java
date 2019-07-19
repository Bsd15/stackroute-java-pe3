package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Java - Practise Exercise 3
 * Question 2
 * Write a program to compute the addition of two matrix, Read the number of rows and
 * columns as input, also the values of each matrix
 */
public class MatrixAdditionTest {

    MatrixAddition matrixAddition;

    @Before
    public void setUp() {
        matrixAddition = new MatrixAddition();
    }

    @After
    public void tearDown() {
        matrixAddition = null;
    }

    /**
     * Test readNumberOfRows()
     * Test readNumberOfColumns()
     * Check if method returns true for valid input.
     */
    @Test
    public void givenIntShouldReturnTrue() {
        assertTrue("givenIntShouldReturnTrue: check readNumberOfRows().",
                matrixAddition.readNumberOfRows(3));
        assertTrue("givenIntShouldReturnTrue: check readNumberOfColumns().",
                matrixAddition.readNumberOfColumns(3));
    }

    /**
     * Test readNumberOfRows
     * Test readNumberOfColumns()
     * Check if the method returns false when 0, negative values or null is given
     */
    @Test
    public void givenWrongInputShouldReturnFalse() {
        /*Check readNumberOfRows*/
        assertFalse("givenIntShouldReturnTrue: check readNumberOfRows(). Should return false",
                matrixAddition.readNumberOfRows(0));
        assertFalse("givenIntShouldReturnTrue: check readNumberOfRows(). Should return false",
                matrixAddition.readNumberOfRows(-1));
        assertFalse("givenIntShouldReturnTrue: check readNumberOfRows(). Should return false.",
                matrixAddition.readNumberOfRows(null));

        /*check readNumberOfColumns*/
        assertFalse("givenIntShouldReturnTrue: check readNumberOfColumns(). Should return false",
                matrixAddition.readNumberOfColumns(0));
        assertFalse("givenIntShouldReturnTrue: check readNumberOfColumns(). Should return false",
                matrixAddition.readNumberOfColumns(-1));
        assertFalse("givenIntShouldReturnTrue: check readNumberOfColumns(). Should return false",
                matrixAddition.readNumberOfColumns(null));
    }



}