import java.util.Scanner; // Imports the Scanner class for taking user input

// Class to find the second smallest distinct element in an array
public class Program04SecondSmallestElement {

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

        // Checks if the array contains fewer than 2 elements
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

        // Initializes smallest with the first element of the array
        int smallest = arr[0];

        // Finds the smallest element in the array
        for (int i = 1; i < size; i++) {

            // Checks if the current element is smaller than the current smallest element
            if (arr[i] < smallest) {

                // Updates smallest with the current element
                smallest = arr[i];
            }
        }

        // Declares a variable to store the second smallest element
        int secondSmallest = 0;

        // Keeps track of whether a distinct second smallest element is found
        boolean found = false;

        // Checks every element of the array
        for (int i = 0; i < size; i++) {

            // Checks if the current element is different from the smallest element
            if (arr[i] != smallest) {

                // Updates secondSmallest if this is the first valid element
                // or if the current element is smaller than secondSmallest
                if (!found || arr[i] < secondSmallest) {

                    // Stores the current element as the second smallest element
                    secondSmallest = arr[i];

                    // Marks that a second smallest element has been found
                    found = true;
                }
            }
        }

        // Checks whether a distinct second smallest element exists
        if (found) {

            // Displays the second smallest element
            System.out.println("Second smallest element is: " + secondSmallest);

        } else {

            // Displays a message if all array elements are the same
            System.out.println("There is no distinct second smallest element.");
        }

        // Closes the Scanner object to release resources
        sc.close();
    }
}