import java.util.Scanner; // Imports the Scanner class for taking user input

public class Program09LeftRotateElement { // Declares the class

    // Method to reverse array elements from start index to end index
    public static void reverseArray(int[] arr, int start, int end) {

        // Stores the starting index
        int left = start;

        // Stores the ending index
        int right = end;

        // Continues swapping until the two pointers meet
        while (left < right) {

            // Temporarily stores the left element
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

            // Displays a message for an empty array
            System.out.println("The array is empty. Nothing to left rotate.");

            // Closes the Scanner object
            sc.close();

            // Stops the program
            return;
        }

        // Creates an integer array with the specified size
        int[] arr = new int[size];

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

        // Reverses the first element
        // This does not change the array but is part of the reversal algorithm
        reverseArray(arr, 0, 0);

        // Reverses all elements except the first element
        reverseArray(arr, 1, size - 1);

        // Reverses the complete array to perform left rotation by one position
        reverseArray(arr, 0, size - 1);

        // Displays a message before printing the left-rotated array
        System.out.println("Array after left rotation:");

        // Loops through every element of the rotated array
        for (int i = 0; i < size; i++) {

            // Prints each array element
            System.out.print(arr[i] + " ");
        }

        // Moves the cursor to the next line
        System.out.println();

        // Closes the Scanner object
        sc.close();
    }
}