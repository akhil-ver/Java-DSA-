import java.util.*; // Imports utility classes, including the Scanner class.

public class Program23SunnyNumber { // Declares the class Program23SunnyNumber.

    // This method checks whether a number is a perfect square.
    public static boolean sunnyNumberCheck(int num) {

        // Handles negative numbers because negative numbers
        // cannot be perfect squares.
        if (num < 0) {
            return false;
        }

        int left = 0; // Represents the starting point of the search range.

        int right = num; // Represents the ending point of the search range.

        // Performs binary search until the search range becomes invalid.
        while (left <= right) {

            // Finds the middle value safely.
            int mid = left + (right - left) / 2;

            // Uses long to avoid integer overflow when calculating mid * mid.
            long square = (long) mid * mid;

            // Checks whether mid squared is equal to num.
            if (square == num) {
                return true; // num is a perfect square.
            }

            // If mid squared is greater than num,
            // search in the left half.
            else if (square > num) {
                right = mid - 1;
            }

            // If mid squared is less than num,
            // search in the right half.
            else {
                left = mid + 1;
            }
        }

        // Returns false if no integer whose square is num is found.
        return false;
    }

    public static void main(String[] args) { // Main method where program execution starts.

        Scanner sc = new Scanner(System.in); // Creates a Scanner object for user input.

        // Asks the user to enter a number.
        System.out.print("Enter a number to check whether it is a Sunny Number: ");

        int number = sc.nextInt(); // Reads the number entered by the user.

        // Handles the largest int value because number + 1 would overflow.
        if (number == Integer.MAX_VALUE) {
            System.out.println("The number is not a Sunny Number.");
            sc.close(); // Closes the Scanner object.
            return; // Terminates the program.
        }

        // A Sunny Number is checked by determining whether number + 1
        // is a perfect square.
        boolean isSunny = sunnyNumberCheck(number + 1);

        // Displays whether the number is a Sunny Number.
        if (isSunny) {
            System.out.println("The given number is a Sunny Number.");
        } else {
            System.out.println("The given number is not a Sunny Number.");
        }

        sc.close(); // Closes the Scanner object.
    }
}
/*
Sunny Number
Definition
A Sunny Number is a number for which the next number is a perfect square.
Main Condition
If:
n+1
is a perfect square, then n is a Sunny Number.
Example: 8
8+1=9
And:
9=3 
2
 
Therefore, 8 is a Sunny Number.
Another example:
15+1=16=4 
2
 
So, 15 is also a Sunny Number.
*/