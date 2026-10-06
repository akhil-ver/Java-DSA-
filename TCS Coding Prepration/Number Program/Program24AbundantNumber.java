import java.util.*; // Imports utility classes, including the Scanner class.

public class Program24AbundantNumber { // Declares the class Program24AbundantNumber.

    // This method calculates and returns the sum of the proper divisors
    // of the given number.
    public static int sumDivisor(int num) {

        int sum = 0; // Stores the sum of proper divisors.

        // Loops from 1 to num - 1.
        // A proper divisor is a divisor smaller than the number itself.
        for (int i = 1; i < num; i++) {

            // Checks whether i divides num completely.
            if (num % i == 0) {

                // Adds the divisor to the sum.
                sum += i;
            }
        }

        return sum; // Returns the sum of all proper divisors.
    }

    public static void main(String[] args) { // Main method where program execution starts.

        Scanner sc = new Scanner(System.in); // Creates a Scanner object for user input.

        // Asks the user to enter a number.
        System.out.print("Enter a number to check whether it is an Abundant Number: ");

        int number = sc.nextInt(); // Reads the number entered by the user.

        // Handles 0 and negative numbers.
        // Abundant Numbers are positive integers.
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");

            sc.close(); // Closes the Scanner object.
            return; // Terminates the program.
        }

        // Calculates the sum of the proper divisors.
        int sum = sumDivisor(number);

        // Checks whether the sum of proper divisors is greater than the number.
        if (sum > number) {

            // Executes if the number is an Abundant Number.
            System.out.println("The given number is an Abundant Number.");

        } else {

            // Executes if the number is not an Abundant Number.
            System.out.println("The given number is not an Abundant Number.");
        }

        sc.close(); // Closes the Scanner object.
    }
}
/*
Abundant Number
Definition
An Abundant Number is a number whose sum of proper divisors is greater than the number itself.
Example: 12
Proper divisors of 12:
1,2,3,4,6
Their sum:
1+2+3+4+6=16
Since:
16>12
12 is an Abundant Number.
Main Condition
Sum of proper divisors>Number
​	
 
*/