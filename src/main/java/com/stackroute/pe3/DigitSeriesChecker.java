package com.stackroute.pe3;

import java.util.ArrayList;
import java.util.List;

public class DigitSeriesChecker {
    private String digitsInString = null;
    private int[] intArray = null;
    public void readDigits(String digitsInString) {
        if (digitsInString == null || digitsInString.isEmpty() || digitsInString.trim().isEmpty()){
            throw new NullPointerException();
        }
        else {
            this.digitsInString = digitsInString;
            this.intArray = getIntarray();
        }
    }


    public int[] getIntarray(){
        String[] digitsInStringArray = this.digitsInString.split(", |,");
        List<Integer> digitsInList = new ArrayList<>();
        for (String digit: digitsInStringArray){
            digitsInList.add(Integer.parseInt(digit));
        }
        int[] digitsInArray = new int[digitsInList.size()];
        for (int i = 0; i < digitsInList.size(); i++){
            digitsInArray[i] = digitsInList.get(i);
        }
        this.intArray = digitsInArray;
        return intArray;
    }

    public boolean checkSeries() {
        boolean boo = true;
        for (int i = 0; i < this.intArray.length - 1; i++){
            if ((this.intArray[i] - this.intArray[i + 1]) != 1){
                boo = false;
                break;
            }
        }
        return boo;
    }
}
