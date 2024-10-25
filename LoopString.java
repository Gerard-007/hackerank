/*
* - Request input from user and represent it as <userInput> - Done
* - Loop through the length of <userInput> with counter set to 0
* - Print counter and append the value to a string variable called <result>
* - Replace value in <userInput> with empty string
* - Increment counter by 2
* - At the end of the loop append what's left of <userInput> to the <result>
*/

import java.util.Scanner;

public class LoopString {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of times: ");
        int T = input.nextInt();
        input.nextLine();  // Consume the leftover newline character

        for(int k = 0; k < T; k++) {
            System.out.print("Enter String: ");
            String S = input.nextLine();  // Read the string

            StringBuilder evenResult = new StringBuilder();
            StringBuilder oddResult = new StringBuilder();

            for (int i = 0; i < S.length(); i++) {
                if (i % 2 == 0) {
                    evenResult.append(S.charAt(i));
                } else {
                    oddResult.append(S.charAt(i));
                }
            }

            String result = String.format("%s %s", evenResult, oddResult);
            System.out.println(result);

            evenResult.setLength(0);
            oddResult.setLength(0);
        }
    }
}

