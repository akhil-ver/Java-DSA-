package DSA;
import java.util.HashMap;
import java.util.Arrays;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        // HashMap to store number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // Calculate the required number
            int complement = target - nums[i];

            // Check if the complement exists in the HashMap
            if (map.containsKey(complement)) {

                // Return indices of the two numbers
                return new int[] { map.get(complement), i };
            }

            // Store current number and its index
            map.put(nums[i], i);
        }

        // Return empty array if no solution exists
        return new int[] {};
    }

    // Driver Code
    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(nums, target);

        System.out.println("Indices: " + Arrays.toString(result));
    }
}

/*

Step-by-Step Explanation
Step 1: Create HashMap
HashMap<Integer, Integer> map = new HashMap<>();
Stores:
Number -> Index
Example:
2 -> 0
7 -> 1
11 -> 2
Step 2: Traverse Array
for (int i = 0; i < nums.length; i++)
Visit each element once.
Step 3: Find Complement
int complement = target - nums[i];
For:
nums[i] = 7
target = 9
complement = 9 - 7 = 2
We need to check whether 2 already exists.
Step 4: Check HashMap
if (map.containsKey(complement))
If complement exists:
return new int[] { map.get(complement), i };
Return indices immediately.
Step 5: Store Current Number
map.put(nums[i], i);
Store current number and its index for future checks.
Dry Run
Input
nums = [2,7,11,15]
target = 9
i	nums[i]	complement	HashMap	Action
0	2	7	{}	Store 2→0
1	7	2	{2→0}	Found 2 → Return [0,1]
Output
[0,1]
Time Complexity
Loop
for (int i = 0; i < nums.length; i++)
Runs n times.
HashMap Operations
containsKey()
put()
get()
Average Time:
O(1)
Therefore:
Time Complexity = O(n)
Space Complexity
In the worst case, all elements are stored in HashMap.
HashMap<Integer, Integer> map
Stores up to n elements.
Space Complexity = O(n)
Brute Force Solution
class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] {};
    }
}
Complexity
Time Complexity: O(n²)
Space Complexity: O(1)
Interview Answer
Approach: Use a HashMap to store each number and its index. For every element, calculate target - nums[i] and check whether that value already exists in the map. If it exists, return both indices.
Time Complexity: O(n)
Space Complexity: O(n)



*/
