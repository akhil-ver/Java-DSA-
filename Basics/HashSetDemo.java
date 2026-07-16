import java.util.*;

public class HashSetDemo {

    public static void main(String[] args) {

        // Create HashSet
        HashSet<Integer> set = new HashSet<>();

        // ======================================================
        // 1. add(element)
        // Adds an element.
        // Duplicate elements are ignored.
        // ======================================================
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);   // Duplicate, will not be added

        // ======================================================
        // 2. contains(element)
        // Checks whether element exists
        // ======================================================
        System.out.println(set.contains(1));

        // ======================================================
        // 3. remove(element)
        // Removes an element
        // ======================================================
        set.remove(1);

        // ======================================================
        // 4. size()
        // Returns number of elements
        // ======================================================
        System.out.println(set.size());

        // ======================================================
        // 5. isEmpty()
        // Checks whether HashSet is empty
        // ======================================================
        System.out.println(set.isEmpty());

        // ======================================================
        // 6. clear()
        // Removes all elements
        // ======================================================
        // set.clear();

        // ======================================================
        // 7. addAll(Collection)
        // Adds all elements from another collection
        // ======================================================
        HashSet<Integer> set2 = new HashSet<>();

        set2.add(4);
        set2.add(5);

        set.addAll(set2);

        // ======================================================
        // 8. removeAll(Collection)
        // Removes all matching elements
        // ======================================================
        // set.removeAll(set2);

        // ======================================================
        // 9. retainAll(Collection)
        // Keeps only common elements
        // ======================================================
        // set.retainAll(set2);

        // ======================================================
        // 10. containsAll(Collection)
        // Checks if all elements exist
        // ======================================================
        System.out.println(set.containsAll(set2));

        // ======================================================
        // 11. clone()
        // Creates shallow copy
        // ======================================================
        HashSet<Integer> copy =
                (HashSet<Integer>) set.clone();

        // ======================================================
        // 12. equals()
        // Compare two HashSets
        // ======================================================
        System.out.println(set.equals(copy));

        // ======================================================
        // 13. hashCode()
        // Returns hash code
        // ======================================================
        System.out.println(set.hashCode());

        // ======================================================
        // 14. toArray()
        // Converts HashSet to array
        // ======================================================
        Object[] arr = set.toArray();

        // ======================================================
        // 15. toString()
        // Converts HashSet to String
        // ======================================================
        System.out.println(set.toString());

        // ======================================================
        // Iterator
        // ======================================================
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());

        }

        // ======================================================
        // Enhanced For Loop
        // ======================================================
        for (Integer num : set) {

            System.out.println(num);

        }

        // ======================================================
        // forEach() (Java 8)
        // ======================================================
        set.forEach(System.out::println);

        // ======================================================
        // Stream API
        // ======================================================
        set.stream().forEach(System.out::println);

    }
}

/*
| Method          | Purpose                                  |
| --------------- | ---------------------------------------- |
| `add()`         | Add an element                           |
| `contains()`    | Check whether an element exists          |
| `remove()`      | Remove an element                        |
| `size()`        | Number of elements                       |
| `isEmpty()`     | Check if the set is empty                |
| `clear()`       | Remove all elements                      |
| `addAll()`      | Add all elements from another collection |
| `removeAll()`   | Remove all matching elements             |
| `retainAll()`   | Keep only common elements                |
| `containsAll()` | Check whether all elements exist         |
| `clone()`       | Create a shallow copy                    |
| `equals()`      | Compare two sets                         |
| `hashCode()`    | Return hash code                         |
| `toArray()`     | Convert to an array                      |
| `toString()`    | Convert to string representation         |




*/