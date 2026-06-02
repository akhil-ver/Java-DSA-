package DSA;
import java.util.*;

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            int[] freq = new int[26];

            for (char ch : str.toCharArray()) {
                freq[ch - 'a']++;
            }

            String key = Arrays.toString(freq);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] strs = {
                "eat",
                "tea",
                "tan",
                "ate",
                "nat",
                "bat"
        };

        Solution obj = new Solution();

        List<List<String>> result = obj.groupAnagrams(strs);

        System.out.println("Grouped Anagrams:");

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}


/*
    # LeetCode 49: Group Anagrams (Java) – Complete Explanation of All Approaches

---

# Problem Statement

Given an array of strings, group the anagrams together.

### Example

```java
Input:
["eat","tea","tan","ate","nat","bat"]

Output:
[
 [eat, tea, ate],
 [tan, nat],
 [bat]
]
```

---

# What is an Anagram?

Two strings are anagrams if:

* They contain the same characters.
* Character frequencies are the same.
* Order may be different.

Example:

```text
eat -> tea -> ate
listen -> silent
```

---

# Approach 1: Brute Force

## Idea

Compare every string with every other string.

If two strings are anagrams, put them in the same group.

---

## Algorithm

1. Take first string.
2. Compare with all remaining strings.
3. If anagram, add to same group.
4. Mark visited strings.
5. Repeat.

---

## Code

```java
import java.util.*;

class Solution {

    private boolean isAnagram(String a, String b) {

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        int n = strs.length;

        boolean[] visited = new boolean[n];

        List<List<String>> ans = new ArrayList<>();

        for(int i = 0; i < n; i++) {

            if(visited[i])
                continue;

            List<String> group = new ArrayList<>();

            group.add(strs[i]);
            visited[i] = true;

            for(int j = i + 1; j < n; j++) {

                if(!visited[j] &&
                   isAnagram(strs[i], strs[j])) {

                    group.add(strs[j]);
                    visited[j] = true;
                }
            }

            ans.add(group);
        }

        return ans;
    }
}
```

---

## Complexity

For every comparison:

```text
Sorting = O(k log k)
```

Total:

```text
O(n² × k log k)
```

Very slow.

---

# Approach 2: Sorting as Key (Most Popular)

## Observation

All anagrams produce the same sorted string.

Example:

```text
eat -> aet
tea -> aet
ate -> aet
```

Use sorted string as a key in HashMap.

---

## Dry Run

Input:

```java
["eat","tea","tan","ate","nat","bat"]
```

### eat

```text
sorted = aet
```

Map:

```text
aet -> [eat]
```

---

### tea

```text
sorted = aet
```

Map:

```text
aet -> [eat, tea]
```

---

### ate

```text
sorted = aet
```

Map:

```text
aet -> [eat, tea, ate]
```

---

### tan

```text
sorted = ant
```

Map:

```text
ant -> [tan]
```

---

## Code

```java
import java.util.*;

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map =
                new HashMap<>();

        for(String str : strs) {

            char[] arr = str.toCharArray();

            Arrays.sort(arr);

            String key = new String(arr);

            map.computeIfAbsent(
                    key,
                    k -> new ArrayList<>())
                    .add(str);
        }

        return new ArrayList<>(map.values());
    }
}
```

---

## Complexity

For every string:

```text
Sorting = O(k log k)
```

Total:

```text
O(n × k log k)
```

Space:

```text
O(n × k)
```

---

# Approach 3: Frequency Array + HashMap (Optimal)

## Observation

Anagrams have the same character frequencies.

Instead of sorting:

```text
eat

a = 1
e = 1
t = 1
```

Create frequency array:

```text
[1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0]
```

Convert it into a string key.

---

## Dry Run

### eat

```java
freq[0] = 1
freq[4] = 1
freq[19] = 1
```

Key:

```text
#1#0#0#0#1#0...#1...
```

Map:

```text
key -> [eat]
```

---

### tea

Same frequency.

Same key.

```text
key -> [eat, tea]
```

---

### ate

Same key.

```text
key -> [eat, tea, ate]
```

---

## Code

```java
import java.util.*;

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map =
                new HashMap<>();

        for(String str : strs) {

            int[] freq = new int[26];

            for(char ch : str.toCharArray()) {
                freq[ch - 'a']++;
            }

            StringBuilder key =
                    new StringBuilder();

            for(int count : freq) {
                key.append("#")
                   .append(count);
            }

            map.computeIfAbsent(
                    key.toString(),
                    k -> new ArrayList<>())
                    .add(str);
        }

        return new ArrayList<>(map.values());
    }
}
```

---

## Complexity

For each string:

```text
Frequency Count = O(k)

Create Key = O(26)
```

Total:

```text
O(n × k)
```

Space:

```text
O(n × k)
```

This is the best solution.

---

# Approach 4: Arrays.toString(freq)

Instead of manually building key:

```java
String key = Arrays.toString(freq);
```

Example:

```text
[1, 0, 0, 0, 1, 0, 0, ...]
```

Use it directly as HashMap key.

---

## Code

```java
import java.util.*;

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map =
                new HashMap<>();

        for(String str : strs) {

            int[] freq = new int[26];

            for(char ch : str.toCharArray()) {
                freq[ch - 'a']++;
            }

            String key =
                    Arrays.toString(freq);

            map.computeIfAbsent(
                    key,
                    k -> new ArrayList<>())
                    .add(str);
        }

        return new ArrayList<>(map.values());
    }
}
```

---

## Complexity

```text
O(n × k)
```

Easy and clean.

---

# Approach 5: Arrays.hashCode(freq)

Some students think:

```java
int hash = Arrays.hashCode(freq);
```

Then use:

```java
HashMap<Integer,List<String>>
```

---

## Why Not?

Because hash collisions are possible.

Example:

```text
Different frequency arrays
can generate same hash value.
```

Then unrelated words may end up in the same group.

Therefore:

❌ Not recommended.

---

# Interview Answer

When interviewer asks:

### Solution 1

```text
Brute Force
O(n² × k log k)
```

---

### Solution 2

```text
Sort every string

HashMap<sortedString,List<String>>

O(n × k log k)
```

Most common solution.

---

### Solution 3

```text
Frequency Array + HashMap

O(n × k)
```

Best solution.

---

# Final Interview-Ready Code (Recommended)

```java
import java.util.*;

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map =
                new HashMap<>();

        for(String str : strs) {

            int[] freq = new int[26];

            for(char ch : str.toCharArray()) {
                freq[ch - 'a']++;
            }

            String key =
                    Arrays.toString(freq);

            map.computeIfAbsent(
                    key,
                    k -> new ArrayList<>())
                    .add(str);
        }

        return new ArrayList<>(map.values());
    }
}
```

### Complexity

```text
Time  : O(n × k)
Space : O(n × k)
```

This is the approach I would write in a Java interview after first explaining the sorting approach and then optimizing it using a frequency array.




*/
