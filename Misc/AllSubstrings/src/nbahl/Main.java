package nbahl;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String input = "abcde";

        int inputLength = input.length();
        System.out.println(inputLength);

        int numofSubstrings = (input.length()*(input.length() + 1))/2;
        int counter = 0;

        /*
        for (int i = 1; i <= input.length(); i++)
        {

            for (int j = 0; j < i; j++)
            {
                System.out.println(input.substring(j,i));
                counter++;
            }
        }*/

        // print lexicographically (alphabetically)

        for (int i = 0; i < input.length(); i++)
        {
            for (int j = i+1; j <= input.length(); j++)
            {
                System.out.println(input.substring(i,j));
                counter++;
            }
        }

        System.out.println(counter);
    }
}

//print lexicographically when input is like "dcbae" -- Sort

// original problem - find length of longest substring without repeating characters

