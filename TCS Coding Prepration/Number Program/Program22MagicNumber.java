import java.util.*; // Imports utility classes, including the Scanner class.

public class Program22MagicNumber { // Declares the class Program22MagicNumber.

    // This method calculates and returns the sum of the digits of a number.
    public static int digitSum(int num) {

        int sum = 0; // Stores the sum of all digits.

        // Continues until all digits are processed.
        while (num > 0) {

            int rem = num % 10; // Extracts the last digit.

            sum += rem; // Adds the extracted digit to the sum.

            num /= 10; // Removes the last digit from the number.
        }

        return sum; // Returns the sum of all digits.
    }

    // This method checks whether the given number is a Magic Number.
    public static boolean magicNumber(int num) {

        // Handles invalid input.
        // Magic Numbers are considered positive integers.
        if (num <= 0) {
            return false;
        }

        // Continues until the number becomes a single digit.
        while (num > 9) {

            // Replaces num with the sum of its digits.
            num = digitSum(num);
        }

        // Returns true if the final single digit is 1.
        return num == 1;
    }

    public static void main(String[] args) { // Main method where program execution starts.

        Scanner sc = new Scanner(System.in); // Creates a Scanner object for user input.

        // Asks the user to enter a number.
        System.out.print("Enter a number to check whether it is a Magic Number: ");

        int number = sc.nextInt(); // Reads the number entered by the user.

        // Handles 0 and negative numbers.
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");

            sc.close(); // Closes the Scanner object.
            return; // Terminates the program.
        }

        // Calls the magicNumber method to check the number.
        boolean check = magicNumber(number);

        // Checks whether the number is a Magic Number.
        if (check) {

            // Executes if the number is a Magic Number.
            System.out.println("The given number is a Magic Number.");

        } else {

            // Executes if the number is not a Magic Number.
            System.out.println("The given number is not a Magic Number.");
        }

        sc.close(); // Closes the Scanner object.
    }
}

/*
Magic Number
Definition
A Magic Number is a number whose digits are repeatedly added until a single digit is obtained, and that final digit is 1.
Example: 1729
Add the digits:
1+7+2+9=19
Since 19 is not a single digit, add again:
1+9=10
Again:
1+0=1
The final single digit is 1.
Therefore, 1729 is a Magic Number.
 */