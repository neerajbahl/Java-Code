// Reference: https://github.com/blakeembrey/code-problems/blob/master/solutions/java/StackMachine.java

package nbahl;

import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Stack<Integer> stack = new Stack <Integer>();
        String stack_input;
        System.out.println("\nEnter a string: \n");
        Scanner scan1 = new Scanner(System.in);
        stack_input = scan1.nextLine();


        if (stack_input.length() != 0)
        {
            for (int i = 0; i < stack_input.length(); i++)
            {
                char value = stack_input.charAt(i);

                if (value >= '0' && value <= '9')
                {
                    stack.push(value - '0');
                    System.out.println("Pushing to stack");
                }
                else if (stack.size() >= 2) {
                    if (value == '+') {
                        int sum = stack.pop() + stack.pop();
                        if (sum < 4096) {
                            stack.push(sum);
                            System.out.println("Adding to stack");
                        } else {
                            System.out.println("\n Error - Overflow - Sum");
                        }

                    }

                    if (value == '*') {
                        int mul = stack.pop() * stack.pop();
                        if (mul < 4096) {
                            stack.push(mul);
                            System.out.println("Multiplying to stack");
                        } else {
                            System.out.println("\n Error - Overflow - Mul");
                        }
                    }
                }
                    else
                    {
                        System.out.println("\n Error - Cannot perform binary operations on single or 0 operands");
                    }
                }
            }
        else
        {
            System.out.println("\n Error - Null String");
        }

        if (stack.size() != 0)
        {
            System.out.println(stack.pop());
        }
        else{
            System.out.println("\n Error - Empty Stack");
        }


      /*  if (stack.size() != 0)
        {
            stack.peek();
        }
        else
        {
            System.out.println("\n Error");
        }


        //System.out.println("\n The output is : \n" + stack_input);

        /*
        char[] charArrayInput = stack_input.toCharArray();
        System.out.println("\nThe character output is: \n" + Arrays.toString(charArrayInput));

        System.out.println("\nThe length of the character string is: \n" + charArrayInput.length);


        for (int i = 0; i < charArrayInput.length; i++)
        {
            char chToken = charArrayInput[i];
            //System.out.println("\nThe first character of the string is: \n" + charArrayInput[0]);

            if (charArrayInput.length == 0)
            {
                System.out.println("\n Error - Null String");
            }

            if (chToken >= '0' && chToken <= '9')
            {
                stack.push(chToken);
                System.out.println("\n This is a number and the number is: " + stack.push(chToken));
            }
            else
            {
                if (stack.size() >= 2) {
                    if (chToken == '+') {
                        Integer sum = (Integer) stack.pop() + (Integer) stack.pop();
                        if (sum <= 4096) {
                            stack.push(sum);
                        } else
                            System.out.println("\n Error - Overflow due to addition");
                    }
                    if (chToken == '*') {
                        Integer mult = (Integer) stack.pop() * (Integer) stack.pop();
                        if (mult <= 4096) {
                            stack.push(mult);
                        } else
                            System.out.println("\n Error - Overflow due to multiplication");
                    }
                }
                else
                {
                    System.out.println("\n Error - Not enough numbers in stack");
                }
            }
        }
*/

    }
}
