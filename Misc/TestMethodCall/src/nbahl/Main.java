//Code to determine if a number is prime number or not using three methods
package nbahl;
import java.util.*;



public class Main {

    // main method
    public static void main(String[] args) {
        // write your code here
        int num = 0;
        boolean value;
        num = enterNumber();
        value = isPrime(num);
        printPrime(value, num);
    }

    // input method definition
    public static int enterNumber( )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer to determine whether it is prime: ");
        int num = sc.nextInt();
        return num;
    }

    // prime number method definition
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //print prime number definition
    public static void printPrime(boolean flag, int num)
    {
        if (flag == false)
        {
            System.out.println(num + " is not a prime number");
        }
        else
        {
            System.out.println(num + " is a prime number");
        }
    }
}

