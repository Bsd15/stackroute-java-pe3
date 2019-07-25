package com.stackroute.pe3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static java.lang.String.join;

/**
 * Practice Exercise - Question 9
 * Write a program to calculate the frequency of the words in a given file
 */
public class WordFrequencyCounter {

    /*
    Should return Null if the file is empty or null.
    Else it should return the key, value pair of word and its occurrence.
     */
    public Map<String, Integer> calculateWordFrequency(String filePath) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(filePath)));
        List<String> stringList = new ArrayList<>();
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        String string = null;
        while ((string = bufferedReader.readLine()) != null) {
            stringList.add(string);
        }
        if ((stringList.isEmpty()) && (string == null || string.isEmpty())){
            return null;
        }
        String[] strings = String.join(" ", stringList).split(" ");
        stringList.clear();
        stringList = Arrays.asList(strings);

        for (String word: strings) {
            stringIntegerMap.put(word, Collections.frequency(stringList, word));
        }
        return stringIntegerMap;
    }

}
