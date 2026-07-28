/*
The **Two Pointer** technique is a common algorithmic approach used to solve array and string problems efficiently. Instead of using nested loops (`O(n²)`), it often reduces the time complexity to **O(n)**.

## What is the Two Pointer Approach?

The two-pointer approach uses **two indices (pointers)** to traverse a data structure such as an array, string, or linked list.

The pointers may:

* Start from opposite ends.
* Start from the same end but move at different speeds.
* Represent the beginning and end of a window.

---

## Theory

Suppose we have an array:

```text
[1, 2, 3, 4, 5, 6]
```

Two pointers:

```text
L = 0               R = 5

1 2 3 4 5 6
^         ^
L         R
```

Depending on the problem:

* Move `L` right.
* Move `R` left.
* Move both.

The goal is to eliminate unnecessary comparisons.

---

# Types of Two Pointer Approach

## 1. Opposite Direction

Pointers start at opposite ends.

```text
1 2 3 4 5 6

L         R
```

Example:

* Pair Sum in sorted array
* Reverse array
* Palindrome checking

### Example

Find two numbers whose sum is 9.

```text
Array = [1,2,3,4,5,6]

L = 1
R = 6

1+6 = 7 (<9)
Move L

2+6 = 8 (<9)
Move L

3+6 = 9
Answer found.
```

Time Complexity:

```
O(n)
```

instead of

```
O(n²)
```

---

## 2. Same Direction

Both pointers move left to right.

```text
Slow
↓

1 2 3 4 5
↑
Fast
```

Used for:

* Remove duplicates
* Move zeros
* Partition arrays

Example:

```text
[1,1,2,2,3]
```

Slow pointer stores unique elements.

---

## 3. Fast and Slow Pointer

One pointer moves faster than the other.

```text
Slow -> 1 step

Fast -> 2 steps
```

Used in linked lists.

Applications:

* Detect cycle
* Find middle node
* Find nth node

Example:

```text
1 → 2 → 3 → 4 → 5

Slow

Fast
```

Fast reaches the end first.

Slow stops at the middle.

---

## 4. Sliding Window (Special Two Pointer)

Both pointers create a window.

```text
L         R

1 2 3 4 5
```

Window expands and shrinks.

Used for:

* Longest substring
* Maximum sum subarray
* Minimum window substring

Example:

```
Window = [2,3,4]
```

Move `R` to expand.

Move `L` to shrink.

---

# When to Use Two Pointer

Use it when:

### 1. Array is sorted

Example:

```
Two Sum II
```

Instead of checking every pair,

```
L
↓

1 2 3 5 8 10
          ↑
          R
```

Move pointers based on the sum.

---

### 2. Need to compare elements from both ends

Examples:

* Palindrome
* Reverse string
* Trapping Rain Water (optimized solution)

---

### 3. Need contiguous subarray/substring

Examples:

* Longest substring without repeating characters
* Minimum size subarray sum

Sliding window is ideal here.

---

### 4. Need to remove duplicates or rearrange

Examples:

* Remove duplicates from sorted array
* Move zeros
* Sort colors (Dutch National Flag)

---

### 5. Linked List problems

Examples:

* Middle node
* Cycle detection
* Happy Number (Floyd's cycle algorithm)

---

# Conditions to Use Two Pointer

Typically use it when:

* ✅ Data is sorted (many problems rely on this).
* ✅ Need linear traversal.
* ✅ Need pair comparisons.
* ✅ Working with contiguous windows.
* ✅ Looking for relationships between two positions.

---

# When NOT to Use Two Pointer

### ❌ 1. Array is unsorted and order matters

Example:

```
Find two numbers summing to target in an unsorted array.
```

Using two pointers directly won't work because pointer movement doesn't reliably increase or decrease the sum.

Instead:

```text
Hash Map → O(n)
```

---

### ❌ 2. Need to compare every pair

Example:

```
Maximum XOR of any pair
```

Every pair may need consideration; two pointers do not help.

---

### ❌ 3. Non-contiguous subsequences

Example:

```
Longest Increasing Subsequence
```

Requires dynamic programming or binary search techniques, not two pointers.

---

### ❌ 4. Random graph/tree traversal

Use:

* DFS
* BFS

Not two pointers.

---

### ❌ 5. Problems requiring backtracking

Examples:

* N-Queens
* Sudoku
* Permutations

Use recursion/backtracking.

---

# Time Complexity

| Method         | Time  |
| -------------- | ----- |
| Brute Force    | O(n²) |
| Two Pointer    | O(n)  |
| Sliding Window | O(n)  |
| Fast & Slow    | O(n)  |

Space complexity is usually:

```
O(1)
```

---

# Common Interview Problems

* Two Sum II (sorted array)
* Container With Most Water
* Trapping Rain Water
* Valid Palindrome
* Reverse String
* Move Zeroes
* Remove Duplicates from Sorted Array
* 3Sum (after sorting)
* 4Sum
* Merge Two Sorted Arrays
* Longest Substring Without Repeating Characters (sliding window)
* Minimum Window Substring
* Linked List Cycle
* Middle of the Linked List

---

## Quick Decision Guide

| Situation                                | Use Two Pointers?      | Why                                      |
| ---------------------------------------- | ---------------------- | ---------------------------------------- |
| Sorted array + pair search               | ✅ Yes                  | Move pointers based on comparison        |
| Compare from both ends                   | ✅ Yes                  | Efficient inward traversal               |
| Contiguous subarray/substring            | ✅ Yes (Sliding Window) | Maintain a moving window in O(n)         |
| Remove duplicates in sorted array        | ✅ Yes                  | Slow/fast pointers overwrite duplicates  |
| Linked list cycle or middle node         | ✅ Yes                  | Fast/slow pointers                       |
| Unsorted array pair sum                  | ❌ Usually No           | Use a hash map instead                   |
| Graph or tree traversal                  | ❌ No                   | Use BFS/DFS                              |
| Backtracking problems                    | ❌ No                   | Use recursion/backtracking               |
| Dynamic programming problems (e.g., LIS) | ❌ No                   | Requires DP or other specialized methods |

**Rule of thumb:** Think of the two-pointer technique whenever you see a **sorted array**, **pair-finding**, **comparison from both ends**, **contiguous subarrays/substrings**, or **fast/slow traversal** in linked lists. It is most effective when moving one or both pointers can safely discard impossible solutions without missing the correct answer.







*/