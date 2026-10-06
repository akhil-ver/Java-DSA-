import java.util.*; // Imports utility classes such as Scanner and LinkedHashMap

public class Program16CountFrequencyOfElement { // Declares the class

    // Main method where program execution starts
    public static void main(String[] args) {

        // Creates a Scanner object to read input from the keyboard
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
            System.out.println("The array is empty. No frequency can be calculated.");

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

            // Gets the current frequency of arr[i]
            // If arr[i] is not present in the map, its frequency is considered 0
            int frequency = map.getOrDefault(arr[i], 0);

            // Stores the element with its frequency increased by 1
            map.put(arr[i], frequency + 1);
        }

        // Displays a heading before printing frequencies
        System.out.println("Frequency of each element:");

        // Loops through every unique element in the map
        for (int element : map.keySet()) {

            // Prints the element and the number of times it occurs
            System.out.println(element + " -> " + map.get(element));
        }

        // Closes the Scanner object
        sc.close();
    }
}