package nbahl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int dividend = 0, divisor = 0, remainder = 0, result = 0;
        Scanner scan1 = new Scanner(System.in);


        System.out.println("\n Enter the dividend value: \n ");
        dividend = scan1.nextInt();

        System.out.println("\n Enter the divisor value: \n ");
        divisor = scan1.nextInt();

        while (dividend >= divisor)
        {
            remainder = dividend - divisor;
            dividend = remainder;
            result++;
        }

        System.out.println("\n Result is : " + result);
        System.out.println("\n Remainder is : " + remainder);

    }
}
