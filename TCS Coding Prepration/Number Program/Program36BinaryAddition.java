import java.util.*;
// Imports all classes from the java.util package, including Scanner.

public class Program36BinaryAddition {
    // Declares the class Program36BinaryAddition.

    public static String binaryAddition(String binary1, String binary2) {
        // Method to add two binary numbers and return the result as a String.

        StringBuilder s = new StringBuilder();
        // Stores the binary addition result.
        // The digits are initially added from right to left.

        int carry = 0;
        // Stores the carry generated during binary addition.

        int len1 = binary1.length() - 1;
        // Stores the index of the last digit of the first binary number.

        int len2 = binary2.length() - 1;
        // Stores the index of the last digit of the second binary number.

        while (len1 >= 0 || len2 >= 0) {
            // Continues until all digits from both binary numbers are processed.

            int rem1 = 0;
            // Stores the current digit from the first binary number.
            // It remains 0 if all digits of binary1 are processed.

            if (len1 >= 0) {
                // Checks whether binary1 still has digits to process.

                rem1 = binary1.charAt(len1) - '0';
                // Extracts the current binary digit and converts it from
                // a character ('0' or '1') to an integer (0 or 1).

                len1--;
                // Moves to the previous digit of binary1.
            }

            int rem2 = 0;
            // Stores the current digit from the second binary number.
            // It remains 0 if all digits of binary2 are processed.

            if (len2 >= 0) {
                // Checks whether binary2 still has digits to process.

                rem2 = binary2.charAt(len2) - '0';
                // Extracts the current binary digit and converts it from
                // a character to an integer.

                len2--;
                // Moves to the previous digit of binary2.
            }

            int sum = rem1 + rem2 + carry;
            // Adds the two binary digits and the previous carry.

            if (sum == 3) {
                // 1 + 1 + 1 = 3 in decimal = 11 in binary.

                s.append("1");
                // Stores 1 as the current result digit.

                carry = 1;
                // Stores 1 as the carry.

            } else if (sum == 2) {
                // 1 + 1 + 0 = 2 in decimal = 10 in binary.

                s.append("0");
                // Stores 0 as the current result digit.

                carry = 1;
                // Stores 1 as the carry.

            } else if (sum == 1) {
                // The result digit is 1 and there is no carry.

                s.append("1");

                carry = 0;

            } else {
                // sum == 0, so the result digit is 0 and there is no carry.

                s.append("0");

                carry = 0;
            }
        }

        if (carry > 0) {
            // Checks whether a carry remains after processing all digits.

            s.append("1");
            // Adds the remaining carry to the result.
        }

        return s.reverse().toString();
        // Reverses the result because digits were added from right to left,
        // then converts the StringBuilder to a String and returns it.
    }

    public static void main(String[] args) {
        // Main method where program execution starts.

        Scanner sc = new Scanner(System.in);
        // Creates a Scanner object to take input from the user.

        System.out.println("Enter two binary numbers to add:");
        // Asks the user to enter two binary numbers.

        String binary1 = sc.next();
        // Reads the first binary number.

        String binary2 = sc.next();
        // Reads the second binary number.

        String result = binaryAddition(binary1, binary2);
        // Calls the binaryAddition() method and stores the result.

        System.out.println(
                "The result after adding the two binary numbers is: " + result
        );
        // Displays the binary addition result.

        sc.close();
        // Closes the Scanner object.
    }
}

/*
Binary addition
What it is: Add two binary numbers using binary addition rules.
Example:
  101
+ 011
-----
 1000
So, 101 + 011 = 1000 in binary.
*/