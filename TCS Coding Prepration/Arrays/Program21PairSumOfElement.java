import java.util.*; // Imports utility classes such as Scanner, ArrayList, HashMap, and Arrays

public class Program21PairSumOfElement {

    // Method to find two indices whose elements add up to the target
    public static int[] twoSumPair(ArrayList<Integer> list, int target) {

        // Creates a HashMap to store array elements and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // Starts checking elements from index 0
        int right = 0;

        // Continues until all elements are checked
        while (right < list.size()) {

            // Calculates the number needed to reach the target
            int complement = target - list.get(right);

            // Checks whether the complement already exists in the map
            if (map.containsKey(complement)) {

                // Returns the indices of the two elements that form the target sum
                return new int[]{map.get(complement), right};
            }

            // Stores the current element and its index in the map
            map.put(list.get(right), right);

            // Moves to the next element
            right++;
        }

        // Returns {-1, -1} if no pair is found
        return new int[]{-1, -1};
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

        // Checks whether the array has fewer than two elements
        if (size < 2) {

            // Displays a message because a pair requires at least two elements
            System.out.println("At least 2 elements are required to find a pair.");

            // Closes the Scanner object
            sc.close();

            // Stops the program
            return;
        }

        // Creates an ArrayList to store the array elements
        ArrayList<Integer> list = new ArrayList<>();

        // Asks the user to enter the array elements
        System.out.println("Enter the elements:");

        // Loops through the required number of elements
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

            // Reads and adds the element to the ArrayList
            list.add(sc.nextInt());
        }

        // Asks the user to enter the target sum
        System.out.print("Enter the target sum: ");

        // Checks whether the target is a valid integer
        if (!sc.hasNextInt()) {

            // Displays an error message
            System.out.println("Invalid input! Please enter a valid integer.");

            // Closes the Scanner object
            sc.close();

            // Stops the program
            return;
        }

        // Reads and stores the target sum
        int target = sc.nextInt();

        // Calls the method to find the pair of indices
        int[] pair = twoSumPair(list, target);

        // Checks whether a valid pair was found
        if (pair[0] == -1 && pair[1] == -1) {

            // Displays a message when no pair exists
            System.out.println("No pair found with the target sum.");

        } else {

            // Displays the indices of the two elements
            System.out.println("Pair indices: " + Arrays.toString(pair));

            // Displays the two elements forming the target sum
            System.out.println(
                "Pair elements: " + list.get(pair[0]) +
                " + " + list.get(pair[1]) +
                " = " + target
            );
        }

        // Closes the Scanner object
        sc.close();
    }
}