import java.util.*;
class Solution {
    public int triangleNumber(int[] nums) {

        Arrays.sort(nums);

        int count = 0;
        int n = nums.length;

        for (int k = n - 1; k >= 2; k--) {

            int left = 0;
            int right = k - 1;

            while (left < right) {

                if (nums[left] + nums[right] > nums[k]) {

                    count += (right - left);
                    right--;

                } else {

                    left++;
                }
            }
        }

        return count;
    }
}

/*


Dry Run
Input
nums = [2,2,3,4]
Sort
2 2 3 4
k = 3
Largest side
2 2 3 4
      K
Pointers
2 2 3 4
L   R K
Check
2 + 3 = 5

5 > 4
Valid.
Count
right-left

2-0 = 2
Current
count = 2
Move
right--
Now
2 2 3 4
L R   K
Check
2+2=4

4>4 ?

False
Move
left++
Loop ends.
k = 2
Largest side
2 2 3
    K
Pointers
2 2 3
L R K
Check
2+2=4

4>3
Valid.
Count
right-left

1
Total
count = 3
Done.
Output
3
Why count += (right - left)?
Suppose
2 3 4 5 6
L     R   K
If
2 + 5 > 6
is true, then:
3 + 5 > 6
4 + 5 > 6
are also true because the array is sorted and those values are larger than 2.
So instead of checking each pair individually, you can count them all at once:
count += right - left
This optimization is what reduces the complexity from O(n³) to O(n²).
Complexity
Sorting: O(n log n)
Two-pointer traversal: O(n²)
Overall: O(n²)
Space: O(1) (excluding the sort implementation)


*/