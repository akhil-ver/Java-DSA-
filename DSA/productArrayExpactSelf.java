package DSA;
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] ans = new int[n];

        // Store prefix products
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Multiply with suffix products
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix *= nums[i];
        }

        return ans;
    }
}

/*
238. Product of Array Except Self
explain approach 
LeetCode 238: Product of Array Except Self
Problem:
Given an array nums, return an array answer such that:
answer[i]= 
j

=i
∏
​	
 nums[j]
You must solve it without using division and in O(n) time.
Example
nums = [1,2,3,4]
Output:
[24,12,8,6]
Explanation:
answer[0] = 2×3×4 = 24
answer[1] = 1×3×4 = 12
answer[2] = 1×2×4 = 8
answer[3] = 1×2×3 = 6
Brute Force Approach
For every element, multiply all other elements.
for each i:
    product = 1
    for each j:
        if(i != j)
            product *= nums[j]
Complexity
Time: O(n²)
Space: O(1)
Not efficient for large arrays.
Optimal Approach (Prefix + Suffix Product)
Key Idea
For each index i:
answer[i] = product of left elements × product of right elements
For example:
nums = [1,2,3,4]
For index 2 (3):
Left Product  = 1×2 = 2
Right Product = 4

answer[2] = 2×4 = 8
Step 1: Build Prefix Products
Prefix product means multiplication of all elements before current index.
prefix[0] = 1
prefix[i] = prefix[i-1] * nums[i-1]
For:
nums = [1,2,3,4]
Prefix array:
Index	Prefix
0	1
1	1
2	2
3	6
prefix = [1,1,2,6]
Step 2: Build Suffix Products
Suffix product means multiplication of all elements after current index.
suffix[n-1] = 1
suffix[i] = suffix[i+1] * nums[i+1]
For:
nums = [1,2,3,4]
Suffix array:
Index	Suffix
0	24
1	12
2	4
3	1
suffix = [24,12,4,1]
Step 3: Multiply Prefix and Suffix
answer[i] = prefix[i] * suffix[i]
Index	Prefix	Suffix	Answer
0	1	24	24
1	1	12	12
2	2	4	8
3	6	1	6
Output:
[24,12,8,6]
Space Optimized Approach (Most Asked)
Instead of storing both prefix and suffix arrays, use the answer array itself.
First Pass (Store Prefix)
ans[0] = 1
ans[i] = ans[i-1] * nums[i-1]
After first pass:
ans = [1,1,2,6]
Second Pass (Multiply Suffix)
Maintain a variable:
suffix = 1
Traverse from right to left.
ans[i] *= suffix
suffix *= nums[i]
Dry Run
nums = [1,2,3,4]
Initial:
ans = [1,1,2,6]
suffix = 1
i = 3
ans[3] = 6 * 1 = 6
suffix = 1 * 4 = 4
i = 2
ans[2] = 2 * 4 = 8
suffix = 4 * 3 = 12
i = 1
ans[1] = 1 * 12 = 12
suffix = 12 * 2 = 24
i = 0
ans[0] = 1 * 24 = 24
Result:
[24,12,8,6]
C++ Code (Optimal)
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();

        vector<int> ans(n, 1);

        // Prefix products
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Suffix products
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix *= nums[i];
        }

        return ans;
    }
};
Interview Explanation (30 Seconds)
For each index, the result equals the product of all elements on its left multiplied by the product of all elements on its right. I first store left products in the answer array using a prefix pass. Then I traverse from right to left while maintaining a running suffix product and multiply it with the stored prefix values. This gives O(n) time complexity and O(1) extra space (excluding the output array).
Complexity
Time: O(n)
Extra Space: O(1)
Output Array Space: O(n)


*/