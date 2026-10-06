import java.util.*;

public class Program26SubArrayWithGivenSum {

    // Finds a subarray whose sum is equal to the target
    // This approach works with positive, negative, and zero values
    public static int[] subArrayWithGivenSum(int[] arr, int target) {

        // Stores each prefix sum and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Stores the sum from index 0 to the current index
        int prefixSum = 0;

        // Traverses every element of the array
        for (int i = 0; i < arr.length; i++) {

            // Adds the current element to the prefix sum
            prefixSum += arr[i];

            // Checks whether the prefix sum itself equals the target
            // This means the subarray starts from index 0
            if (prefixSum == target) {

                // Returns the starting and ending indices
                return new int[]{0, i};
            }

            // Calculates the prefix sum needed before the subarray starts
            int requiredSum = prefixSum - target;

            // Checks whether the required prefix sum already exists
            if (map.containsKey(requiredSum)) {

                // Gets the index where the required prefix sum occurred
                int previousIndex = map.get(requiredSum);

                // Returns the subarray starting after that index
                // and ending at the current index
                return new int[]{previousIndex + 1, i};
            }

            // Stores the current prefix sum and its index
            // Only stores it if it does not already exist
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        // Returns -1 if no subarray with the target sum is found
        return new int[]{-1, -1};
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

        // Reads the target sum
        int target = sc.nextInt();

        // Finds the subarray with the given target sum
        int[] result = subArrayWithGivenSum(arr, target);

        // Checks whether a valid subarray was found
        if (result[0] == -1) {

            // Prints -1 when no subarray exists
            System.out.println("-1");
        }

        // Executes when a valid subarray is found
        else {

            // Prints the starting index
            System.out.println("Starting Index: " + result[0]);

            // Prints the ending index
            System.out.println("Ending Index: " + result[1]);

            // Prints the length of the subarray
            System.out.println(
                "Length: " + (result[1] - result[0] + 1)
            );

            // Prints the subarray elements
            System.out.print("Subarray: ");

            // Traverses from the starting index to the ending index
            for (int i = result[0]; i <= result[1]; i++) {

                // Prints each element
                System.out.print(arr[i] + " ");
            }
        }

        // Closes the Scanner
        sc.close();
    }
}
/*
 

import java.util.*;

public class Program26SubArrayWithGivenSum {

    // Finds the subarray whose sum is equal to the target
    public static int[] subArrayWithGivenSum(int[] arr, int target) {

        // Left pointer represents the starting index of the window
        int left = 0;

        // Stores the sum of the current window
        int sum = 0;

        // Right pointer expands the window from left to right
        for (int right = 0; right < arr.length; right++) {

            // Adds the current element to the window sum
            sum += arr[right];

            // Shrinks the window while the sum is greater than the target
            while (sum > target && left <= right) {

                // Removes the leftmost element from the window sum
                sum -= arr[left];

                // Moves the left pointer forward
                left++;
            }

            // Checks whether the current window sum equals the target
            if (sum == target) {

                // Returns the starting and ending indices of the subarray
                return new int[]{left, right};
            }
        }

        // Returns -1 if no subarray with the target sum is found
        return new int[]{-1, -1};
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

        // Reads the target sum
        int target = sc.nextInt();

        // Finds the subarray with the given target sum
        int[] result = subArrayWithGivenSum(arr, target);

        // Checks whether a valid subarray was found
        if (result[0] == -1) {

            // Prints -1 when no valid subarray exists
            System.out.println("-1");
        }

        // Executes when a valid subarray is found
        else {

            // Prints the starting index
            System.out.println("Starting Index: " + result[0]);

            // Prints the ending index
            System.out.println("Ending Index: " + result[1]);

            // Prints the length of the subarray
            System.out.println(
                "Length: " + (result[1] - result[0] + 1)
            );

            // Prints the subarray elements
            System.out.print("Subarray: ");

            // Traverses from the starting index to the ending index
            for (int i = result[0]; i <= result[1]; i++) {

                // Prints each element of the subarray
                System.out.print(arr[i] + " ");
            }
        }

        // Closes the Scanner
        sc.close();
    }
}

*/