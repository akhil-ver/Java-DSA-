package DSA;
import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (int num : freqMap.keySet()) {
            int freq = freqMap.get(num);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(num);
        }

        int[] result = new int[k];
        int index = 0;

        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {

            if (bucket[i] != null) {

                for (int num : bucket[i]) {
                    result[index++] = num;

                    if (index == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
/*
LeetCode 347. Top K Frequent Elements, the optimal solution is:
Approach 1: Bucket Sort (Optimal)
Idea
Count frequency of each number using HashMap.
Frequency can be at most n.
Create buckets where index = frequency.
Put numbers into their frequency bucket.
Traverse buckets from high frequency to low frequency and collect k elements.
Complexity
Time  : O(n)
Space : O(n)
Java Code (O(n))
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (int num : freqMap.keySet()) {
            int freq = freqMap.get(num);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(num);
        }

        int[] result = new int[k];
        int index = 0;

        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {

            if (bucket[i] != null) {

                for (int num : bucket[i]) {
                    result[index++] = num;

                    if (index == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
Example
Input:
nums = [1,1,1,2,2,3]
k = 2
Frequency Map
1 → 3
2 → 2
3 → 1
Buckets
bucket[1] = [3]
bucket[2] = [2]
bucket[3] = [1]
Traverse from end:
bucket[3] → 1
bucket[2] → 2
Answer:
[1, 2]
Alternative: Min Heap
Complexity
Time  : O(n log k)
Space : O(n)
Useful when:
k << n
Interviewers usually expect either:
Bucket Sort → O(n) (Best)
Min Heap → O(n log k)



*/