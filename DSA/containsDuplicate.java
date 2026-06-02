package DSA;
import java.util.HashSet;

public class containsDuplicate {

    public static boolean containsDuplicate1(int[] nums) {

        // Create a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // If element already exists, duplicate found
            if (set.contains(nums[i])) {
                return true;
            }

            // Add current element to HashSet
            set.add(nums[i]);
        }

        // No duplicates found
        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        boolean result = containsDuplicate1(nums);

        System.out.println("Contains Duplicate: " + result);
    }
}

/*
Output:
Contains Duplicate: true

Time Complexity: O(n)
- We traverse the array once.
- HashSet contains() and add() take O(1) average time.

Space Complexity: O(n)
- In the worst case, all elements are unique and stored in the HashSet.
*/

/*

Explanation
    Step 1: Create a HashSet
    HashSet<Integer> set = new HashSet<>();
    HashSet stores only unique values.
    It provides O(1) average time complexity for insertion and searching.
    Step 2: Traverse the Array
    for (int i = 0; i < nums.length; i++)
    Visit each element one by one.
    Step 3: Check for Duplicate
    if (set.contains(nums[i])) {
        return true;
    }
    If the current element is already present in the HashSet, it means a duplicate exists.
    Return true immediately.
    Step 4: Add Element to HashSet
    set.add(nums[i]);
    Store the current element for future duplicate checks.
    Step 5: No Duplicate Found
    return false;
    If the loop completes, all elements are unique.
    Example
    Input
    nums = {1, 2, 3, 1}
    Execution
    Element	HashSet	Duplicate?
    1	{1}	No
    2	{1,2}	No
    3	{1,2,3}	No
    1	{1,2,3}	Yes → return true
    Output
    true
    Time Complexity
    Loop Traversal
    for (int i = 0; i < nums.length; i++)
    runs n times.
    HashSet Operations
    set.contains(nums[i]);
    set.add(nums[i]);
    Both take O(1) average time.
    Therefore:
    Time Complexity = O(n)
    where n is the number of elements in the array.
    Space Complexity
    In the worst case, all elements are unique.
    HashSet<Integer> set
    stores n elements.
    Space Complexity = O(n)
    Interview Answer
    Approach: Use a HashSet to store visited elements.
    If an element already exists in the HashSet, return true.
    Otherwise, add it to the HashSet and continue.
    Time Complexity: O(n)
    Space Complexity: O(n)



*/