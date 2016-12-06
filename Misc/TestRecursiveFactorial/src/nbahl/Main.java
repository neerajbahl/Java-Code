package nbahl;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int num = 0;
        System.out.println("Enter a positive number (integer) to determine it's factorial: \n");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        while (num < 0)
        {
            System.out.println("Please enter a positive integer only: ");
            num = sc.nextInt();
        }
        System.out.println("\n");

        int resultFact = findFactorial(num);
        System.out.println("The factorial of " + num + " is: " + resultFact + "\n");
    }

    public static int findFactorial (int num) {
        int fact;

        if (num == 0)
        {
            fact = 1;
            return fact;
        }

        fact = num * findFactorial(num - 1);
        return fact;
    }
}
