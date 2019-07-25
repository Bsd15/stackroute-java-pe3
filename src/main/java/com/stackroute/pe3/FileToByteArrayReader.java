package com.stackroute.pe3;

import java.io.*;

/**
 * Practice Exercise - Question 8
 * Write a program to find all files of a folder and select only
 * given extension fileName and read content of this file using byte array
 */
public class FileToByteArrayReader {

    /*
    Returns byte[] of a file, if the file exist and if it holds some value.
    Else it should return Null pointer exception if the file holds null value.
     */
    public byte[] readFile(String fileName, String extension) throws IOException{
        String text = "";
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader;
            file = new File(fileName.concat(".").concat(extension));
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String oneLineText;
            while ((oneLineText = bufferedReader.readLine()) != null){
                text = text.concat(oneLineText);
            }
            if (text.trim().isEmpty()){
                return null;
            }
        return text.getBytes();
    }
}
