import java.util.*; // Imports utility classes such as Scanner

public class Program08ReverseAnArray { // Declares the class

    // Method to reverse the given array
    public static void reverseArray(int[] arr) {

        // Stores the index of the first element
        int left = 0;

        // Stores the index of the last element
        int right = arr.length - 1;

        // Continues swapping until the two pointers meet
        while (left < right) {

            // Stores the left element temporarily
            int temp = arr[left];

            // Copies the right element to the left position
            arr[left] = arr[right];

            // Copies the original left element to the right position
            arr[right] = temp;

            // Moves the left pointer one position forward
            left++;

            // Moves the right pointer one position backward
            right--;
        }
    }

    // Main method where program execution starts
    public static void main(String[] args) {

        // Creates a Scanner object to read keyboard input
        Scanner sc = new Scanner(System.in);

        // Asks the user to enter the array size
        System.out.print("Enter the size of the array: ");

        // Checks whether the entered value is an integer
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

        // Creates an integer array with the specified size
        int[] arr = new int[size];

        // Checks whether the array is empty
        if (size == 0) {

            // Displays a message for an empty array
            System.out.println("The array is empty. Nothing to reverse.");

            // Closes the Scanner object
            sc.close();

            // Stops the program
            return;
        }

        // Asks the user to enter the array elements
        System.out.println("Enter the array elements:");

        // Loops through every index of the array
        for (int i = 0; i < size; i++) {

            // Prompts the user to enter each element
            System.out.print("Element " + (i + 1) + ": ");

            // Checks whether the entered value is an integer
            if (!sc.hasNextInt()) {

                // Displays an error message
                System.out.println("Invalid input! Please enter only integers.");

                // Closes the Scanner object
                sc.close();

                // Stops the program
                return;
            }

            // Stores the entered value in the array
            arr[i] = sc.nextInt();
        }

        // Calls the method to reverse the array
        reverseArray(arr);

        // Displays a message before printing the reversed array
        System.out.println("Array after reversing:");

        // Loops through the reversed array
        for (int i = 0; i < size; i++) {

            // Prints each element
            System.out.print(arr[i] + " ");
        }

        // Moves the cursor to the next line
        System.out.println();

        // Closes the Scanner object
        sc.close();
    }
}