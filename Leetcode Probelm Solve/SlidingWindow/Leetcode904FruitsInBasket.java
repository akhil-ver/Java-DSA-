package SlidingWindow;
import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < fruits.length; right++) {

            map.put(fruits[right],
                    map.getOrDefault(fruits[right], 0) + 1);

            while (map.size() > 2) {

                map.put(fruits[left],
                        map.get(fruits[left]) - 1);

                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}

/*

Let's dry run your **corrected code** on the example:

```text
fruits = [1,2,3,2,2]
```

### Initial State

```text
left = 0
max = 0
map = {}
```

---

## Iteration 1

### right = 0

```text
fruit = 1
```

Add to map

```text
map = {1=1}
```

Map size = 1 (Valid)

Window

```text
[1]
 L
 R
```

Length

```text
right - left + 1 = 0 - 0 + 1 = 1
```

```text
max = 1
```

---

## Iteration 2

### right = 1

```text
fruit = 2
```

Add

```text
map = {1=1,2=1}
```

Map size = 2 (Valid)

Window

```text
[1,2]
 L R
```

Length

```text
2
```

```text
max = 2
```

---

## Iteration 3

### right = 2

```text
fruit = 3
```

Add

```text
map = {1=1,2=1,3=1}
```

Map size = 3 ❌

Need to shrink.

---

### While Loop

Current

```text
left = 0
```

Decrease count of fruit at left.

```java
map.put(fruits[left], map.get(fruits[left]) - 1);
```

↓

```text
fruit = 1
```

Count becomes

```text
map = {1=0,2=1,3=1}
```

Since count is 0

```text
remove(1)
```

Map becomes

```text
{2=1,3=1}
```

Move left

```text
left = 1
```

Map size = 2 ✅

Stop shrinking.

Window

```text
[2,3]
 ^
     ^
```

Length

```text
2-1+1 = 2
```

```text
max = 2
```

---

## Iteration 4

### right = 3

```text
fruit = 2
```

Increase frequency

```text
map = {2=2,3=1}
```

Window

```text
[2,3,2]
 ^
       ^
```

Map size = 2

Length

```text
3
```

```text
max = 3
```

---

## Iteration 5

### right = 4

```text
fruit = 2
```

Increase count

```text
map = {2=3,3=1}
```

Window

```text
[2,3,2,2]
 ^
         ^
```

Length

```text
4
```

```text
max = 4
```

---

## End

Return

```text
4
```

---

# Table View

| right | Fruit | Map after adding | Shrink?        | left | Window    | max |
| ----: | ----: | ---------------- | -------------- | ---- | --------- | --: |
|     0 |     1 | {1=1}            | No             | 0    | [1]       |   1 |
|     1 |     2 | {1=1,2=1}        | No             | 0    | [1,2]     |   2 |
|     2 |     3 | {1=1,2=1,3=1}    | Yes → remove 1 | 1    | [2,3]     |   2 |
|     3 |     2 | {2=2,3=1}        | No             | 1    | [2,3,2]   |   3 |
|     4 |     2 | {2=3,3=1}        | No             | 1    | [2,3,2,2] |   4 |

---

### Why do we use a `HashMap` instead of a `HashSet`?

A `HashSet` only tells us **whether a fruit type is present**. Here, the same fruit type can appear multiple times in the current window, so we need to know **how many occurrences** remain when we move `left`.

Example:

```text
Window = [2,3,2,2]
Map = {2=3, 3=1}
```

If `left` moves past the first `2`, the window still contains two more `2`s, so we should **decrease its count to 2**, not remove it entirely. That's why a `HashMap<fruit, frequency>` is necessary.




*/