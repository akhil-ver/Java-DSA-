class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }    
    }
}

/*

    Problem Statement
        Given an integer array nums, move all 0s to the end while maintaining the relative order of the non-zero elements.
        Example
        Input:
        nums = [0,1,0,3,12]
        Output:
        [1,3,12,0,0]
        Solution 1: Copy Non-Zero Elements Then Fill Zeros
        class Solution {
            public void moveZeroes(int[] nums) {
                int j = 0;

                // Move all non-zero elements to the front
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] != 0) {
                        nums[j] = nums[i];
                        j++;
                    }
                }

                // Fill remaining positions with 0
                while (j < nums.length) {
                    nums[j] = 0;
                    j++;
                }
            }
        }
        Line-by-Line Explanation
        Method Declaration
        public void moveZeroes(int[] nums)
        Meaning
        public → Accessible from anywhere.
        void → Doesn't return anything.
        moveZeroes → Function name.
        int[] nums → Input array.
        Example:
        nums = [0,1,0,3,12]
        Initialize Pointer
        int j = 0;
        Purpose
        j keeps track of where the next non-zero element should be placed.
        Initially:
        j = 0
        Array:
        [0,1,0,3,12]
        ^
        j
        First Loop
        for (int i = 0; i < nums.length; i++)
        Purpose
        Traverse the entire array.
        i = scanning pointer.
        j = placement pointer.
        Iteration 1
        i = 0
        nums[0] = 0
        Check:
        if(nums[i] != 0)
        Condition:
        0 != 0
        False.
        Nothing happens.
        Iteration 2
        i = 1
        nums[1] = 1
        Condition:
        1 != 0
        True.
        Execute:
        nums[j] = nums[i];
        Becomes:
        nums[0] = nums[1];
        Array:
        [1,1,0,3,12]
        Then:
        j++;
        j = 1
        Iteration 3
        i = 2
        nums[2] = 0
        Skip.
        Array:
        [1,1,0,3,12]
        Iteration 4
        i = 3
        nums[3] = 3
        Copy:
        nums[1] = 3
        Array:
        [1,3,0,3,12]
        Increment:
        j = 2
        Iteration 5
        i = 4
        nums[4] = 12
        Copy:
        nums[2] = 12
        Array:
        [1,3,12,3,12]
        Increment:
        j = 3
        After First Loop
        Array:
        [1,3,12,3,12]
        Pointer:
        j = 3
        Important:
        Only first 3 positions are correct.
        [1,3,12, ?, ?]
        Remaining positions contain old values.
        Second Loop
        while (j < nums.length)
        Equivalent:
        while(3 < 5)
        True.
        First Iteration
        nums[3] = 0;
        Array:
        [1,3,12,0,12]
        Increment:
        j = 4
        Second Iteration
        nums[4] = 0;
        Array:
        [1,3,12,0,0]
        Increment:
        j = 5
        Stop
        Condition:
        5 < 5
        False.
        Loop ends.
        Final Output
        [1,3,12,0,0]
        Understanding the Two Pointers
        Before Processing
        [0,1,0,3,12]

        i
        j
        After Finding 1
        [1,1,0,3,12]

            i
            j
        After Finding 3
        [1,3,0,3,12]

                i
            j
        After Finding 12
        [1,3,12,3,12]

                i
                j
        Fill Remaining With Zero
        [1,3,12,0,0]
        Time Complexity
        First loop:
        O(n)
        Second loop:
        O(n)
        Total:
        O(n)
        Because constants are ignored.
        Space Complexity
        Extra variables:
        i
        j
        Only two integers.
        So:
        O(1)
        (Constant space)
        Swap Method (Most Popular Interview Solution)
        class Solution {
            public void moveZeroes(int[] nums) {
                int j = 0;

                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] != 0) {

                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;

                        j++;
                    }
                }
            }
        }
        Dry Run
        Input:
        [0,1,0,3,12]
        i = 1
        Swap:
        nums[1] ↔ nums[0]
        Array:
        [1,0,0,3,12]
        i = 3
        Swap:
        nums[3] ↔ nums[1]
        Array:
        [1,3,0,0,12]
        i = 4
        Swap:
        nums[4] ↔ nums[2]
        Array:
        [1,3,12,0,0]
        Why Does This Work?
        j always points to the first position where a non-zero element should be placed.
        Whenever a non-zero element is found:
        Swap it with nums[j].
        Increase j.
        This automatically pushes all zeros toward the end.
        Interview Explanation
        We use two pointers:
        i scans the array.
        j tracks the position where the next non-zero element should be placed.
        Whenever a non-zero element is found, we move it to position j and increment j.
        After all non-zero elements are placed at the front, the remaining positions are filled with zeros.
        Time Complexity = O(n)
        Space Complexity = O(1).
        This is the standard two-pointer approach for LeetCode 283: Move Zeroes.

*/