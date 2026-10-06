import java.util.*; // Imports utility classes, including the Scanner class.

public class Program03ProductOfDigit { // Declares the class Program03ProductOfDigit.

    // This method calculates and returns the product of all digits in a number.
    public static int product(int num) {

        int prod = 1; // Stores the product of the digits.

        // Continues until all digits of the number are processed.
        while (num > 0) {

            int rem = num % 10; // Extracts the last digit of the number.

            prod *= rem; // Multiplies the extracted digit with prod.

            num /= 10; // Removes the last digit from the number.
        }

        return prod; // Returns the final product of the digits.
    }

    public static void main(String[] args) { // Main method where program execution starts.

        Scanner sc = new Scanner(System.in); // Creates a Scanner object to take user input.

        // Asks the user to enter a number.
        System.out.print("Enter a number: ");

        int number = sc.nextInt(); // Reads the number entered by the user.

        // Calls the product method and stores the returned product.
        int prod = product(number);

        // Displays the product of the digits.
        System.out.println("Product of the digits is: " + prod);

        sc.close(); // Closes the Scanner object.
    }
}