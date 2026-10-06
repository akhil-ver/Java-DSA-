import java.util.*; // Imports utility classes, including the Scanner class.

public class Program09FibonacciNumber { // Declares the class Program09FibonacciNumber.

    public static void main(String[] args) { // Main method where program execution starts.

        Scanner sc = new Scanner(System.in); // Creates a Scanner object to take user input.

        // Asks the user to enter the position of the Fibonacci number.
        System.out.print("Enter a number to find the Fibonacci number: ");

        int number = sc.nextInt(); // Reads the number entered by the user.

        // Checks whether the entered number is negative.
        if (number < 0) {
            System.out.println("Please enter a non-negative number.");
            sc.close(); // Closes the Scanner object.
            return; // Terminates the program.
        }

        // Creates an array to store Fibonacci numbers from 0 to number.
        int[] dp = new int[number + 1];

        dp[0] = 0; // The first Fibonacci number is 0.

        // Assigns the second Fibonacci number only if number is at least 1.
        if (number >= 1) {
            dp[1] = 1;
        }

        // Calculates Fibonacci numbers from index 2 up to number.
        for (int i = 2; i <= number; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // Displays the Fibonacci number at the given position.
        System.out.println("Fibonacci number at position " + number + " is: " + dp[number]);

        sc.close(); // Closes the Scanner object.
    }
}