package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Practice Exercise - Question 9
 * Write a program to calculate the frequency of the words in a given file
 */
public class WordFrequencyCounterTest {
    private WordFrequencyCounter wordFrequencyCounter;
    @Before
    public void setUp() {
        wordFrequencyCounter = new WordFrequencyCounter();
    }

    @After
    public void tearDown() {
        wordFrequencyCounter = null;
    }

    /**
     * Test should return expected word count when
     * FilesDemo.txt is given as input.
     */
    @Test
    public void givenFilePathShouldReturnWordCount() throws IOException {
        HashMap<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("i", 3);
        expectedWordCount.put("am", 1);
        expectedWordCount.put("like", 1);
        expectedWordCount.put("have", 1);
        expectedWordCount.put("a", 2);
        assertEquals("givenFilePathShouldReturnWordCount: check calculateWordFrequency()",
                expectedWordCount, wordFrequencyCounter.calculateWordFrequency("test_files/FileDemo.txt"));
    }

    /**
     * Test - calculateWordFrequency()
     * Method should return null if the file which is read is empty.
     */
    @Test
    public void givenEmptyFileShouldReturnNull() throws IOException {
        assertNull("givenEmptyFileShouldReturnNull: check getFileContentsAsString(). Method should return null.",
                wordFrequencyCounter.calculateWordFrequency("test_files/emptyDemo.txt"));
    }

    /**
     * Test - calculateWordFrequency()
     * When a file containing only spaces is given, the method should return null.
     */
    @Test
    public void givenFileWithOnlySpacesShouldReturnNull() throws IOException {
        assertNull("givenEmptyFileShouldReturnNull: check getFileContentsAsString(). Method should return null.",
                wordFrequencyCounter.calculateWordFrequency("test_files/FileDemo1.txt"));
    }

    /**
     * Test whether the method return null when a wrong file path is given.
     */
    @Test(expected = FileNotFoundException.class)
    public void givenFilePathShouldReturnNull() throws IOException {
        /*Calling this method should throw FileNotFoundException*/
        wordFrequencyCounter.calculateWordFrequency("test_file.txt");
    }
}