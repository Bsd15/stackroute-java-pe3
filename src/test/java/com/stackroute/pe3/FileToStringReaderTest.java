package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

/**
 * Java - Practice Exercise 3
 * Question 9
 * Write a program to read the content of a text file, convert the content in upper case and print
 * the same in console along with the length of the file.
 */
public class FileToStringReaderTest {
    FileToStringReader fileToStringReader;

    @Before
    public void setUp() throws Exception {
        fileToStringReader = new FileToStringReader();
    }

    @After
    public void tearDown() throws Exception {
        fileToStringReader = null;
    }

    /**
     * Test - readFile()
     * Method should throw a FileNotFoundException when a wrong file path is
     * given.
     */
    @Test(expected = FileNotFoundException.class)
    public void givenWrongFilePathShouldThrowFileNotFoundException() {
        fileToStringReader.readFile("test1.txt");
    }

    /**
     * Test - readFile()
     * Method should throw a NullPointerException when a null is
     * given.
     */
    @Test(expected = NullPointerException.class)
    public void givenWrongFilePathShouldThrowFileNotFoundException() {
        fileToStringReader.readFile(null);
    }

    /**
     * Test - readFile()
     * Method should throw a FileNotFoundException when a empty string is
     * given.
     */
    @Test(expected = FileNotFoundException.class)
    public void givenWrongFilePathShouldThrowFileNotFoundException() {
        fileToStringReader.readFile("");
    }

    /**
     * Test - readFile()
     * Method should throw a FileNotFoundException when a only spaces are
     * given.
     */
    @Test(expected = FileNotFoundException.class)
    public void givenWrongFilePathShouldThrowFileNotFoundException() {
        fileToStringReader.readFile("   ");
    }

    /**
     * Test - getFileContentsAsString()
     * Method should return the contents in the file as string in uppercase.
     */
    @Test
    public void givenFilePathShouldReturnContentsInStringInUpperCase() {
        fileToStringReader.readFile("test2.txt");
        String expectedString = "THIS IS A TEST FOR QUESTION 9";
        assertEquals("givenFilePathShouldReturnContentsInStringInUpperCase: check getFileContentsAsString(). Should return file contents in upper case.",
                expectedString, fileToStringReader.getFileContentsAsString());
    }

    /**
     * Test - getFileContentsAsString()
     * Method should return null if the file which is read is empty.
     */
    @Test
    public void givenEmptyFileShouldReturnNull() {
        fileToStringReader.readFile("emptyFile.txt");
        assertNull("givenEmptyFileShouldReturnNull: check getFileContentsAsString(). Method should return null.",
                fileToStringReader.getFileContentsAsString());
    }

    /**
     * Test - getFileContentsAsString()
     * When a file containing only spaces is given, the method should return null.
     */
    @Test
    public void givenFileWithOnlySpacesShouldReturnNull() {
        fileToStringReader.readFile("onlySpacesFile.txt");
        assertNull("givenEmptyFileShouldReturnNull: check getFileContentsAsString(). Method should return null.",
                fileToStringReader.getFileContentsAsString());
    }

    /**
     * Test - getFileLength()
     * Check if the file return the length of the file.
     */
    @Test
    public void givenFilePathShouldReturnLengthOfFile() {
        fileToStringReader.readFile("test2.txt");
        int expectedLength = 29;
        assertEquals("givenFilePathShouldReturnLengthOfFile: check getFileLength(). Should return a int.",
                expectedLength, fileToStringReader.getFileLenght());
    }

    /**
     * Test - getFileLength()
     * Check if the file returns null as the length of the file when a empty file is given.
     */
    @Test
    public void givenEmptyFileShouldReturnNull() {
        fileToStringReader.readFile("emptyFile.txt");
        int expectedLength = 29;
        assertNull("givenEmptyFileShouldReturnNull: check getFileLength(). Should return a int.",
                fileToStringReader.getFileLenght());
    }
}