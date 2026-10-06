import java.util.*; // Imports utility classes such as Scanner and LinkedHashSet

public class Program12RemoveDuplicateElement { // Declares the class

    // Main method where program execution starts
    public static void main(String[] args) {

        // Creates a Scanner object to read keyboard input
        Scanner sc = new Scanner(System.in);

        // Asks the user to enter the array size
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
            System.out.println("The array is empty. There are no duplicate elements to remove.");

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

        // Creates a LinkedHashSet to store only unique elements
        // LinkedHashSet also preserves the original insertion order
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Loops through every array element
        for (int i = 0; i < size; i++) {

            // Adds the element to the set
            // Duplicate elements are automatically ignored
            set.add(arr[i]);
        }

        // Displays a message before printing unique elements
        System.out.println("Array after removing duplicate elements:");

        // Loops through all unique elements in the set
        for (int element : set) {

            // Prints each unique element
            System.out.print(element + " ");
        }

        // Moves the cursor to the next line
        System.out.println();

        // Closes the Scanner object
        sc.close();
    }
}