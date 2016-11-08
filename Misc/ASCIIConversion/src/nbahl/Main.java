package nbahl;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        int intASCIIValue = 0;
        char charASCIIValue = 'x';
        int choice = 0;
        char quitChoice = 'a';
    do {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 if you want to convert the ASCII code to char or 2 " +
                "to convert from char to ASCII code: ");
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter an ASCII Code to convert to char: ");
            intASCIIValue = sc.nextInt();
            charASCIIValue = convertIntToChar(intASCIIValue);
            System.out.println("The value of the character corresponding to " + intASCIIValue + " is: " + charASCIIValue);
        } else if (choice == 2) {
            System.out.print("Enter a char value to convert to ASCII code: ");
            charASCIIValue = sc.next(".").charAt(0);
            intASCIIValue = convertCharToInt(charASCIIValue);
            System.out.println("The value of the ASCII code corresponding to " + charASCIIValue + " is: " + intASCIIValue);
        } else {
            System.out.print("You have entered an invalid input!");
        }
        System.out.print("Enter 'c' to continue or 'q' to quit: ");
        quitChoice = sc.next(".").charAt(0);
    } while (quitChoice != 'q');

    }

    public static char convertIntToChar(int intASCIIValue)
    {
        char charResult = ((char) intASCIIValue);
        return charResult;

    }

    public static int convertCharToInt(char charASCIIValue)
    {
        int intResult = ((int) charASCIIValue);
        return intResult;
    }
}
