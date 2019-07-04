//5. Write a program with the implementation of ​ Regular Expression​ to find the presence of the name
//Harry in a ​ string​ .
//Input: This is Harry.
//Output: Is Harry here ? true
//Input : This is Henry.
//Output: Is Harry here ? False

package com.stackroute.junitwork;
//search the name
public class SearchName {
    public String searchHarry(String input) {
        if (input.matches("(?i).*Harry.*")) {
            return "Is Harry here ? true";
        } else {
            return "Is Harry here ? false";
        }
    }
}
