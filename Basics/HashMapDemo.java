import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // ======================================================
        // 1. put(key, value)
        // Adds a new key-value pair.
        // If key already exists, updates its value.
        // ======================================================
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        // Update value of existing key
        map.put("China", 180);

        // ======================================================
        // 2. get(key)
        // Returns value of key
        // Returns null if key not found
        // ======================================================
        System.out.println(map.get("India"));

        // ======================================================
        // 3. getOrDefault(key, defaultValue)
        // Returns default value if key not present
        // ======================================================
        System.out.println(map.getOrDefault("Russia", 0));

        // ======================================================
        // 4. containsKey(key)
        // Checks whether key exists
        // ======================================================
        System.out.println(map.containsKey("India"));

        // ======================================================
        // 5. containsValue(value)
        // Checks whether value exists
        // ======================================================
        System.out.println(map.containsValue(30));

        // ======================================================
        // 6. size()
        // Returns number of key-value pairs
        // ======================================================
        System.out.println(map.size());

        // ======================================================
        // 7. isEmpty()
        // Returns true if map is empty
        // ======================================================
        System.out.println(map.isEmpty());

        // ======================================================
        // 8. replace(key, value)
        // Replaces value of existing key
        // ======================================================
        map.replace("US", 40);

        // ======================================================
        // 9. replace(key, oldValue, newValue)
        // Replace only if old value matches
        // ======================================================
        map.replace("India", 120, 130);

        // ======================================================
        // 10. putIfAbsent(key, value)
        // Adds only if key does not exist
        // ======================================================
        map.putIfAbsent("Japan", 50);
        map.putIfAbsent("India", 999); // Will not replace

        // ======================================================
        // 11. remove(key)
        // Removes key-value pair
        // ======================================================
        map.remove("Japan");

        // ======================================================
        // 12. remove(key, value)
        // Removes only if both key and value match
        // ======================================================
        map.remove("US", 40);

        // ======================================================
        // 13. keySet()
        // Returns all keys
        // ======================================================
        Set<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println(key);
        }

        // ======================================================
        // 14. values()
        // Returns all values
        // ======================================================
        Collection<Integer> values = map.values();

        for (Integer value : values) {
            System.out.println(value);
        }

        // ======================================================
        // 15. entrySet()
        // Returns key-value entries
        // ======================================================
        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }

        // ======================================================
        // 16. forEach()
        // Java 8 method
        // ======================================================
        map.forEach((key, value) ->
                System.out.println(key + " " + value));

        // ======================================================
        // 17. replaceAll()
        // Modify every value
        // ======================================================
        map.replaceAll((key, value) -> value + 10);

        // ======================================================
        // 18. compute()
        // Compute new value
        // ======================================================
        map.compute("India", (key, value) -> value + 5);

        // ======================================================
        // 19. computeIfAbsent()
        // Compute only if key absent
        // ======================================================
        map.computeIfAbsent("Russia", k -> 70);

        // ======================================================
        // 20. computeIfPresent()
        // Compute only if key present
        // ======================================================
        map.computeIfPresent("China", (k, v) -> v + 20);

        // ======================================================
        // 21. merge()
        // Merge old and new value
        // ======================================================
        map.merge("India", 10, Integer::sum);

        // ======================================================
        // 22. clone()
        // Creates shallow copy
        // ======================================================
        HashMap<String, Integer> copy =
                (HashMap<String, Integer>) map.clone();

        // ======================================================
        // 23. clear()
        // Removes all entries
        // ======================================================
        // map.clear();

        // ======================================================
        // 24. equals()
        // Compare two HashMaps
        // ======================================================
        System.out.println(map.equals(copy));

        // ======================================================
        // 25. hashCode()
        // Returns hash code
        // ======================================================
        System.out.println(map.hashCode());

        // ======================================================
        // 26. toString()
        // Converts map to string
        // ======================================================
        System.out.println(map.toString());

        // ======================================================
        // ITERATOR - Key Iterator
        // ======================================================
        Iterator<String> keyIterator = map.keySet().iterator();

        while (keyIterator.hasNext()) {

            String key = keyIterator.next();

            System.out.println(key + " " + map.get(key));

        }

        // ======================================================
        // ITERATOR - Value Iterator
        // ======================================================
        Iterator<Integer> valueIterator = map.values().iterator();

        while (valueIterator.hasNext()) {

            System.out.println(valueIterator.next());

        }

        // ======================================================
        // ITERATOR - Entry Iterator (Most Preferred)
        // ======================================================
        Iterator<Map.Entry<String, Integer>> iterator =
                map.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<String, Integer> entry = iterator.next();

            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }

    }
}

/*

| Method               | Purpose                                           |
| -------------------- | ------------------------------------------------- |
| `put()`              | Add or update a key-value pair                    |
| `get()`              | Get the value for a key                           |
| `getOrDefault()`     | Return a default value if the key is missing      |
| `containsKey()`      | Check whether a key exists                        |
| `containsValue()`    | Check whether a value exists                      |
| `putIfAbsent()`      | Add only if the key is not already present        |
| `replace()`          | Replace the value for an existing key             |
| `remove()`           | Remove an entry                                   |
| `keySet()`           | Get all keys                                      |
| `values()`           | Get all values                                    |
| `entrySet()`         | Get all key-value pairs (preferred for iteration) |
| `forEach()`          | Iterate using a lambda expression                 |
| `compute()`          | Recalculate a value                               |
| `computeIfAbsent()`  | Compute a value only if the key is missing        |
| `computeIfPresent()` | Compute a value only if the key exists            |
| `merge()`            | Merge old and new values                          |
| `clear()`            | Remove all entries                                |
| `size()`             | Get the number of entries                         |
| `isEmpty()`          | Check if the map is empty                         |
| `clone()`            | Create a shallow copy                             |



*/