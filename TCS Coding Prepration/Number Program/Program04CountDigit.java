import java.util.*; // Imports utility classes, including the Scanner class.

public class Program04CountDigit { // Declares the class Program04CountDigit.

    // This method counts and returns the number of digits in a given number.
    public static int countDigit(int num) {

        int count = 0; // Stores the total number of digits.

        // Continues until all digits of the number are processed.
        while (num > 0) {

            count++; // Increases the digit count by 1.

            num /= 10; // Removes the last digit from the number.
        }

        return count; // Returns the total number of digits.
    }

    public static void main(String[] args) { // Main method where program execution starts.

        Scanner sc = new Scanner(System.in); // Creates a Scanner object to take user input.

        // Asks the user to enter a number.
        System.out.print("Enter a number: ");

        int number = sc.nextInt(); // Reads the number entered by the user.

        // Calls the countDigit method and stores the returned count.
        int count = countDigit(number);

        // Displays the given number.
        System.out.println("Given number is: " + number);

        // Displays the total number of digits.
        System.out.println("Number of digits is: " + count);

        sc.close(); // Closes the Scanner object.
    }
}