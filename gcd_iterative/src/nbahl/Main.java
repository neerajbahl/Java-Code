package nbahl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 0, b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of first number: ");
        a = sc.nextInt();
        System.out.println("Enter the value of second number: ");
        b = sc.nextInt();
        int valueGCD = gcd(a, b);
        System.out.println("The value of GCD for " + a + " and " + b + " is : " + valueGCD);

    }

    public static int gcd(int a, int b) {
        int valueGCD = 1, max_num = 0, min_num = 0;
        if (a > b) {
            max_num = a;
            min_num = b;
        } else if (b > a) {
            max_num = b;
            min_num = a;
        } else if (a == b) {
            max_num = a;
            min_num = b;
        } else {
            max_num = a;
            min_num = b;
        }

        for (int i = 1; i <= max_num; i++) {
            if (max_num % i == 0 && min_num % i == 0) {
                valueGCD = i;
            }
        }
        return valueGCD;
    }
}