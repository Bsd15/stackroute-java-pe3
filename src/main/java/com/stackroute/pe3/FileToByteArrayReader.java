package com.stackroute.pe3;

import java.io.*;

/**
 * Practice Exercise - Question 8
 * Write a program to find all files of a folder and select only
 * given extension fileName and read content of this file using byte array
 */
public class FileToByteArrayReader {

    public byte[] readFile(String fileName, String extension) {
        String text = "";
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader;
        try {
            file = new File(fileName.concat(".").concat(extension));
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String oneLineText;
            System.out.println(bufferedReader.readLine());
            System.out.println(32);
            while ((oneLineText = bufferedReader.readLine()) != null){
                text = text.concat(oneLineText);
                System.out.println(text);
            }
            if (text.trim().isEmpty()){
                throw new NullPointerException();
            }

        }catch (Exception e){

//            throw fileNotFoundException;
//            throw new FileNotFoundException();

        }
        finally {
            file = null;
            fileReader = null;
            bufferedReader = null;
        }
        return text.getBytes();
    }
}
