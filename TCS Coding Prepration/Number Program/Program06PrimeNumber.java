import java.util.*; // Imports utility classes, including the Scanner class.

public class Program06PrimeNumber { // Declares the class Program06PrimeNumber.

    // This method checks whether a given number is prime.
    public static boolean primeChecker(int number) {

        // Checks for factors from 2 up to the square root of the number.
        for (int i = 2; i * i <= number; i++) {

            // If the number is divisible by i, it is not prime.
            if (number % i == 0) {
                return false;
            }
        }

        // Returns true if no factors are found.
        return true;
    }

    public static void main(String[] args) { // Main method where program execution starts.

        Scanner sc = new Scanner(System.in); // Creates a Scanner object to take user input.

        // Asks the user to enter a number.
        System.out.print("Enter a number to check whether it is prime: ");

        int number = sc.nextInt(); // Reads the number entered by the user.

        // Checks whether the entered number is valid for prime number checking.
        if (number <= 1) {
            System.out.println("Please enter a valid number greater than 1.");
            sc.close(); // Closes the Scanner object.
            return; // Terminates the program.
        }

        // Calls the primeChecker method and stores the result.
        boolean check = primeChecker(number);

        // Displays whether the number is prime or not.
        if (check) {
            System.out.println("The given number is prime.");
        } else {
            System.out.println("The given number is not prime.");
        }

        sc.close(); // Closes the Scanner object.
    }
}