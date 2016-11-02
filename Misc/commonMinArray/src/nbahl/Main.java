package nbahl;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Find minimum common elements in two arrays. \n");
        int[] A = null;
        int [] B = null;
        int n = 0;
        int m = 0;

        System.out.println("Enter the size of the first array: \n");
        Scanner scan1 = new Scanner(System.in);
        n = scan1.nextInt();

        System.out.println("Enter the size of the second array: \n");
        Scanner scan2 = new Scanner(System.in);
        m = scan2.nextInt();

        A = new int[n];
        B = new int[m];

        for (int i = 0; i < n; i++)
        {
            System.out.print("First array: Enter the value of the element " + i + " : \n");
            Scanner scan3 = new Scanner(System.in);
            A[i] = scan3.nextInt();

        }

        for (int j = 0; j < m; j++)
        {
            System.out.print("Second array: Enter the value of the element " + j + " : \n");
            Scanner scan3 = new Scanner(System.in);
            B[j] = scan3.nextInt();
        }

        //Printing the input array
        System.out.println("\n The input array is : \n");
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));

        //Sorting arrays
        Arrays.sort(A);
        Arrays.sort(B);

        //Printing sorted arrays
        System.out.println("\n The sorted array is: \n");
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));

        int temp = -1, flag = 0;
        for (int k = 0; k < n; k++)
            for (int l = 0; l <m; l++)
            {
                if (A[k] == B[l] && flag == 0)
                {
                    temp = A[k];
                    flag = 1;
                }
            }

        System.out.println("The minimum value that occurs in both arrays is: " + temp);

    }

}

