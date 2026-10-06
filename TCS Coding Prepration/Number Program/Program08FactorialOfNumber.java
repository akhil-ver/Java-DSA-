import java.util.*; // Imports utility classes, including the Scanner class.

public class Program08FactorialOfNumber { // Declares the class Program08FactorialOfNumber.

    public static void main(String[] args) { // Main method where program execution starts.

        Scanner sc = new Scanner(System.in); // Creates a Scanner object to take user input.

        // Asks the user to enter a number.
        System.out.print("Enter a number to find its factorial: ");

        int number = sc.nextInt(); // Reads the number entered by the user.

        // Checks whether the entered number is negative.
        if (number < 0) {
            System.out.println("Please enter a non-negative number.");
            sc.close(); // Closes the Scanner object.
            return; // Terminates the program.
        }

        int fact = 1; // Stores the factorial of the number.

        // Multiplies all numbers from 1 to the given number.
        for (int i = 1; i <= number; i++) {
            fact *= i; // Multiplies fact by the current value of i.
        }

        // Displays the factorial of the given number.
        System.out.println("Factorial of the given number is: " + fact);

        sc.close(); // Closes the Scanner object.
    }
}