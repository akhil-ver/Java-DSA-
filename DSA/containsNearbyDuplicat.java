package DSA;
import java.util.Scanner;
import java.util.HashSet;

public class containsNearbyDuplicat {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            // Duplicate found within distance k
            if (set.contains(nums[i])) {
                return true;
            }

            // Add current element
            set.add(nums[i]);

            // Maintain sliding window of size k
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        // Function call
        boolean result = containsNearbyDuplicate(nums, k);

        System.out.println("Output: " + result);

        sc.close();
    }
}

/*


        Approach: Sliding Window + HashSet
        Instead of storing the entire array in a HashSet, we only keep the last k elements in the set.
        The HashSet acts like a window of size k.
        Logic
        Traverse the array.
        If current element already exists in the set:
        Duplicate found within distance k.
        Return true.
        Add current element to the set.
        If window size becomes greater than k,
        remove the oldest element.
        If traversal completes, return false.
        Dry Run
        Input
        nums = [1,2,3,1]
        k = 3
        Iteration 1
        i = 0
        set = {}
        Check:
        set.contains(1) -> false
        Add:
        set = {1}
        Iteration 2
        i = 1
        Check:
        set.contains(2) -> false
        Add:
        set = {1,2}
        Iteration 3
        i = 2
        Check:
        set.contains(3) -> false
        Add:
        set = {1,2,3}
        Iteration 4
        i = 3
        Check:
        set.contains(1) -> true
        Return:
        true
        Because:
        |3 - 0| = 3 <= k
        Why Remove nums[i-k]?
        Suppose:
        nums = [1,2,3,4,1]
        k = 3
        When:
        i = 4
        The window should contain only:
        [2,3,4]
        The first 1 is too far away.
        So we remove:
        nums[i-k]
        nums[4-3]
        nums[1]
        This keeps only the last k elements in the set.
        Time Complexity
        The loop runs n times.
        For every iteration:
        set.contains()
        set.add()
        set.remove()
        all take:
        O(1)
        average time.
        Therefore:
        Time Complexity = O(n)
        Space Complexity
        At any moment, the HashSet stores at most k elements.
        Space Complexity = O(k)
        Comparison of All Approaches
        Approach	Time	Space
        Brute Force	O(n²)	O(1)
        HashMap	O(n)	O(n)
        Sliding Window + HashSet	O(n)	O(k) ✅
        Interview Answer
        Approach: Use a HashSet as a sliding window of size k. If an element already exists in the current window, return true. Otherwise, add it to the set and remove elements that fall outside the window.
        Time Complexity: O(n)
        Space Complexity: O(k)



*/