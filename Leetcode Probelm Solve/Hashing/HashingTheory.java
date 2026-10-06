/*
# Hashing in Java – Complete Theory (HashMap & HashSet)

Hashing is one of the most important concepts in Data Structures and Algorithms. More than **35% of coding interview questions** use hashing directly or indirectly.

---

# 1. What is Hashing?

**Definition:**
Hashing is a technique used to store and retrieve data in **O(1)** average time using a **hash function**.

Instead of searching every element one by one, hashing directly computes where an element should be stored.

### Example

Suppose we store roll numbers.

```
Keys

101
205
309
402
```

Hash Function

```
index = key % 10
```

Then

| Key | Index |
| --- | ----- |
| 101 | 1     |
| 205 | 5     |
| 309 | 9     |
| 402 | 2     |

Memory

```
Index

0
1 → 101
2 → 402
3
4
5 → 205
6
7
8
9 → 309
```

Instead of searching the whole array, we directly go to the index.

---

# 2. What is a Hash Function?

A hash function converts a key into an integer index.

```
hash(key) → index
```

Example

```
hash(25)

25 % 10 = 5

Store at index 5
```

Good Hash Function

✔ Fast

✔ Uniform distribution

✔ Deterministic

---

# 3. Collision

Sometimes two keys generate the same index.

Example

```
21 % 10 = 1

31 % 10 = 1
```

Both want index 1.

This is called **Collision**.

```
Index

1

21
31
```

---

# Collision Handling

## 1. Chaining

Store multiple elements using Linked List.

```
Index 1

21 → 31 → 41
```

Java's HashMap internally uses

* Linked List
* Red-Black Tree (when many collisions occur)

---

## 2. Open Addressing

Instead of linked list, search another empty slot.

Examples

* Linear Probing
* Quadratic Probing
* Double Hashing

Java HashMap **does NOT use Open Addressing**.

---

# 4. Time Complexity

| Operation | Average | Worst |
| --------- | ------- | ----- |
| Search    | O(1)    | O(n)  |
| Insert    | O(1)    | O(n)  |
| Delete    | O(1)    | O(n)  |

Average is O(1) because collisions are usually few.

---

# Java Hashing Classes

```
Collection

         Set
          |
      HashSet

Map
 |
HashMap
```

---

# HashMap

Stores

```
<Key, Value>
```

Example

```
101 → Akhil

102 → Rahul

103 → Mohan
```

Java

```java
HashMap<Integer, String> map = new HashMap<>();
```

---

# Internal Working of HashMap

Step 1

Calculate HashCode

```
key.hashCode()
```

↓

Step 2

Compress to bucket

```
hash % bucketSize
```

↓

Step 3

Store Entry

```
Bucket

0

1

2

3

4

5

(Key, Value)
```

---

# Structure of HashMap

```
HashMap

Bucket 0

Bucket 1

Bucket 2

Bucket 3

Bucket 4

Bucket 5

Each Bucket stores

(Key, Value)
```

If collision occurs

```
Bucket

↓

(Key1,Value1)

↓

(Key2,Value2)

↓

(Key3,Value3)
```

---

# HashMap Syntax

```java
HashMap<Integer, String> map = new HashMap<>();
```

---

# Insert

```java
map.put(1, "Akhil");
map.put(2, "Rahul");
map.put(3, "Mohan");
```

---

# Retrieve

```java
System.out.println(map.get(2));
```

Output

```
Rahul
```

---

# Check Key

```java
map.containsKey(2);
```

Returns

```
true
```

---

# Check Value

```java
map.containsValue("Rahul");
```

---

# Remove

```java
map.remove(2);
```

---

# Size

```java
map.size();
```

---

# Empty

```java
map.isEmpty();
```

---

# Clear

```java
map.clear();
```

---

# Iterate

## Keys

```java
for(Integer key : map.keySet()){
    System.out.println(key);
}
```

---

## Values

```java
for(String value : map.values()){
    System.out.println(value);
}
```

---

## Key + Value

```java
for(Map.Entry<Integer,String> entry : map.entrySet()){

    System.out.println(entry.getKey()+" "+entry.getValue());

}
```

---

# HashMap Example

```java
HashMap<String,Integer> marks = new HashMap<>();

marks.put("Math",90);
marks.put("Science",95);
marks.put("English",88);

System.out.println(marks.get("Science"));
```

Output

```
95
```

---

# Frequency Count (Most Important)

Input

```
[1,2,2,3,3,3]
```

```java
HashMap<Integer,Integer> freq = new HashMap<>();

for(int num : nums){
    freq.put(num, freq.getOrDefault(num,0)+1);
}
```

Result

```
1 → 1

2 → 2

3 → 3
```

Used in

* Top K Frequent
* Majority Element
* Valid Anagram
* Subarray Sum Equals K
* Longest Consecutive Sequence

---

# HashSet

HashSet stores

```
Only Unique Values
```

No duplicate allowed.

Example

```java
HashSet<Integer> set = new HashSet<>();
```

---

# Internal Structure

```
HashSet

↓

HashMap

↓

Buckets
```

A **HashSet is internally backed by a HashMap**. Each element in the set becomes a key in the underlying map, with a dummy value.

---

# Insert

```java
set.add(10);

set.add(20);

set.add(30);
```

---

# Duplicate

```java
set.add(20);
```

Ignored.

Result

```
10

20

30
```

---

# Contains

```java
set.contains(20);
```

Output

```
true
```

---

# Remove

```java
set.remove(20);
```

---

# Size

```java
set.size();
```

---

# Iterate

```java
for(int num : set){

    System.out.println(num);

}
```

---

# HashSet Example

```java
HashSet<String> cities = new HashSet<>();

cities.add("Delhi");
cities.add("Mumbai");
cities.add("Chennai");
cities.add("Delhi");

System.out.println(cities);
```

Output

```
Delhi
Mumbai
Chennai
```

Only unique values remain.

---

# HashMap vs HashSet

| Feature        | HashMap                          | HashSet             |
| -------------- | -------------------------------- | ------------------- |
| Stores         | Key-Value Pair                   | Only Value          |
| Duplicate Keys | No                               | No Duplicate Values |
| Null           | 1 Null Key, Multiple Null Values | One Null Value      |
| Ordering       | No                               | No                  |
| Search         | O(1)                             | O(1)                |
| Insert         | O(1)                             | O(1)                |
| Delete         | O(1)                             | O(1)                |
| Uses           | Mapping                          | Uniqueness          |

---

# When to Use Which?

| Problem                      | Data Structure            |
| ---------------------------- | ------------------------- |
| Two Sum                      | HashMap                   |
| Contains Duplicate           | HashSet                   |
| Valid Anagram                | HashMap / Frequency Array |
| Top K Frequent               | HashMap                   |
| Group Anagrams               | HashMap                   |
| Longest Consecutive Sequence | HashSet                   |
| Intersection of Arrays       | HashSet                   |
| First Unique Character       | HashMap                   |

---

# HashMap Memory Representation

```
HashMap
    │
    ▼
+---------+
| Bucket0 | → null
+---------+
| Bucket1 | → (101,"Akhil")
+---------+
| Bucket2 | → (102,"Rahul") → (112,"John")
+---------+
| Bucket3 | → null
+---------+
| Bucket4 | → (104,"Mohan")
+---------+
```

---

# HashSet Memory Representation

```
HashSet
    │
    ▼
+---------+
| Bucket0 | → null
+---------+
| Bucket1 | → 20
+---------+
| Bucket2 | → 40 → 12
+---------+
| Bucket3 | → 35
+---------+
```

---

# Interview Cheat Sheet

| Question                                 | Answer                                                                      |
| ---------------------------------------- | --------------------------------------------------------------------------- |
| What is hashing?                         | Mapping keys to bucket indices using a hash function for fast lookup.       |
| Average search time?                     | O(1)                                                                        |
| Worst search time?                       | O(n)                                                                        |
| What causes collisions?                  | Different keys map to the same bucket.                                      |
| How does Java HashMap handle collisions? | Linked List initially, then Red-Black Tree when a bucket becomes too large. |
| Is HashMap ordered?                      | No (use `LinkedHashMap` for insertion order or `TreeMap` for sorted order). |
| Can HashMap store null?                  | Yes, one null key and multiple null values.                                 |
| Can HashSet store duplicates?            | No.                                                                         |
| Is HashSet backed by HashMap?            | Yes.                                                                        |
| Difference between HashMap and HashSet?  | `HashMap` stores key-value pairs; `HashSet` stores only unique values.      |

### Summary

* **Hashing** enables average **O(1)** insert, search, and delete operations.
* **HashMap** is ideal for storing **key-value mappings** (e.g., frequencies, indices, lookup tables).
* **HashSet** is ideal for checking **uniqueness** and **fast membership tests**.
* Most interview problems involving frequencies, complements, duplicate detection, or fast lookups are solved using **HashMap** or **HashSet**.


HashMap vs HashSet feature comparison

Relative capability across common features (1 = supported, 0 = not supported).

feature	HashMap	HashSet
Key-Value	1	0
Unique Elements	0	1
Lookup by Key	1	0
Duplicate Prevention	0	1

*/