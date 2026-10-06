class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }
}

/*
Why does this work?
The array is already sorted.
1   2   4   6   10   15
^                   ^
L                   R
At every step:
sum = numbers[left] + numbers[right]
There are three cases.
Case 1: sum == target
Found the answer.
Target = 16

1 + 15 = 16
Return the indices.
Case 2: sum < target
Example:
Target = 12

1 + 10 = 11
The sum is too small.
Since the array is sorted, moving the right pointer left would make the sum even smaller.
So increase the left pointer.
1 2 4 6 10

L       R

↓

2 4 6 10

  L     R
Case 3: sum > target
Example:
Target = 12

4 + 15 = 19
The sum is too large.
Move the right pointer left to decrease the sum.
4 6 10 15

L       R

↓

4 6 10

L     R
Dry Run
Input
numbers = [2,7,11,15]
target = 9
Initially
2   7   11   15
^            ^
L            R
Step 1
sum = 2 + 15 = 17
17 > 9
Move right.
2   7   11   15
^       ^
L       R
Step 2
sum = 2 + 11 = 13
13 > 9
Move right.
2   7   11   15
^   ^
L   R
Step 3
sum = 2 + 7 = 9
Target found.
Return:
[1,2]
(LeetCode expects 1-based indices, so left + 1 and right + 1.)
Complexity
Time: O(n) (each pointer moves at most n times)
Space: O(1)
Why don't we use a HashMap here?
For the original Two Sum problem (unsorted array), a HashMap gives O(n) time.
For Two Sum II, the array is already sorted, so the two-pointer approach is better because:
✅ Time: O(n)
✅ Space: O(1) (no extra memory)
This is the optimal solution for the problem.


*/