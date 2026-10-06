import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // Skip duplicate values on left
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicate values on right
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (sum < 0) {

                    left++;

                } else {

                    right--;
                }
            }
        }

        return result;
    }
}
/*

Dry Run
Input
nums = [-1,0,1,2,-1,-4]
Step 1
Sort
[-4,-1,-1,0,1,2]
Iteration 1
i = 0

-4 -1 -1 0 1 2
 ↑  ↑        ↑
 i  L        R
Sum
-4 + (-1) + 2 = -3
Negative
Move left.
-4 -1 -1 0 1 2
 ↑     ↑     ↑
 i     L     R
Sum
-4 + (-1) + 2 = -3
Still negative.
Move left.
-4 -1 -1 0 1 2
 ↑       ↑   ↑
 i       L   R
Sum
-4 + 0 + 2 = -2
Move left.
-4 -1 -1 0 1 2
 ↑         ↑ ↑
 i         L R
Sum
-4 + 1 + 2 = -1
Move left.
Now
left == right
Stop.
No triplet found.
Iteration 2
i = 1

-4 -1 -1 0 1 2
    ↑  ↑     ↑
    i  L     R
Sum
-1 + (-1) + 2 = 0
Triplet found
[-1,-1,2]
Store it.
Move
left++
right--
Now
-4 -1 -1 0 1 2
    ↑    ↑ ↑
    i    L R
Sum
-1 + 0 + 1 = 0
Triplet found
[-1,0,1]
Store it.
Move both pointers.
Now
left > right
Stop.
Iteration 3
i = 2
Current value
nums[2] = -1
Previous value
nums[1] = -1
Duplicate.
Skip it.
Iteration 4
i = 3

-4 -1 -1 0 1 2
          ↑ ↑ ↑
          i L R
Sum
0 + 1 + 2 = 3
Positive.
Move right.
Now
left == right
Stop.
Final Answer
[
 [-1,-1,2],
 [-1,0,1]
]
Why Skip Duplicates?
Example:
[-2,0,0,2,2]
Without duplicate checks:
[-2,0,2]
[-2,0,2]
The same triplet is added twice.
The duplicate-skipping loops ensure that after finding one valid triplet, consecutive identical values for left and right are skipped, so each unique triplet appears only once.
Visualization
Sorted Array

-4  -1  -1   0   1   2
 ↑
 i

        ↑           ↑
      left       right

sum = nums[i] + nums[left] + nums[right]

sum < 0  → left++
sum > 0  → right--
sum == 0 → save answer, move both pointers, skip duplicates
Complexity
Operation	Complexity
Sorting	O(n log n)
Outer loop	O(n)
Two-pointer scan	O(n)
Overall Time	O(n²)
Extra Space	O(1) (excluding the output list)
Key idea: Fix one number, then use two pointers on the remaining sorted portion of the array to find pairs that make the total sum zero. This reduces the problem from a brute-force O(n³) solution to an optimal O(n²) solution.



 */