package PrefixSum;
import java.util.HashMap;
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
/*

Let's dry run the algorithm using a common example:

```text
nums = [1, 2, 3]
k = 3
```

### Initial State

```text
map = {0=1}
sum = 0
count = 0
```

Why `map = {0=1}`?

It means we've seen a prefix sum of `0` once (before the array starts). This allows us to count subarrays that begin at index `0`.

---

## Iteration 1

**num = 1**

### Step 1: Update prefix sum

```text
sum = 0 + 1 = 1
```

### Step 2: Check if `(sum - k)` exists

```text
sum - k = 1 - 3 = -2
```

Is `-2` in the map?

```text
No
```

So,

```text
count = 0
```

### Step 3: Store current prefix sum

```text
map.put(1,1)
```

Map becomes

```text
{0=1, 1=1}
```

---

## Iteration 2

**num = 2**

### Step 1

```text
sum = 1 + 2 = 3
```

### Step 2

```text
sum - k = 3 - 3 = 0
```

Is `0` in the map?

Yes.

```text
map.get(0) = 1
```

So,

```text
count += 1
count = 1
```

Why?

A previous prefix sum of `0` means the subarray after that point (index `0` to `1`) sums to `3`.

Subarray:

```text
[1,2]
```

### Step 3

Store current prefix sum

```text
map.put(3,1)
```

Map:

```text
{0=1, 1=1, 3=1}
```

---

## Iteration 3

**num = 3**

### Step 1

```text
sum = 3 + 3 = 6
```

### Step 2

```text
sum - k = 6 - 3 = 3
```

Is `3` present?

Yes.

```text
map.get(3)=1
```

So,

```text
count += 1
count = 2
```

Subarray:

```text
[3]
```

### Step 3

Store current prefix sum

```text
map.put(6,1)
```

Map:

```text
{0=1,1=1,3=1,6=1}
```

---

## Final Answer

```text
count = 2
```

Subarrays are

```text
[1,2]
[3]
```

---

# A More Interesting Example

Let's dry run:

```text
nums = [1,1,1]
k = 2
```

### Initial

```text
map = {0=1}
sum = 0
count = 0
```

| num | sum | sum-k | Found?  | count | map after update  |
| --- | --: | ----: | ------- | ----: | ----------------- |
| 1   |   1 |    -1 | No      |     0 | {0=1,1=1}         |
| 1   |   2 |     0 | Yes (1) |     1 | {0=1,1=1,2=1}     |
| 1   |   3 |     1 | Yes (1) |     2 | {0=1,1=1,2=1,3=1} |

Answer:

```text
2
```

Subarrays:

```text
[1,1]  (index 0-1)
[1,1]  (index 1-2)
```

---

# Why do we use `sum - k`?

Suppose the current prefix sum is:

```text
sum = 8
```

and

```text
k = 3
```

We need a previous prefix sum:

```text
previous = 8 - 3 = 5
```

Because

```text
currentPrefix - previousPrefix = subarraySum
8 - 5 = 3
```

So if we've seen a prefix sum of `5` before, then the elements between that previous position and the current position form a subarray whose sum is `3`.

This is exactly what the line below checks:

```java
if (map.containsKey(sum - k)) {
    count += map.get(sum - k);
}
```

The map stores **how many times each prefix sum has occurred**, allowing the algorithm to count all valid subarrays ending at the current index in **O(1)** time per element.


*/