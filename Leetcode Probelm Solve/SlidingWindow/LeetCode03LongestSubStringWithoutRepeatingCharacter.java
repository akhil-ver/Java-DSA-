package SlidingWindow;
import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left =0;
        int right =0;
        int max =0;
        while(right < s.length()){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(max,right-left+1);
            right++;
        } 
        return max;
    }
}

/*

Let's dry run the **correct sliding window algorithm** on a common example:

```text
s = "abcabcbb"
```

Algorithm:

```java
while (right < s.length()) {

    while (set.contains(s.charAt(right))) {
        set.remove(s.charAt(left));
        left++;
    }

    set.add(s.charAt(right));
    max = Math.max(max, right - left + 1);
    right++;
}
```

---

## Initial State

```text
left = 0
right = 0
set = {}
max = 0
```

---

## Iteration 1

```
right = 0
character = 'a'
```

Is `'a'` in set?

```
No
```

Add it.

```
set = {a}
```

Window

```
[a]
 ^
L,R
```

Length

```
0-0+1 = 1
```

```
max = 1
```

Move right.

```
right = 1
```

---

## Iteration 2

```
character = 'b'
```

Not in set.

```
set = {a,b}
```

Window

```
[a b]
 L   R
```

Length

```
1-0+1 = 2
```

```
max = 2
```

Move right.

---

## Iteration 3

```
character = 'c'
```

Add.

```
set = {a,b,c}
```

Window

```
[a b c]
 L     R
```

Length

```
2-0+1 = 3
```

```
max = 3
```

Move right.

---

## Iteration 4

```
right = 3
character = 'a'
```

Already in set.

Current window

```
[a b c]
 ^
left
```

Need to shrink.

### While Loop

Remove left character.

```
remove('a')
```

Set

```
{b,c}
```

Move left.

```
left = 1
```

Now

```
set.contains('a') == false
```

Exit while.

Add new `'a'`.

```
set = {b,c,a}
```

Window

```
b c a
^   ^
L   R
```

Length

```
3-1+1 = 3
```

```
max = 3
```

Move right.

---

## Iteration 5

```
character = 'b'
```

Duplicate.

Current window

```
b c a
^
left
```

Remove

```
remove('b')
```

Set

```
{c,a}
```

Move left.

```
left = 2
```

Now add `'b'`.

```
set = {c,a,b}
```

Window

```
c a b
^   ^
L   R
```

Length

```
4-2+1 = 3
```

```
max = 3
```

---

## Iteration 6

```
character = 'c'
```

Duplicate.

Remove

```
remove('c')
```

Set

```
{a,b}
```

```
left = 3
```

Add `'c'`.

```
set = {a,b,c}
```

Window

```
a b c
^   ^
L   R
```

Length

```
5-3+1 = 3
```

```
max = 3
```

---

## Iteration 7

```
character = 'b'
```

Duplicate.

Current window

```
a b c b
^
left
```

### First removal

Remove `'a'`

```
set = {b,c}
left = 4
```

Still duplicate.

```
set contains b
```

Remove `'b'`

```
set = {c}
left = 5
```

Now duplicate gone.

Add `'b'`.

```
set = {c,b}
```

Window

```
c b
^ ^
L R
```

Length

```
6-5+1 = 2
```

```
max = 3
```

---

## Iteration 8

```
character = 'b'
```

Duplicate.

Current window

```
c b b
^
left
```

Remove `'c'`

```
set = {b}
left = 6
```

Still duplicate.

Remove `'b'`

```
set = {}
left = 7
```

Now add new `'b'`.

```
set = {b}
```

Window

```
b
^
```

Length

```
1
```

```
max = 3
```

---

# Final Answer

```
max = 3
```

The longest substrings without repeating characters are:

* `"abc"`
* `"bca"`
* `"cab"`

All have length **3**.

---

### Why do we remove characters when moving `left`?

The `HashSet` is meant to represent **exactly the characters in the current window** (`s[left...right]`). When the window shrinks, characters leaving the window must also be removed from the set. Otherwise, the set would incorrectly report duplicates for characters that are no longer inside the current window.



*/