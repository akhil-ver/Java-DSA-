import java.util.Scanner; // Imports the Scanner class for user input.

public class Program19SpyNumber { // Declares the class Program19SpyNumber.

    // This method calculates and returns the product of the digits of a number.
    public static int productOfDigit(int num) {

        int product = 1; // Stores the product of all digits.

        // Continues until all digits are processed.
        while (num > 0) {

            int rem = num % 10; // Extracts the last digit.

            product *= rem; // Multiplies the product by the extracted digit.

            num /= 10; // Removes the last digit from the number.
        }

        return product; // Returns the product of all digits.
    }

    // This method calculates and returns the sum of the digits of a number.
    public static int sumOfDigit(int num) {

        int sum = 0; // Stores the sum of all digits.

        // Continues until all digits are processed.
        while (num > 0) {

            int rem = num % 10; // Extracts the last digit.

            sum += rem; // Adds the extracted digit to sum.

            num /= 10; // Removes the last digit from the number.
        }

        return sum; // Returns the sum of all digits.
    }

    public static void main(String[] args) { // Main method where program execution starts.

        Scanner sc = new Scanner(System.in); // Creates a Scanner object for user input.

        // Asks the user to enter a number.
        System.out.print("Enter a number to check whether it is a Spy Number: ");

        int number = sc.nextInt(); // Reads the number entered by the user.

        // Handles negative numbers.
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");

            sc.close(); // Closes the Scanner object.
            return; // Terminates the program.
        }

        // Handles the edge case where the number is 0.
        if (number == 0) {
            System.out.println("0 is not considered a Spy Number.");

            sc.close(); // Closes the Scanner object.
            return; // Terminates the program.
        }

        // Calculates the sum of the digits.
        int sum = sumOfDigit(number);

        // Calculates the product of the digits.
        int product = productOfDigit(number);

        // Checks whether the sum and product of the digits are equal.
        if (sum == product) {

            // Executes if the number is a Spy Number.
            System.out.println("The given number is a Spy Number.");

        } else {

            // Executes if the number is not a Spy Number.
            System.out.println("The given number is not a Spy Number.");
        }

        sc.close(); // Closes the Scanner object.
    }
}

/*
Spy Number
Definition
A Spy Number is a number in which the sum of its digits is equal to the product of its digits.
Main Condition
Sum of digits=Product of digits
​	
 
Example: 123
Sum of digits:
1+2+3=6
Product of digits:
1×2×3=6
Since:
6=6
123 is a Spy Number.
*/