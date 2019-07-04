//3. Write a program that ​ sets​ up a ​ String​ variable containing a paragraph of text of your choice.
//a. Extract the words from the text and sort them into alphabetical order.
//b. Display the sorted list of words.

package com.stackroute.junitwork;
import java.util.*;
public class Sort {

    public String[] sortWordsInParagraph(String paragraph){
        if(paragraph==null)
        {
            return null;
        }
        String [] required= paragraph.split("[\\s,]+");
        Arrays.sort(required); //sorting the words

        return required;
    }
}
