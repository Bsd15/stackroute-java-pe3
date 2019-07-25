package com.stackroute.pe3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileToStringReader {
    File file;
    FileReader fileReader;
    BufferedReader bufferedReader;

    /*
    Should throw FileNot Found exception if the file not exist.
     */
    public void readFile(String path) throws IOException{
        file = new File(path);
        fileReader = new FileReader(file);
        bufferedReader = new BufferedReader(fileReader);
    }

    /*
    Should return the String readed from the file.
    if the file is empty or null it should return null.
     */

    public String getFileContentsAsString() throws IOException{
        StringBuilder stringBuilder = new StringBuilder();
        String string = null;
        while ((string = bufferedReader.readLine()) != null) {
            stringBuilder.append(string.toUpperCase());
        }
        if (stringBuilder.toString().trim().isEmpty()){
            return null;
        }
        return stringBuilder.toString();
    }

    /*
    should return the length of the string in file.
     */
    public int getFileLenght() throws IOException {
        return getFileContentsAsString().length();
    }

}
