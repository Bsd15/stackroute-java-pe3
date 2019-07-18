package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

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
}