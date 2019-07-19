package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.assertNull;

/**
 * Practice Exercise - Question 8
 * Write a program to find all files of a folder and select only given extension fileName and
 * read content of this file using byte array
 */
public class FileToByteArrayReaderTest {

    private FileToByteArrayReader fileToByteArrayReader;

    @Before
    public void setUp() {
        fileToByteArrayReader = new FileToByteArrayReader();
    }

    @After
    public void tearDown() {
        fileToByteArrayReader = null;
    }

    /**
     * Test readFile() by giving a file name and extension method should return
     * contents of the file in byte array.
     */
    @Test
    public void givenFileNameAndExtensionShouldReturnByteArray() {
        /*Expected test string which is converted into byte array*/
        String testString = "Hello. This is a test string";
        byte[] testByteArray = testString.getBytes();
        assertArrayEquals("testReadFileSuccessGivenFileNameAndExtensionShouldReturnByteArray: check readFile()",
                testByteArray, fileToByteArrayReader.readFile("test", "txt"));
    }


    /**
     * Test for readFile() to throw FileNotFoundException
     * when the wrong(non-existent) file path is given.
     */
    @Test(expected = FileNotFoundException.class)
    public void givenFileNameAndExtensionShouldReturnFileNotFoundException() {
        fileToByteArrayReader.readFile("test1", "txt");
    }

    /**
     * Test readFile() method with an empty file. The method should return null as
     * the file is empty.
     */
    @Test
    public void givenFileNameAndExtensionWithAnEmptyFileShouldReturnNull() {
        assertNull("givenFileNameAndExtensionWithAnEmptyFileShouldReturnNull: check readFile(). The method should read a empty file and return null"
                ,fileToByteArrayReader.readFile("nullFileTest","txt"));
    }
}