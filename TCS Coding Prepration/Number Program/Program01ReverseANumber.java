import java.util.*; // Imports all utility classes, including the Scanner class.

public class Program01ReverseANumber { // Declares the class named Program01ReverseANumber.

    // This method takes an integer and returns its reversed number.
    public static int reverseNumber(int num) {

        int rev = 0; // Stores the reversed number.

        // Continues the loop until num becomes 0.
        while (num > 0) {

            int rem = num % 10; // Extracts the last digit of num.

            num /= 10; // Removes the last digit from num.

            // Builds the reversed number by adding the extracted digit.
            rev = rev * 10 + rem;
        }

        return rev; // Returns the reversed number.
    }

    public static void main(String[] args) { // Main method where program execution starts.

        Scanner sc = new Scanner(System.in); // Creates a Scanner object to take user input.

        // Asks the user to enter a number.
        System.out.print("Enter the number that you want to reverse: ");

        int number = sc.nextInt(); // Reads the integer entered by the user.

        // Calls the reverseNumber method and stores the result.
        int reverse = reverseNumber(number);

        // Displays the original number.
        System.out.println("Original number is: " + number);

        // Displays the reversed number.
        System.out.println("Reversed number is: " + reverse);

        sc.close(); // Closes the Scanner object.
    }
}