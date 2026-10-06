package SlidingWindow;
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum =0;
        int ans = Integer.MAX_VALUE;
        for(int right =0;right<nums.length ; right++){
            sum+= nums[right];
            while(sum >= target){
                ans = Math.min(ans,right-left+1);
                sum -=nums[left];
                left++;
            }
        }
        return ans == Integer.MAX_VALUE ? 0: ans;
    }
}
/*

 Your solution is **correct** and is the optimal solution for **LeetCode 209. Minimum Size Subarray Sum**.

### Code

```java
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                ans = Math.min(ans, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
```

---

# Dry Run

### Input

```text
target = 7
nums = [2,3,1,2,4,3]
```

Initial

```text
left = 0
sum = 0
ans = ∞
```

---

## right = 0

Add `2`

```text
sum = 2
```

Not enough.

Window:

```text
[2]
```

---

## right = 1

Add `3`

```text
sum = 5
```

Still less than 7.

Window:

```text
[2,3]
```

---

## right = 2

Add `1`

```text
sum = 6
```

Still less.

Window:

```text
[2,3,1]
```

---

## right = 3

Add `2`

```text
sum = 8
```

Now

```text
sum >= target
```

Window

```text
[2,3,1,2]
```

Length

```text
4
```

```text
ans = 4
```

Shrink

```text
sum = 8 - 2 = 6
left = 1
```

Stop because

```text
sum < 7
```

---

## right = 4

Add `4`

```text
sum = 10
```

Window

```text
[3,1,2,4]
```

Length

```text
4
```

Answer remains

```text
4
```

Shrink

Remove `3`

```text
sum = 7
left = 2
```

Still valid

Window

```text
[1,2,4]
```

Length

```text
3
```

```text
ans = 3
```

Shrink again

Remove `1`

```text
sum = 6
left = 3
```

Stop.

---

## right = 5

Add `3`

```text
sum = 9
```

Window

```text
[2,4,3]
```

Length

```text
3
```

Answer stays

```text
3
```

Shrink

Remove `2`

```text
sum = 7
left = 4
```

Window

```text
[4,3]
```

Length

```text
2
```

```text
ans = 2
```

Shrink again

Remove `4`

```text
sum = 3
left = 5
```

Stop.

---

# Final Answer

```text
2
```

Minimum subarray is

```text
[4,3]
```

---

# Why `while` and not `if`?

Suppose:

```text
target = 7
nums = [2,3,1,2,4,3]
```

At one point:

```text
Window = [3,1,2,4]
sum = 10
```

If you use:

```java
if (sum >= target)
```

you remove only one element:

```text
Window = [1,2,4]
sum = 7
```

But this window is **still valid** and is **shorter**. Using `if` would stop here and miss the opportunity to shrink further.

Using:

```java
while (sum >= target)
```

keeps shrinking the window until it becomes invalid, ensuring you always find the **smallest valid window** ending at the current `right`.

---

## Complexity

* **Time:** `O(n)` — each element is added once and removed once.
* **Space:** `O(1)`.

This is the optimal solution for this problem.



*/