class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxWater = Math.max(maxWater, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}

/*
Dry Run
Input:
height = [1,8,6,2,5,4,8,3,7]
Initially:
L = 0
R = 8
1 8 6 2 5 4 8 3 7
L               R
Area:
min(1,7) × 8 = 8
Maximum = 8
Since
1 < 7
move left.
Next
1 8 6 2 5 4 8 3 7
  L             R
Area
min(8,7) × 7
= 49
Maximum = 49
Now
8 > 7
move right.
Continue similarly until pointers meet.
Final answer = 49
Why Move the Smaller Height?
Suppose
L = 2
R = 9
Heights
2         9
↑         ↑
Area
2 × width
The smaller height (2) limits the water.
If you move the taller pointer:
2       8
The limiting height is still 2, but the width decreases.
Area decreases.
No chance to improve.
Instead, move the smaller height.
Maybe you'll find
8      9
Now
Area = 8 × smaller width
which can be much larger.
Proof by Example
Current:
5             10

Width = 8

Area = 5 × 8 = 40
Move the taller line:
5          9

Width = 7

Area = 5 × 7 = 35
It got worse.
Move the smaller line instead:
8             10

Width = 7

Area = 8 × 7 = 56
The area increased.
This is why the algorithm always moves the shorter line.
Time Complexity
Every iteration moves either left or right.
Each pointer moves at most n times.
Time = O(n)
Space:
O(1)
Small Improvement
Instead of
int maxWater = Integer.MIN_VALUE;
you can write
int maxWater = 0;
The area can never be negative, so 0 is a more natural initial value.



*/