import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        // Initial closest sum
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                // Update closest sum if current sum is nearer to target
                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }

                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    // Exact match
                    return sum;
                }
            }
        }

        return closestSum;
    }
}

/*


Dry Run
Input
nums = [-1,2,1,-4]
target = 1
Sort
[-4,-1,1,2]
Initialize
closestSum = -4 + (-1) + 1 = -4
Iteration 1
-4 -1 1 2
 ↑  ↑   ↑
 i  L   R
Current sum
-4 + (-1) + 2 = -3
Difference
|-3 - 1| = 4
|-4 - 1| = 5
Update
closestSum = -3
Since
-3 < 1
Move
left++
Now
-4 -1 1 2
 ↑    ↑ ↑
 i    L R
Sum
-4 + 1 + 2 = -1
Difference
|-1 - 1| = 2
|-3 - 1| = 4
Update
closestSum = -1
Move
left++
Now
left == right
Stop.
Iteration 2
-4 -1 1 2
    ↑  ↑ ↑
    i  L R
Sum
-1 + 1 + 2 = 2
Difference
|2 - 1| = 1
|-1 - 1| = 2
Update
closestSum = 2
Since
2 > 1
Move
right--
Loop ends.
Iteration 3
i = 2
Not enough elements.
Stop.
Final Answer
closestSum = 2
Return
2
Visualization
Sorted Array

-4  -1   1   2
 ↑   ↑       ↑
 i  left   right

sum = nums[i] + nums[left] + nums[right]

sum < target → left++
sum > target → right--
sum == target → return sum
Why Don't We Skip Duplicates?
In 3Sum, duplicates are skipped because the goal is to return unique triplets.
Example:
[-1,-1,2]
[-1,-1,2]
Only one should be included.
In 3Sum Closest, the goal is not to collect triplets—it is only to find the closest sum. Even if duplicate values produce the same sum, they do not affect the correctness. Therefore, skipping duplicates is optional for optimization and is not required.
Complexity
Operation	Complexity
Sorting	O(n log n)
Outer loop	O(n)
Two-pointer scan	O(n)
Overall Time	O(n²)
Extra Space	**O(1)`
Key Interview Points
Sort the array first.
Fix one element (i).
Use two pointers (left, right) to search the remaining array.
Keep track of the closest sum, not the triplets.
Return immediately if you find an exact match (sum == target).
Duplicate skipping is not necessary because the output is a single sum, not a list of unique triplets.



*/