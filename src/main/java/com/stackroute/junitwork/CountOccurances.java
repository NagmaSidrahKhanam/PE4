//1. Write a java program to count the total number of occurrences of a given character in a ​ string
//without using any loop?
//For Example- Java is java again java again count number of occurrence of a in the given ​ string

package com.stackroute.junitwork;
import java.util.HashMap;
//to count occurances of charachters
public class CountOccurances {
    public int characterCount(String inputString,char characterInput){
        return inputString.length()-inputString.replaceAll(String.valueOf(characterInput),"").length();
    }
}
