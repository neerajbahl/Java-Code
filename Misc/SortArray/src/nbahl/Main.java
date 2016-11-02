/*
Author: Neeraj Bahl (nbahl@asu.edu)
Date: 2/18/2016
Version: 1.0
References:
1) http://www.homeandlearn.co.uk/java/sorting_arrays.html
2) http://www.leepoint.net/data/arrays/arrays-ex-reverse.html
3) http://stackoverflow.com/
 */

package nbahl;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] my_array;
        my_array = new int[5];

        // initializing the arrays
        my_array[0] = 12;
        my_array[1] = 9;
        my_array[2] = -23;
        my_array[3] = 17;
        my_array[4] = 3;

        // printing the array as it is
        System.out.println("Original Array: \n");
        for (int i = 0; i < my_array.length; i++) {
            System.out.println("my_array [" + i + "]"+ my_array[i]);
        }

        System.out.println("\n");

        // Sorting the array
        Arrays.sort(my_array);

        // printing the sorted array
        System.out.println("Sorted Array: \n");
        for (int i = 0; i < my_array.length; i++) {
            System.out.println("my_array [" + i + "]"+ my_array[i]);
        }

        System.out.println("\n");

        //Changing the order of the array to descending order

        int ctr_left = 0;
        int ctr_right = my_array.length - 1;
        int temp;

        while (ctr_left < ctr_right)
        {
            temp = my_array[ctr_left];
            my_array[ctr_left] = my_array[ctr_right];
            my_array[ctr_right] = temp;
            ctr_left++;
            ctr_right--;
        }

        // printing the sorted array in descending order
        System.out.println("Sorted Array in descending order: \n");
        for (int i = 0; i < my_array.length; i++) {
            System.out.println("my_array [" + i + "]"+ my_array[i]);
        }
    }
}
