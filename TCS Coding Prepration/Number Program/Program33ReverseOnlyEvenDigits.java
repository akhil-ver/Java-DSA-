import java.util.*; 
// Imports all classes from the java.util package, including Scanner.

public class Program33ReverseOnlyEvenDigits {
    // Declares the class Program33ReverseOnlyEvenDigits.

    public static int reverseOnlyEvenDigits(int num) {
        // Method to reverse only the even digits while keeping
        // odd digits in their original positions.

        // Handles the special case when the number is 0.
        if (num == 0) {
            return 0;
        }

        boolean isNegative = num < 0;
        // Checks whether the original number is negative.

        num = Math.abs(num);
        // Converts the number to positive for easier digit processing.

        int temp = num;
        // Stores a copy of the number for the first pass.

        int reverseEven = 0;
        // Stores the even digits in reverse order.

        while (temp > 0) {
            // Processes every digit of the number.

            int rem = temp % 10;
            // Extracts the last digit.

            if (rem % 2 == 0) {
                // Checks whether the digit is even.

                reverseEven = reverseEven * 10 + rem;
                // Stores the even digit in reverseEven.
            }

            temp /= 10;
            // Removes the last digit.
        }

        int result = 0;
        // Stores the final number.

        int place = 1;
        // Stores the place value: 1, 10, 100, and so on.

        while (num > 0) {
            // Processes every digit again.

            int rem = num % 10;
            // Extracts the last digit.

            if (rem % 2 == 0) {
                // Checks whether the current digit is even.

                int evenDigit = reverseEven % 10;
                // Takes the next reversed even digit.

                result = result + evenDigit * place;
                // Places the reversed even digit at the correct position.

                reverseEven /= 10;
                // Removes the digit that was just used.

            } else {
                // Executes when the current digit is odd.

                result = result + rem * place;
                // Keeps the odd digit in its original position.
            }

            num /= 10;
            // Removes the last digit.

            place *= 10;
            // Moves to the next place value.
        }

        // Restores the negative sign if the original number was negative.
        if (isNegative) {
            result = -result;
        }

        return result;
        // Returns the final number.
    }

    public static void main(String[] args) {
        // Main method where program execution starts.

        Scanner sc = new Scanner(System.in);
        // Creates a Scanner object to take input from the user.

        System.out.print("Enter a number to reverse only its even digits: ");
        // Asks the user to enter a number.

        int number = sc.nextInt();
        // Reads the number entered by the user.

        int result = reverseOnlyEvenDigits(number);
        // Calls the method and stores the result.

        System.out.println(
            "Number after reversing only the even digits: " + result
        );
        // Displays the final result.

        sc.close();
        // Closes the Scanner object.
    }
}
/*
Reverse only even digits
What it is: Reverse the positions of only the even digits while keeping odd digits in their original positions.
Example:
Number = 123456
Even digits = 2, 4, 6
Reversed even digits = 6, 4, 2
Result = 163452
 */