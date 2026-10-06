class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int left = 0;
        while (left < n && nums[left] != 0) {
            left++;
        }

        int right = left+1;;
        while(right < n ){
            if(nums[right] != 0){
                nums[left++]= nums[right];
                nums[right++]=0;

            }else{
                right++;
            }
        }

        
    }
}

/*

Dry Run
Input
[0,1,0,3,12]
Initially
0 1 0 3 12
L R
Step 1
nums[right] = 1
Move it.
1 0 0 3 12
  L R
Step 2
nums[right] = 0
Skip.
1 0 0 3 12
  L   R
Step 3
nums[right] = 3
Move it.
1 3 0 0 12
    L   R
Step 4
nums[right] = 12
Move it.
1 3 12 0 0
      L
Final Answer:
[1,3,12,0,0]
Even Better Approach (Standard Solution)
Most interviewers expect the following solution because it's simpler and avoids first searching for a zero.
class Solution {
    public void moveZeroes(int[] nums) {

        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] != 0) {

                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
            }
        }
    }
}
Why is this better?
No need to find the first zero.
Works for all cases (positive, negative, duplicates).
Single pass (O(n)).
Constant extra space (O(1)).



*/