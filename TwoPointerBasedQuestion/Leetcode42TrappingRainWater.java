class Solution {
    public int trap(int[] height) {
        int left =0;
        int right = height.length -1;
        int leftMax=0;
        int rightMax=0;
        int total = 0;
        while(left < right){
            if(height[left]<height[right]){
                if(height[left]>leftMax){
                    leftMax = height[left];
                }else{
                    total +=leftMax - height[left];
                }
                left++;
            }else{
                if(height[right] > rightMax){
                    rightMax=height[right];
                }else{
                    total += rightMax  - height[right];
                }
                right--;
            }
        }
        return total;
    }
}

/*

This is the **Two Pointers** solution for the **Trapping Rain Water** problem (LeetCode 42). The idea is to calculate how much water can be trapped between bars after raining.

---

## Intuition

For every index `i`, the water trapped is:

[
\text{Water} = \min(\text{maxLeft}, \text{maxRight}) - \text{height}[i]
]

where:

* `maxLeft` = tallest bar to the left
* `maxRight` = tallest bar to the right

A brute-force solution calculates these for every index, taking **O(n²)** time.

This solution does it in **O(n)** using two pointers.

---

## Variables

```java
int left = 0;
int right = height.length - 1;
```

Two pointers start from both ends.

```java
int leftMax = 0;
int rightMax = 0;
```

Store the highest wall seen so far from the left and right.

```java
int total = 0;
```

Stores total trapped water.

---

# Dry Run

Let's use the classic example.

```text
height = [0,1,0,2,1,0,1,3,2,1,2,1]
```

Expected answer = **6**

---

### Initial State

```text
left = 0
right = 11

leftMax = 0
rightMax = 0

total = 0
```

---

## Iteration 1

```
left = 0 (0)
right = 11 (1)

0 < 1
```

Move left.

```
leftMax = max(0,0)=0

water = 0-0 =0
```

```
left++
```

Now

```
left = 1
total = 0
```

---

## Iteration 2

```
left =1 (1)
right =11 (1)

1 <1 ?

No
```

Move right.

```
rightMax=max(0,1)=1
```

```
right--
```

Now

```
right=10
```

---

## Iteration 3

```
left=1 (1)
right=10 (2)

1<2
```

Move left.

```
leftMax=max(0,1)=1
```

```
left++
```

Now

```
left=2
```

---

## Iteration 4

```
left=2 (0)
right=10 (2)

0<2
```

Move left.

```
leftMax=1
```

Current height =0

```
water =1-0=1
```

```
total=1
left++
```

---

## Iteration 5

```
left=3 (2)
right=10 (2)

2<2 ?

No
```

Move right.

```
rightMax=max(1,2)=2
```

```
right--
```

---

## Iteration 6

```
left=3 (2)
right=9 (1)

2<1 ?

No
```

Move right.

```
rightMax=2

water=2-1=1
```

```
total=2
right--
```

---

## Iteration 7

```
left=3 (2)
right=8 (2)

2<2 ?

No
```

Move right.

```
rightMax=2

water=2-2=0
```

```
right--
```

---

## Iteration 8

```
left=3 (2)
right=7 (3)

2<3
```

Move left.

```
leftMax=max(1,2)=2
```

```
left++
```

---

## Iteration 9

```
left=4 (1)

leftMax=2

water=2-1=1
```

```
total=3
left++
```

---

## Iteration 10

```
left=5 (0)

water=2-0=2
```

```
total=5
left++
```

---

## Iteration 11

```
left=6 (1)

water=2-1=1
```

```
total=6
left++
```

---

Now

```
left=7
right=7

left < right ?

False
```

Loop ends.

Return

```
total = 6
```

Correct answer ✅

---

# Why compare `height[left] < height[right]`?

This is the key idea.

Suppose

```
      ?
     ?
  5      8
```

Left wall = 5

Right wall = 8

The trapped water depends on the **shorter** wall.

```
min(5,8)=5
```

The taller wall (8) doesn't matter because water spills over the shorter wall.

So if

```
height[left] < height[right]
```

we know:

* the left wall is the limiting boundary,
* therefore the amount of water at `left` depends only on `leftMax`,
* we don't need the exact `rightMax` yet because we already have a right wall that is at least as tall as `height[left]`.

Hence we safely process the left side.

Similarly,

```
height[left] >= height[right]
```

means the right side is the limiting boundary, so we process the right side.

---

# Why use `leftMax` and `rightMax`?

Suppose

```
5 2
```

Current left bar = 2

Largest wall seen from left = 5

Then

```
leftMax = 5

water = 5 - 2 = 3
```

If the current bar becomes taller than `leftMax`,

```
5 7
```

then no water can be trapped there. Instead,

```
leftMax = 7
```

The same logic applies symmetrically for `rightMax`.

---

# Time and Space Complexity

* **Time:** `O(n)` — each pointer moves inward at most `n` times.
* **Space:** `O(1)` — only a few variables are used.

---

## Algorithm Summary

1. Start with one pointer at each end.
2. Track the tallest wall seen from the left (`leftMax`) and right (`rightMax`).
3. Always process the side with the **smaller current height** because it is the limiting boundary.
4. If the current bar is lower than its side's maximum, add the difference as trapped water.
5. Move that pointer inward and continue until the pointers meet.

This approach avoids precomputing left and right maximum arrays while still correctly calculating the trapped water in a single pass.



*/
