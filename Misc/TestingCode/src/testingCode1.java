import java.util.Scanner;

/**
 * Created by neerajbahl on 9/2/16.
 */
public class testingCode1 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter a number less than 100: ");
            num = input.nextInt();
        }
        while (num < 0 || num > 100 );
        //while (num >= 0 && num <= 100 ); incorrect boolean expression

    }
}