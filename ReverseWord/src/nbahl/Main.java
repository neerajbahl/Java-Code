/*
Problem: To reverse the words in a string, assuming that the  words are separated by a single space
Problem Source: https://www.interviewcake.com/question/java/reverse-words
Author: Neeraj Bahl
Date: December 7, 2016
Version: 1.0
Status: In Progress
*/



package nbahl;

public class Main {

    public static void main(String[] args) {

        String text = "Java is a platform independent language";
        reverseWords(text);

    }

    public static void reverseWords(String str)
    {

        // convert the string to a character array
        char [] textcharArray = str.toCharArray();

        //print the original string
        System.out.println("Original string is: ");
        System.out.println(textcharArray);
        System.out.println("The length of teh string is: "  + textcharArray.length);

        // Reversed the complete string
        for (int i = 0; i < textcharArray.length/2; i++)
        {
            char temp = textcharArray [i];
            textcharArray[i] = textcharArray[textcharArray.length - i - 1];
            textcharArray[textcharArray.length - i - 1] = temp;
        }

        //print the reversed string
        System.out.println("Reverse string is: ");
        System.out.println(textcharArray);

        // reverse characters in each word in the reversed string
        // WIP
    }
}

