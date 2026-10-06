package SlidingWindow;

/*
# Sliding Window Technique – Complete Explanation

The **Sliding Window** technique is an algorithmic approach used to solve problems involving **arrays, strings, or lists** by maintaining a window (a continuous subarray or substring) that moves from left to right. It reduces the time complexity from **O(n²)** to **O(n)** in many problems.

---

# What is a Sliding Window?

A **window** is a continuous portion of an array or string.

Example:

```
Array = [2, 4, 1, 6, 8, 3]

Window of size 3:

[2,4,1]
  [4,1,6]
    [1,6,8]
      [6,8,3]
```

Instead of recalculating every window from scratch, we **slide** the window by removing the left element and adding the next right element.

---

# Types of Sliding Window

There are **two main types**.

## 1. Fixed Size Sliding Window

The window size remains constant.

Example:

* Maximum sum of subarray of size K
* Average of every K elements
* First negative number in every window

Window:

```
K = 3

1 2 3 4 5 6

Window:
[1 2 3]
  [2 3 4]
    [3 4 5]
      [4 5 6]
```

---

## 2. Variable Size Sliding Window

The window size changes depending on a condition.

Example:

* Longest substring without repeating characters
* Smallest subarray with sum ≥ K
* Longest substring with at most K distinct characters

Window expands and shrinks.

```
l                     r
↓

1 2 3 4 5

Expand →
Shrink ←
```

---

# When to Use Sliding Window

Use Sliding Window when:

✅ Problem involves

* Array
* String
* Continuous Subarray
* Continuous Substring

Look for words like:

* Longest
* Shortest
* Maximum
* Minimum
* Count
* Sum
* Average

---

# Conditions for Sliding Window

Sliding Window works when the problem involves **contiguous elements**.

Examples:

```
Subarray ✔

2 3 4

Substring ✔

abc

Subsequence ✘

a c e
```

---

# Fixed Window Algorithm

Suppose window size = K

Steps

### Step 1

Take first K elements.

### Step 2

Calculate answer.

### Step 3

Slide window

```
Remove left element

Add right element
```

Repeat until end.

---

Example

Find maximum sum of size K.

```
Array

2 5 1 8 2 9 1

K = 3
```

Windows

```
2 5 1 = 8

5 1 8 = 14

1 8 2 = 11

8 2 9 = 19

2 9 1 = 12
```

Maximum = **19**

---

Pseudo Code

```
sum = first K elements

ans = sum

for i = K to n-1

    sum += arr[i]

    sum -= arr[i-K]

    ans = max(ans, sum)
```

Time Complexity

```
O(n)
```

Space

```
O(1)
```

---

# Variable Window Algorithm

Here window size changes.

Two pointers:

```
left

right
```

---

General Process

```
Expand window

↓

Condition satisfied?

↓

No

Expand

↓

Yes

Process answer

↓

Shrink window

↓

Repeat
```

---

Template

```
left = 0

for right in range(n):

    include arr[right]

    while condition is invalid:

        remove arr[left]

        left++

    update answer
```

---

# How Expansion Works

```
l
r

1 2 3 4 5

↓

Expand

l
  r

1 2 3 4 5

↓

Expand

l
    r

1 2 3 4 5
```

---

# How Shrinking Works

```
l
      r

1 2 3 4 5

Condition violated

↓

Move left

  l
      r

1 2 3 4 5
```

---

# Conditions in Variable Window

Different problems have different conditions.

---

## Condition 1

### Sum greater than K

Example

Smallest subarray with sum ≥ K

Expand until

```
sum >= K
```

Then shrink.

---

## Condition 2

Unique characters

Example

Longest substring without repeating characters

Expand

If duplicate occurs

Shrink until duplicate removed.

---

## Condition 3

At most K distinct characters

Expand

If distinct > K

Shrink.

---

## Condition 4

Exactly K distinct characters

Usually

```
Exactly K

=

AtMost(K)

-

AtMost(K-1)
```

---

## Condition 5

Maximum frequency constraint

Example

Character Replacement

Shrink if

```
window size

-

max frequency

>

K
```

---

# Fixed vs Variable Window

| Fixed Window        | Variable Window   |
| ------------------- | ----------------- |
| Size fixed          | Size changes      |
| Easier              | Slightly harder   |
| One loop            | One loop + while  |
| Remove one, add one | Expand and shrink |
| O(n)                | O(n)              |

---

# Common Sliding Window Problems

## Fixed Window

* Maximum sum of K elements
* Average of K elements
* Maximum in every window
* First negative in every window
* Count distinct in every window

---

## Variable Window

* Longest substring without repeating characters
* Minimum window substring
* Fruits into baskets
* Longest repeating character replacement
* Minimum size subarray sum
* Longest substring with K unique characters
* Permutation in string
* Find all anagrams

---

# Time Complexity

Both Fixed and Variable Sliding Window usually run in:

```
O(n)
```

Reason:

Each element is added to the window **once** and removed **at most once**.

---

# Advantages

* Reduces nested loops.
* Improves **O(n²)** solutions to **O(n)** in many cases.
* Uses constant extra space in most problems.
* Easy to implement after understanding the pattern.

---

# Limitations

* Works only for **contiguous** (continuous) subarrays or substrings.
* Not suitable for arbitrary subsequences.
* Some problems (especially with negative numbers affecting sums) may require different techniques like prefix sums or hashing instead of a simple sliding window.

---

# Master Template (Variable Sliding Window)

```python
left = 0
answer = 0

for right in range(len(arr)):
    # Include current element
    add(arr[right])

    # Shrink while window is invalid
    while not valid_window():
        remove(arr[left])
        left += 1

    # Update result
    answer = max(answer, right - left + 1)
```

---

# Quick Decision Guide

| If the problem says...                 | Use                                                 |
| -------------------------------------- | --------------------------------------------------- |
| Fixed size `K` window                  | Fixed Sliding Window                                |
| Longest continuous subarray/substring  | Variable Sliding Window                             |
| Shortest continuous subarray/substring | Variable Sliding Window                             |
| Maximum/Minimum sum of size `K`        | Fixed Sliding Window                                |
| No repeating characters                | Variable Sliding Window                             |
| At most `K` distinct elements          | Variable Sliding Window                             |
| Exactly `K` distinct elements          | Variable Sliding Window (`AtMost(K) - AtMost(K-1)`) |
| Continuous array/string optimization   | Sliding Window                                      |

**Rule of thumb:** Whenever you see **continuous (contiguous) subarrays or substrings** and need an efficient solution, think of the Sliding Window technique first.





*/