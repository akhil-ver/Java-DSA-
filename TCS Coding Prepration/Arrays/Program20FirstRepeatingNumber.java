import java.util.*; // Imports utility classes such as Scanner and LinkedHashMap

public class Program20FirstRepeatingNumber {

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

            // Displays a message because no elements exist
            System.out.println("The array is empty. No repeating element exists.");

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

            // Checks whether the entered value is a valid integer
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

        // Creates a LinkedHashMap to store each element and its frequency
        // LinkedHashMap preserves the order in which elements first appear
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        // Loops through every element of the array
        for (int i = 0; i < size; i++) {

            // Increases the frequency of the current element by 1
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Stores whether a repeating element is found
        boolean found = false;

        // Loops through each unique element in insertion order
        for (int element : map.keySet()) {

            // Checks whether the current element appears more than once
            if (map.get(element) > 1) {

                // Displays the first repeating element
                System.out.println("First repeating element: " + element);

                // Marks that a repeating element was found
                found = true;

                // Stops the loop because we only need the first repeating element
                break;
            }
        }

        // Checks whether no repeating element was found
        if (!found) {

            // Displays a message when all elements are unique
            System.out.println("No repeating element found.");
        }

        // Closes the Scanner object
        sc.close();
    }
}