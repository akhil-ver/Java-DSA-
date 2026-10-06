import java.util.*;

public class Program24MaximumSumSubArray {

    // Finds and prints the maximum sum subarray
    public static void maximumSumSubArray(int[] arr) {

        // Handles the edge case where the array is empty
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        // Stores the sum of the current subarray
        int sum = 0;

        // Stores the maximum subarray sum found so far
        // Integer.MIN_VALUE is used to handle all-negative arrays
        int max = Integer.MIN_VALUE;

        // Stores the starting index of the maximum sum subarray
        int start = 0;

        // Stores the ending index of the maximum sum subarray
        int end = 0;

        // Stores the possible starting index of the current subarray
        int tempStart = 0;

        // Traverses every element of the array
        for (int i = 0; i < arr.length; i++) {

            // Adds the current element to the current subarray sum
            sum += arr[i];

            // Checks if the current subarray sum is greater
            // than the maximum sum found so far
            if (sum > max) {

                // Updates the maximum sum
                max = sum;

                // Updates the starting index of the maximum subarray
                start = tempStart;

                // Updates the ending index of the maximum subarray
                end = i;
            }

            // If the current sum becomes negative,
            // it cannot help produce a larger sum in the future
            if (sum < 0) {

                // Resets the current sum
                sum = 0;

                // The next element becomes the possible start
                // of a new subarray
                tempStart = i + 1;
            }
        }

        // Prints the maximum subarray sum
        System.out.println("Maximum Sum: " + max);

        // Prints the starting index of the maximum subarray
        System.out.println("Starting Index: " + start);

        // Prints the ending index of the maximum subarray
        System.out.println("Ending Index: " + end);

        // Prints the elements of the maximum sum subarray
        System.out.print("Maximum Sum Subarray: ");

        // Traverses from the starting index to the ending index
        for (int i = start; i <= end; i++) {

            // Prints each element of the maximum sum subarray
            System.out.print(arr[i] + " ");
        }

        // Moves to the next line
        System.out.println();
    }

    public static void main(String[] args) {

        // Creates a Scanner to read input
        Scanner sc = new Scanner(System.in);

        // Reads the size of the array
        int size = sc.nextInt();

        // Creates the array
        int[] arr = new int[size];

        // Reads the array elements
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Finds and prints the maximum sum subarray
        maximumSumSubArray(arr);

        // Closes the Scanner
        sc.close();
    }
}