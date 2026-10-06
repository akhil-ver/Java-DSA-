import java.util.*; // Imports all utility classes, including the Scanner class.

public class Program02SumOfDigit { // Declares the class Program02SumOfDigit.

    // This method calculates and returns the sum of all digits in a number.
    public static int digitSum(int num) {

        int sum = 0; // Stores the sum of the digits.

        // Continues until all digits of the number are processed.
        while (num > 0) {

            int rem = num % 10; // Extracts the last digit of the number.

            sum += rem; // Adds the extracted digit to sum.

            num /= 10; // Removes the last digit from the number.
        }

        return sum; // Returns the final sum of the digits.
    }

    public static void main(String[] args) { // Main method where program execution starts.

        Scanner sc = new Scanner(System.in); // Creates a Scanner object to take user input.

        // Asks the user to enter a number.
        System.out.print("Enter a number: ");

        int number = sc.nextInt(); // Reads the number entered by the user.

        // Calls the digitSum method and stores the returned sum.
        int sum = digitSum(number);

        // Displays the original number.
        System.out.println("Given number is: " + number);

        // Displays the sum of the digits.
        System.out.println("Sum of digits is: " + sum);

        sc.close(); // Closes the Scanner object.
    }
}