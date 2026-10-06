import java.util.*; // Imports utility classes, including the Scanner class.

public class Program21DuckNumber { // Declares the class Program21DuckNumber.

    // This method counts the number of zeros present in a given number.
    public static int countZero(int num) {

        int count = 0; // Stores the total number of zeros.

        // Continues until all digits are processed.
        while (num > 0) {

            int rem = num % 10; // Extracts the last digit.

            // Checks whether the extracted digit is 0.
            if (rem == 0) {
                count++; // Increases the zero count by 1.
            }

            num /= 10; // Removes the last digit from the number.
        }

        return count; // Returns the total number of zeros.
    }

    public static void main(String[] args) { // Main method where program execution starts.

        Scanner sc = new Scanner(System.in); // Creates a Scanner object for user input.

        // Asks the user to enter a number.
        System.out.print("Enter a number to check whether it is a Duck Number: ");

        int number = sc.nextInt(); // Reads the number entered by the user.

        // Handles negative numbers.
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");

            sc.close(); // Closes the Scanner object.
            return; // Terminates the program.
        }

        // Handles the edge case where the number is 0.
        if (number == 0) {
            System.out.println("0 is not considered a Duck Number.");

            sc.close(); // Closes the Scanner object.
            return; // Terminates the program.
        }

        // Calls the countZero method and stores the number of zeros.
        int count = countZero(number);

        // Checks whether the number contains at least one zero.
        if (count >= 1) {

            // Executes if the number contains at least one zero.
            System.out.println("The given number is a Duck Number.");

        } else {

            // Executes if the number does not contain any zero.
            System.out.println("The given number is not a Duck Number.");
        }
        System.out.println(number);

        sc.close(); // Closes the Scanner object.
    }
}
/*
Duck Number
Definition
A Duck Number is a positive number that contains at least one zero, but the number must not start with zero.
Examples
102 → Duck Number
2050 → Duck Number
120 → Duck Number
123 → Not a Duck Number
For example:
102
It contains 0, so 102 is a Duck Number.
*/