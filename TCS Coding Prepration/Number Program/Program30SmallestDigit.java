import java.util.*; // Imports all classes from the java.util package, including Scanner.

public class Program30SmallestDigit { // Declares the class Program30SmallestDigit.

    public static int smallestDigit(int num) { 
        // Method to find the smallest digit in a number.

        int digit = 10; 
        // Stores the smallest digit found.
        // It is initialized to 10 because digits range from 0 to 9.

        while (num > 0) { 
            // Repeats until all digits of the number are processed.

            int rem = num % 10; 
            // Extracts the last digit of the number.

            if (rem < digit) { 
                // Checks whether the current digit is smaller than the stored smallest digit.

                digit = rem; 
                // Updates digit with the current digit if it is smaller.
            }

            num /= 10; 
            // Removes the last digit from the number.
        }

        return digit; 
        // Returns the smallest digit found.
    }

    public static void main(String[] args) { 
        // Main method where program execution starts.

        Scanner sc = new Scanner(System.in); 
        // Creates a Scanner object to take input from the user.

        System.out.print("Enter a number to find its smallest digit: ");
        // Displays a message asking the user to enter a number.

        int number = sc.nextInt(); 
        // Reads the number entered by the user.

        int digit = smallestDigit(number); 
        // Calls the smallestDigit() method and stores the returned smallest digit.

        System.out.println("The smallest digit in the given number is: " + digit);
        // Displays the smallest digit.

        sc.close(); 
        // Closes the Scanner object.
    }
}
/*
Smallest digit
What it is: Find the smallest digit in a number.
Example:
Number = 58329
Smallest digit = 2
*/