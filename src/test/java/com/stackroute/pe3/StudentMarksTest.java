package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

/**
 * Java - Practice Exercise - 3
 * Question - 1
 * Create a class called StudentMarks, which prompts user for the number of students, reads
 * it from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user
 * for the grades of each of the students and saves them in an int array called stuGrades. Your
 * program shall check that the grade is between 0 and 100 else has to trow an error message.
 */
public class StudentMarksTest {

    StudentMarks studentMarks;

    @Before
    public void setUp() {
        studentMarks = new StudentMarks();
    }

    @After
    public void tearDown() {
        studentMarks = null;
    }

    /*
    * Test numberOfStudents()
    * Check if the input given is validated and give Exception for other data
    * types.
    */
    @Test(expected = InputMismatchException.class)
    public void givenWrongInputShouldThrowError() {
        studentMarks.setNumberOfStudents("test string");
    }

    @Test
    public void givenNullShouldThrowError() {
        studentMarks.setNumberOfStudents(null);
    }

    /*
    * Test - numberOfStudents()
    * Check if method throws error when 0 or negative values are given
    */
    @Test(expected = Exception.class)
    public void givenZeroShouldThrowError() {
        studentMarks.setNumberOfStudents(0);
    }

    @Test
    public void givenNegativeValueShouldThrowError() {
        studentMarks.setNumberOfStudents(-1);
    }

    @Test
    public void givenStudentGradesShouldReturnTrue() {
        studentMarks.setNumberOfStudents(5);
        for (int i = 0; i < studentMarks.getNumberOfStudents(); i++) {

        }
    }
}