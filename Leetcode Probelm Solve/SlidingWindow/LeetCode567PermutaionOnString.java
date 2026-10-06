package SlidingWindow;

import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length())
            return false;

        int[] need = new int[26];
        int[] window = new int[26];

        // Count frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            need[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }

        // Check first window
        if (Arrays.equals(need, window))
            return true;

        // Slide the window
        for (int right = s1.length(); right < s2.length(); right++) {

            // Add new character
            window[s2.charAt(right) - 'a']++;

            // Remove left character
            window[s2.charAt(right - s1.length()) - 'a']--;

            if (Arrays.equals(need, window))
                return true;
        }

        return false;
    }
}
/*

This is **LeetCode 567 - Permutation in String**.

## Idea

We need to check if **any substring of `s2`** is a **permutation of `s1`**.

A permutation has:

* Same characters.
* Same frequencies.
* Same length.

So use a **fixed-size sliding window** of length `s1.length()`.

---

## Example

```text
s1 = "ab"
s2 = "eidbaooo"
```

Need a window of size **2**.

Windows are:

```text
ei
id
db
ba   ← permutation found
ao
oo
oo
```

`"ba"` has the same frequency as `"ab"`.

Answer = `true`.

---

# Approach

Maintain two frequency arrays of size 26.

```text
need[]   -> frequency of s1
window[] -> frequency of current window
```

---

### Step 1

Count characters of `s1`.

```text
s1 = "abc"

need

a =1
b =1
c =1
```

---

### Step 2

Build first window of length `s1.length()`.

Suppose

```text
s2 = "eidbaooo"
```

First window

```text
ei
```

Window frequency

```text
e =1
i =1
```

Compare.

Not equal.

---

### Step 3

Slide one character.

```
ei
 ↑ remove

id
   ↑ add
```

Decrease left character.

Increase right character.

Compare again.

Repeat.

---

## Dry Run

```
s1 = "ab"
s2 = "eidbaooo"
```

Need

```
a=1
b=1
```

---

Window = `"ei"`

```
e=1
i=1
```

Not equal.

---

Slide

Window = `"id"`

```
remove e
add d
```

Still not equal.

---

Slide

Window = `"db"`

```
remove i
add b
```

```
d=1
b=1
```

Not equal.

---

Slide

Window = `"ba"`

```
remove d
add a
```

```
b=1
a=1
```

Matches exactly.

Return

```
true
```

---

# Java Code

```java
class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length())
            return false;

        int[] need = new int[26];
        int[] window = new int[26];

        // Count frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            need[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }

        // Check first window
        if (Arrays.equals(need, window))
            return true;

        // Slide the window
        for (int right = s1.length(); right < s2.length(); right++) {

            // Add new character
            window[s2.charAt(right) - 'a']++;

            // Remove left character
            window[s2.charAt(right - s1.length()) - 'a']--;

            if (Arrays.equals(need, window))
                return true;
        }

        return false;
    }
}
```

---

## Time Complexity

* Building frequency arrays: **O(m)** (`m = s1.length()`)
* Sliding window: **O(n)**
* Comparing two arrays of size 26 each time: **O(26) = O(1)**

Overall:

* **Time:** `O(n)`
* **Space:** `O(26) = O(1)`

---

### Pattern to recognize

This is a **Fixed-Size Sliding Window** problem.

Whenever the question says:

* Find a substring of **exact length `k`**
* Check if it has the same frequency/count as another string

the template is:

```java
// Build first window

// Check first window

// Slide
for (int right = k; right < n; right++) {
    add new character;
    remove old character;

    if (window matches target)
        return true;
}
```

This fixed-window pattern is different from problems like **Longest Substring Without Repeating Characters** or **Fruit Into Baskets**, where the window size changes dynamically.



*/