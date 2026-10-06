import java.util.*;

public class Program23TripletWithGivenSum {

    // Finds three indices whose elements add up to the target
    public static int[] tripleSumPair(int[] arr, int target) {

        // Sorts the array so the two-pointer technique can be used
        Arrays.sort(arr);

        // Selects the first element of the triplet
        for (int i = 0; i < arr.length - 2; i++) {

            // Left pointer starts after i
            int left = i + 1;

            // Right pointer starts at the last element
            int right = arr.length - 1;

            // Continues until the two pointers meet
            while (left < right) {

                // Calculates the sum of the three elements
                int sum = arr[i] + arr[left] + arr[right];

                // Checks whether the triplet sum equals the target
                if (sum == target) {

                    // Returns the indices of the triplet
                    return new int[]{i, left, right};
                }

                // If the sum is greater than the target,
                // move the right pointer left to decrease the sum
                else if (sum > target) {
                    right--;
                }

                // If the sum is smaller than the target,
                // move the left pointer right to increase the sum
                else {
                    left++;
                }
            }
        }

        // Returns -1 if no valid triplet is found
        return new int[]{-1, -1, -1};
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

        // Finds the triplet
        int[] triplet = tripleSumPair(arr, target);

        // Prints the indices
        System.out.println(
            triplet[0] + " " +
            triplet[1] + " " +
            triplet[2]
        );

        // Closes the Scanner
        sc.close();
    }
}