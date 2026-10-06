import java.util.*; 
// Imports all classes from the java.util package, including Scanner.

public class Program32RemoveADigit {
    // Declares the class Program32RemoveADigit.

    public static int removeDigit(int num, int remove) {
        // Method to remove all occurrences of a specified digit.

        // Handles the special case when the number is 0.
        if (num == 0) {
            // If the digit to remove is 0, the result is also 0.
            if (remove == 0) {
                return 0;
            }

            // Otherwise, the number remains 0.
            return 0;
        }

        boolean isNegative = num < 0;
        // Checks whether the original number is negative.

        num = Math.abs(num);
        // Converts the number to positive for easier digit processing.

        int newNumber = 0;
        // Stores the number after removing the specified digit.

        int place = 1;
        // Stores the place value: 1, 10, 100, and so on.

        while (num > 0) {
            // Repeats until all digits are processed.

            int rem = num % 10;
            // Extracts the last digit.

            if (rem != remove) {
                // Checks whether the current digit should be kept.

                newNumber = newNumber + rem * place;
                // Adds the digit at its correct position.

                place *= 10;
                // Moves to the next place value only when a digit is kept.
            }

            num /= 10;
            // Removes the last digit.
        }

        // Restores the negative sign if the original number was negative
        // and at least one digit remains.
        if (isNegative && newNumber != 0) {
            newNumber = -newNumber;
        }

        return newNumber;
        // Returns the final number.
    }

    public static void main(String[] args) {
        // Main method where program execution starts.

        Scanner sc = new Scanner(System.in);
        // Creates a Scanner object to take input from the user.

        System.out.print("Enter a number: ");
        // Asks the user to enter a number.

        int number = sc.nextInt();
        // Reads the number entered by the user.

        System.out.print("Enter the digit to remove: ");
        // Asks the user to enter the digit to remove.

        int remove = sc.nextInt();
        // Reads the digit to be removed.

        // Checks whether the entered value is a valid digit.
        if (remove < 0 || remove > 9) {

            System.out.println("Invalid input. Please enter a digit from 0 to 9.");

        } else {

            int result = removeDigit(number, remove);
            // Calls the method and stores the result.

            System.out.println(
                "The number after removing the digit is: " + result
            );
            // Displays the result.
        }

        sc.close();
        // Closes the Scanner object.
    }
}
/*

Remove a digit
What it is: Remove a specific digit from a number.
Example:
Number = 123423
Remove digit 2
Result = 1343

*/