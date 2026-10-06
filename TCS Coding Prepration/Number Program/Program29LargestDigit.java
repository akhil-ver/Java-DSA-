import java.util.*; // Imports all classes from the java.util package, including Scanner.

public class Program29LargestDigit { // Declares the class Program29LargestDigit.

    public static int largestDigit(int num) { // Method to find the largest digit in a number.

        int digit = -1; // Stores the largest digit found. Initially set to -1.

        while (num > 0) { // Repeats until all digits of the number are processed.

            int rem = num % 10; // Extracts the last digit of the number.

            if (rem > digit) { // Checks whether the current digit is greater than the stored largest digit.
                digit = rem; // Updates digit with the current digit if it is larger.
            }

            num /= 10; // Removes the last digit from the number.
        }

        return digit; // Returns the largest digit found.
    }

    public static void main(String[] args) { // Main method where program execution starts.

        Scanner sc = new Scanner(System.in); // Creates a Scanner object to take input from the user.

        System.out.print("Enter a number to find its largest digit: ");
        // Displays a message asking the user to enter a number.

        int number = sc.nextInt(); // Reads the number entered by the user.

        int digit = largestDigit(number);
        // Calls the largestDigit() method and stores the returned largest digit.

        System.out.println("The largest digit in the given number is: " + digit);
        // Displays the largest digit.

        sc.close(); // Closes the Scanner object.
    }
}
/*
Largest digit
What it is: Find the biggest digit in a number.
Example:
Number = 58329
Largest digit = 9

*/