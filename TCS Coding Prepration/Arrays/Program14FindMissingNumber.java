
import java.util.Scanner; // Imports the Scanner class for taking user input

public class Program14FindMissingNumber { // Declares the class

    // Main method where program execution starts
    public static void main(String[] args) {

        // Creates a Scanner object to read keyboard input
        Scanner sc = new Scanner(System.in);

        // Asks the user to enter the size of the array
        System.out.print("Enter the size of the array: ");

        // Checks whether the entered value is a valid integer
        if (!sc.hasNextInt()) {

            // Displays an error message
            System.out.println("Invalid input! Please enter a valid integer.");

            // Closes the Scanner object
            sc.close();

            // Stops the program
            return;
        }

        // Reads and stores the array size
        int size = sc.nextInt();

        // Checks whether the array size is negative
        if (size < 0) {

            // Displays an error message
            System.out.println("Array size cannot be negative.");

            // Closes the Scanner object
            sc.close();

            // Stops the program
            return;
        }

        // Checks whether the array is empty
        if (size == 0) {

            // Displays an error message
            System.out.println("The array is empty. Missing number cannot be determined.");

            // Closes the Scanner object
            sc.close();

            // Stops the program
            return;
        }

        // Creates an integer array with the specified size
        int[] arr = new int[size];

        // Asks the user to enter the array elements
        System.out.println("Enter the elements of the array:");

        // Loops through every index of the array
        for (int i = 0; i < size; i++) {

            // Prompts the user to enter each element
            System.out.print("Element " + (i + 1) + ": ");

            // Checks whether the entered element is a valid integer
            if (!sc.hasNextInt()) {

                // Displays an error message
                System.out.println("Invalid input! Please enter only integers.");

                // Closes the Scanner object
                sc.close();

                // Stops the program
                return;
            }

            // Stores the entered integer in the array
            arr[i] = sc.nextInt();
        }

        // The sequence contains numbers from 1 to size + 1
        int n = size + 1;

        // Calculates the expected sum from 1 to n
        long expectedSum = (long) n * (n + 1) / 2;

        /*
        
        Number of expected elements = end - start + 1

        Expected Sum = (start + end) × number of elements / 2

        Missing Number = Expected Sum - Actual Sum
        
        */
        // Stores the sum of the given array elements
        long actualSum = 0;

        // Loops through the array to calculate the actual sum
        for (int i = 0; i < size; i++) {

            // Adds the current element to the actual sum
            actualSum += arr[i];
        }

        // Calculates the missing number
        long missingNumber = expectedSum - actualSum;

        // Displays the missing number
        System.out.println("The missing number is: " + missingNumber);

        // Closes the Scanner object
        sc.close();
    }
}