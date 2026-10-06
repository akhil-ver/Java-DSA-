import java.util.*; // Imports utility classes such as Scanner and LinkedHashMap

public class Program17MaximumCountFrequency { // Declares the class

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

            // Displays a message because no element exists
            System.out.println("The array is empty. Maximum frequency cannot be determined.");

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

            // Stores the entered value in the array
            arr[i] = sc.nextInt();
        }

        // Creates a LinkedHashMap to store each element and its frequency
        // LinkedHashMap preserves the order in which elements first appear
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        // Loops through every array element
        for (int i = 0; i < size; i++) {

            // Increases the frequency of the current element by 1
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Stores the maximum frequency found so far
        int maxFreq = 0;

        // Stores the element that has the maximum frequency
        int element = arr[0];

        // Loops through every unique element in the map
        for (int ele : map.keySet()) {

            // Checks whether the current element has a greater frequency
            if (map.get(ele) > maxFreq) {

                // Updates the maximum frequency
                maxFreq = map.get(ele);

                // Stores the element with the new maximum frequency
                element = ele;
            }
        }

        // Displays the element with the maximum frequency
        System.out.println("Element with maximum frequency: " + element);

        // Displays how many times the element occurs
        System.out.println("Maximum frequency: " + maxFreq);

        // Closes the Scanner object
        sc.close();
    }
}