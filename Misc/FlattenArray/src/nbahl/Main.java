/*
Method to flatten matrix
Author: Neeraj Bahl 
Date: April 11, 2016
Version: 1.0
 */

package nbahl;

import java.util.*;
import java.lang.*;

public class Main {

    // method to flatten matrix
    public static List<Integer> matrix_flatten (Object[] input_numbers){

            //checking if the list of numbers is null
            if (input_numbers == null) return null;

            //declaring list of integers for the output
            List<Integer> output_Numbers = new ArrayList<Integer>();

            // this for loop will run for each object in the inout list
            for (Object i : input_numbers) {
                // if the element is an integer, it will add to the output list
                if (i instanceof Integer) {
                    output_Numbers.add((Integer) i);
                        // else if the elememnt is a list, it will recursivley call itlsef
                } else
                // this will remove all null values
                if (i == null)
                {
                    //do nothing. Neither we do add to the output list nor do we recursively call the function
                }
                // this will recursively call the matrix_flatten function
                else
                {
                    output_Numbers.addAll(matrix_flatten((Object[]) i));
                }
            }

            return output_Numbers;
        }

    public static void main(String[] args) {
        // instantiating a new object of the Main class that includes the
        Main myMethod = new Main();


        // Here we test wheteher the method works on three level of nesting of array
        System.out.println("Three level nested arrays tested");
        System.out.println(myMethod.matrix_flatten(new Object[]{1, null, 8,new Object[]{0,new Object[]{3, 4, 5}},6,7}));
        System.out.println("\n");

        // Here we test whether the method works on two level of nesting of array
        System.out.println("Two level nested arrays tested");
        System.out.println(myMethod.matrix_flatten(new Object[]{9, null, 6, new Object[]{ 1, 2, null, 3}, 6, 7}));
        System.out.println("\n");

        // Here we test whether the method works if we pass empty matrix
        System.out.println("Single level nested arrays tested");
        System.out.println(myMethod.matrix_flatten(new Object[]{9, 8, 7, null, 6, 5, 4, 3, 2, 1}));
        System.out.println("\n");

        System.out.println("Empty array tested");
        // Here we test whether the method works if we pass empty matrix
        System.out.println(myMethod.matrix_flatten(new Object[]{}));
        System.out.println("\n");

        System.out.println("Passing null object tested");
        // Here we test whether the method works if we pass null
        System.out.println(myMethod.matrix_flatten(null));
        System.out.println("\n");

    }
}