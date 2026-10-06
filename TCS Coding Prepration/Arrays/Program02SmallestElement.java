import java.util.Scanner; // Imports the Scanner class for taking user input

// Class to find the smallest element in an array
public class Program02SmallestElement {

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

        // Checks if the array size is zero or negative
        if (size <= 0) {

            // Displays an error message
            System.out.println("Array size must be greater than 0.");

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

        // Starts checking from the second element of the array
        for (int i = 1; i < size; i++) {

            // Checks if the current element is smaller than the current smallest element
            if (arr[i] < smallest) {

                // Updates smallest with the current element
                smallest = arr[i];
            }
        }

        // Displays the smallest element in the array
        System.out.println("Smallest element of the array is: " + smallest);

        // Closes the Scanner object to release resources
        sc.close();
    }
}