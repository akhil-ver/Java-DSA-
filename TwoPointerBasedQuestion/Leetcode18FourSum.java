import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < n - 2; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {

                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {

                        result.add(Arrays.asList(
                                nums[i],
                                nums[j],
                                nums[left],
                                nums[right]));

                        left++;
                        right--;

                        while (left < right && nums[left] == nums[left - 1])
                            left++;

                        while (left < right && nums[right] == nums[right + 1])
                            right--;

                    } else if (sum < target) {

                        left++;

                    } else {

                        right--;
                    }
                }
            }
        }

        return result;
    }
}

/*

Dry Run
Input
nums = [1,0,-1,0,-2,2]
target = 0
Sort
[-2,-1,0,0,1,2]
i = 0
-2 -1 0 0 1 2
 ^
 i
j = 1
-2 -1 0 0 1 2
 ^  ^
 i  j
Pointers
-2 -1 0 0 1 2
 ^  ^ ^     ^
 i  j L     R
Sum
-2 + (-1) + 0 + 2 = -1
Too small
left++
Now
-2 -1 0 0 1 2
 ^  ^   ^   ^
Sum
-2 + (-1) + 0 + 2 = -1
Again
left++
Now
-2 -1 0 0 1 2
 ^  ^     ^ ^
Sum
-2 + (-1) + 1 + 2 = 0
Found
[-2,-1,1,2]
Move both pointers.
j = 2
-2 -1 0 0 1 2
 ^    ^
 i    j
Pointers
-2 -1 0 0 1 2
 ^    ^ ^   ^
Sum
-2 + 0 + 0 + 2 = 0
Found
[-2,0,0,2]
i = 1
-2 -1 0 0 1 2
    ^
j = 2
-2 -1 0 0 1 2
    ^ ^
Pointers
-2 -1 0 0 1 2
    ^ ^ ^   ^
Sum
-1 + 0 + 0 + 2 = 1
Too large
right--
Now
-2 -1 0 0 1 2
    ^ ^ ^ ^
Sum
-1 + 0 + 0 + 1 = 0
Found
[-1,0,0,1]
Final Answer
[
 [-2,-1,1,2],
 [-2,0,0,2],
 [-1,0,0,1]
]
Complexity
Sorting: O(n log n)
Two nested loops: O(n²)
Two-pointer scan: O(n)
Overall time complexity:
O(n³)
Space complexity:
O(1)
(excluding the space used for the output list).


*/