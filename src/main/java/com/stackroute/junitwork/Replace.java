//2. Write a program to replace all d with f and all l with t in the given ​ String
//Input: daily dry
//Output: faity fry
//Original ​ string​ : daily dry
//New ​ String​ : faity fry
package com.stackroute.junitwork;

public class Replace {
    //replacing d with f and t with l
    public String replaceCharacters(String inputString){
        if(inputString==null){
            return null;
        }
        String result=inputString.replaceAll("d","f");
        return result.replaceAll("l","t");
    }
}
