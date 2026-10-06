import java.util.*; // Imports utility classes such as Scanner

public class Program07AverageOfArrayElement { // Declares the class

    public static void main(String[] args) { // Main method where program execution starts

        Scanner sc = new Scanner(System.in); // Creates a Scanner object to read keyboard input

        System.out.print("Enter the size of the array: "); // Asks the user to enter the array size

        if (!sc.hasNextInt()) { // Checks whether the entered value is a valid integer

            System.out.println("Invalid input! Please enter a valid integer."); // Displays an error message

            sc.close(); // Closes the Scanner object

            return; // Stops the program
        }

        int size = sc.nextInt(); // Reads and stores the array size

        if (size < 0) { // Checks whether the array size is negative

            System.out.println("Array size cannot be negative."); // Displays an error message

            sc.close(); // Closes the Scanner object

            return; // Stops the program
        }

        if (size == 0) { // Checks whether the array is empty

            System.out.println("The array is empty."); // Informs the user that no elements exist

            System.out.println("Average cannot be calculated for an empty array."); // Prevents division by zero

            sc.close(); // Closes the Scanner object

            return; // Stops the program
        }

        int[] arr = new int[size]; // Creates an integer array with the specified size

        System.out.println("Enter the elements of the array:"); // Asks the user to enter array elements

        for (int i = 0; i < size; i++) { // Loops through every index of the array

            System.out.print("Element " + (i + 1) + ": "); // Prompts the user to enter each element

            if (!sc.hasNextInt()) { // Checks whether the entered element is a valid integer

                System.out.println("Invalid input! Please enter only integers."); // Displays an error message

                sc.close(); // Closes the Scanner object

                return; // Stops the program
            }

            arr[i] = sc.nextInt(); // Stores the entered integer in the array
        }

        long sum = 0; // Creates a variable to store the sum of all elements

        for (int i = 0; i < size; i++) { // Loops through every array element

            sum += arr[i]; // Adds the current array element to sum
        }

        double average = (double) sum / size; // Calculates the average using decimal division

        System.out.println("Total Array Element Sum is: " + sum); // Displays the total sum

        System.out.println("Average of Array is: " + average); // Displays the average

        sc.close(); // Closes the Scanner object
    }
}