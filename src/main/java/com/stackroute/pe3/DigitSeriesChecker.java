package com.stackroute.pe3;

import java.util.ArrayList;
import java.util.List;

public class DigitSeriesChecker {
    private String digitsInString = null;
    private int[] intArray = null;

    /*
    Should return null pointer exception if the passed value is null or empty.
    Else the passed value should assigned to a variable.
     */
    public void readDigits(String digitsInString) {
        if (digitsInString == null || digitsInString.isEmpty() || digitsInString.trim().isEmpty()){
            digitsInString.trim().charAt(2);
        }
        else {
            this.digitsInString = digitsInString;
            this.intArray = getIntarray();
        }
    }


    /*
    Splits the string and stores the digits in int array,
     and it should return it.
     */
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

    /*
    Should return true if the digits are in series
    else return false.
     */
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
