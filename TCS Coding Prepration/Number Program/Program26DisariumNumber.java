import java.util.*; // Imports utility classes, including the Scanner class.

public class Program26DisariumNumber {

    // This method counts and returns the number of digits in the given number.
    public static int digitCount(int num) {

        // Handles the edge case where the number is 0.
        if (num == 0) {
            return 1;
        }

        int count = 0; // Stores the total number of digits.

        // Continues until all digits are processed.
        while (num > 0) {
            count++; // Increases the digit count by 1.
            num /= 10; // Removes the last digit.
        }

        return count; // Returns the total number of digits.
    }

    // This method calculates the Disarium sum of a number.
    public static int disariumNumber(int num) {

        // Stores the original number of digits.
        int countDigit = digitCount(num);

        int sum = 0; // Stores the sum of digits raised to their positions.

        // Handles the edge case where the number is 0.
        if (num == 0) {
            return 0;
        }

        // Processes the digits from right to left.
        while (num > 0) {

            int rem = num % 10; // Extracts the last digit.

            // Adds the digit raised to its corresponding position.
            sum += (int) Math.pow(rem, countDigit);

            countDigit--; // Moves to the previous position.

            num /= 10; // Removes the last digit.
        }

        return sum; // Returns the calculated Disarium sum.
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creates a Scanner object for input.

        // Asks the user to enter a number.
        System.out.print(
            "Enter a number to check whether it is a Disarium Number: "
        );

        int number = sc.nextInt(); // Reads the number entered by the user.

        // Handles negative numbers.
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");

            sc.close(); // Closes the Scanner object.
            return; // Terminates the program.
        }

        // Calculates the Disarium sum.
        int sum = disariumNumber(number);

        // Checks whether the calculated sum is equal to the original number.
        if (sum == number) {

            System.out.println(
                "The given number is a Disarium Number."
            );

        } else {

            System.out.println(
                "The given number is not a Disarium Number."
            );
        }

        sc.close(); // Closes the Scanner object.
    }
}

/*

Disarium Number
Definition
A Disarium Number is a number in which the sum of each digit raised to its position is equal to the original number.
Positions are counted from left to right, starting from 1.
Example: 135
1 
1
 +3 
2
 +5 
3
 
=1+9+125
=135
Since:
135=135
135 is a Disarium Number.

*/