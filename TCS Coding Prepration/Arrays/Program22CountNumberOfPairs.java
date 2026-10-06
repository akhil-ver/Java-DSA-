import java.util.*;

public class Program22CountNumberOfPairs {

    /*
     * This method counts all possible pairs whose sum is equal to the target.
     *
     * Example:
     * List = [1, 1, 1, 1]
     * Target = 2
     *
     * Possible pairs = 6
     */
    public static long countPairs(ArrayList<Integer> list, int target) {

        /*
         * HashMap stores:
         *
         * Element -> Number of times it has appeared before
         *
         * Example:
         * {1=2, 5=1}
         *
         * Means:
         * 1 appeared 2 times
         * 5 appeared 1 time
         */
        HashMap<Integer, Integer> map = new HashMap<>();

        // Stores the total number of valid pairs
        long count = 0;

        // Starts checking elements from index 0
        int right = 0;

        // Continues until all elements are checked
        while (right < list.size()) {

            // Gets the current element
            int current = list.get(right);

            /*
             * Finds the number required to make the target.
             *
             * Example:
             * Target = 10
             * Current = 4
             *
             * Complement = 10 - 4 = 6
             *
             * We need to check whether 6 appeared before.
             */
            int complement = target - current;

            /*
             * Checks whether the complement appeared previously.
             */
            if (map.containsKey(complement)) {

                /*
                 * Adds the frequency of the complement.
                 *
                 * If complement appeared 3 times before,
                 * the current element can form 3 new pairs.
                 */
                count += map.get(complement);
            }

            /*
             * Stores the current element in the HashMap.
             *
             * If the element already exists, increase
             * its frequency by 1.
             *
             * getOrDefault(current, 0):
             * - Returns the current frequency if it exists.
             * - Returns 0 if it does not exist.
             */
            map.put(
                current,
                map.getOrDefault(current, 0) + 1
            );

            // Moves to the next element
            right++;
        }

        // Returns the total number of possible pairs
        return count;
    }

    // Main method where program execution starts
    public static void main(String[] args) {

        // Creates a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Asks the user to enter the size of the array
        System.out.print("Enter the size of the array: ");

        // Checks whether the entered value is a valid integer
        if (!sc.hasNextInt()) {

            // Displays an error message
            System.out.println("Invalid input! Please enter a valid integer.");

            // Closes the Scanner
            sc.close();

            // Stops the program
            return;
        }

        // Reads the size of the array
        int size = sc.nextInt();

        // Checks whether the size is less than 2
        if (size < 2) {

            // A pair requires at least two elements
            System.out.println("At least 2 elements are required to form a pair.");

            // Closes the Scanner
            sc.close();

            // Stops the program
            return;
        }

        // Creates an ArrayList to store the elements
        ArrayList<Integer> list = new ArrayList<>();

        // Asks the user to enter the elements
        System.out.println("Enter the elements:");

        // Reads all elements one by one
        for (int i = 0; i < size; i++) {

            // Prompts the user for each element
            System.out.print("Element " + (i + 1) + ": ");

            // Checks whether the input is a valid integer
            if (!sc.hasNextInt()) {

                // Displays an error message
                System.out.println("Invalid input! Please enter only integers.");

                // Closes the Scanner
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

            // Closes the Scanner
            sc.close();

            // Stops the program
            return;
        }

        // Reads the target value
        int target = sc.nextInt();

        /*
         * Calls the countPairs method to find
         * the total number of possible pairs.
         */
        long pairCount = countPairs(list, target);

        // Displays the final number of pairs
        System.out.println("Number of possible pairs: " + pairCount);

        // Closes the Scanner
        sc.close();
    }
}