import java.util.*; // Imports utility classes, including the Scanner class.

public class Program07PrimeNumberInRange { // Declares the class Program07PrimeNumberInRange.

    // This method checks whether a given number is prime.
    public static boolean primeChecker(int number) {

        // Checks for factors from 2 up to the square root of the number.
        for (int i = 2; i * i <= number; i++) {

            // If the number is divisible by i, it is not prime.
            if (number % i == 0) {
                return false; // Returns false because the number is not prime.
            }
        }

        return true; // Returns true if no factors are found.
    }

    public static void main(String[] args) { // Main method where program execution starts.

        Scanner sc = new Scanner(System.in); // Creates a Scanner object to take user input.

        // Asks the user to enter the upper limit.
        System.out.print("Enter the upper limit: ");

        int number = sc.nextInt(); // Reads the number entered by the user.

        // Handles invalid and edge-case inputs.
        if (number < 2) {
            System.out.println("There are no prime numbers in this range.");
            sc.close(); // Closes the Scanner object.
            return; // Terminates the program.
        }

        // Checks every number from 2 up to the given number.
        for (int i = 2; i <= number; i++) {

            boolean isPrime = primeChecker(i); // Checks whether the current number is prime.

            // Prints the number if it is prime.
            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        sc.close(); // Closes the Scanner object.
    }
}