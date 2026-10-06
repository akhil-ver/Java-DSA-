import java.util.Scanner; // Imports the Scanner class for taking user input

// Class to find the second largest distinct element in an array
public class Program03SecondLargestElement {

    // Main method - program execution starts from here
    public static void main(String[] args) {

        // Creates a Scanner object to read input from the keyboard
        Scanner sc = new Scanner(System.in);

        // Displays a message asking the user to enter the array size
        System.out.print("Enter the size of the array: ");

        // Checks whether the entered value is an integer
        if (!sc.hasNextInt()) {

            // Displays an error message if the input is not an integer
            System.out.println("Invalid input! Please enter a valid integer.");

            // Closes the Scanner object
            sc.close();

            // Stops the program
            return;
        }

        // Stores the entered array size
        int size = sc.nextInt();

        // Checks if the array has fewer than 2 elements
        if (size < 2) {

            // Displays an error message
            System.out.println("Array must contain at least 2 elements.");

            // Closes the Scanner object
            sc.close();

            // Stops the program
            return;
        }

        // Creates an integer array with the specified size
        int[] arr = new int[size];

        // Displays a message asking the user to enter array elements
        System.out.println("Enter the elements of the array:");

        // Loop runs from index 0 to size - 1
        for (int i = 0; i < size; i++) {

            // Prompts the user to enter each element
            System.out.print("Element " + (i + 1) + ": ");

            // Checks whether the entered element is an integer
            if (!sc.hasNextInt()) {

                // Displays an error message for invalid input
                System.out.println("Invalid input! Please enter only integers.");

                // Closes the Scanner object
                sc.close();

                // Stops the program
                return;
            }

            // Stores the entered integer in the array at index i
            arr[i] = sc.nextInt();
        }

        // Initializes largest with the first element of the array
        int largest = arr[0];

        // Finds the largest element in the array
        for (int i = 1; i < size; i++) {

            // Checks if the current element is greater than largest
            if (arr[i] > largest) {

                // Updates largest with the current element
                largest = arr[i];
            }
        }

        // Initializes secondLargest to the minimum possible integer value
        int secondLargest = Integer.MIN_VALUE;

        // Checks every element to find the second largest distinct element
        for (int i = 0; i < size; i++) {

            // Checks if the element is not equal to largest
            // and is greater than the current secondLargest
            if (arr[i] != largest && arr[i] > secondLargest) {

                // Updates secondLargest with the current element
                secondLargest = arr[i];
            }
        }

        // Checks whether a distinct second largest element was found
        if (secondLargest == Integer.MIN_VALUE) {

            // Displays a message if all elements are the same
            System.out.println("There is no distinct second largest element.");

        } else {

            // Displays the second largest element
            System.out.println("Second largest element is: " + secondLargest);
        }

        // Closes the Scanner object to release resources
        sc.close();
    }
}