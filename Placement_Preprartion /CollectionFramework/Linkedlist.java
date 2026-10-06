import java.util.*;
public class Linkedlist {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Python");

        System.out.println(list);

        list.add(1, "C++");
        System.out.println(list);
        list.addFirst("HTML");
        System.out.println(list);
        list.addLast("Spring");
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.set(1, "JavaScript");
        list.remove();
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove("Python");
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("Java"));
        System.out.println(list.indexOf("Java"));
        System.out.println(list.lastIndexOf("Java"));
        list.offer("SQL");

        list.offerFirst("HTML");

        list.offerLast("Spring");

        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        System.out.println(list.poll());
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());
        list.push("Java");
        System.out.println(list.pop());
        System.out.println(list.element());
        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }


        LinkedList<String> copy = (LinkedList<String>) list.clone();

        String[] arr = list.toArray(new String[0]);


        LinkedList<String> list2 = new LinkedList<>();
        list2.add("SQL");
        list2.add("Oracle");

        list.addAll(list2);
        list.removeAll(list2);
        list.retainAll(list2);
        System.out.println(list.containsAll(list2));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (String s : list) {
            System.out.println(s);
        }
        Iterator<String> it1 = list.iterator();

        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
        ListIterator<String> itr = list.listIterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        Iterator<String> itr1 = list.descendingIterator();

        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        list.forEach(System.out::println);
        list.stream().forEach(System.out::println);

        /*
        | Operation             | Time Complexity |
        | --------------------- | --------------- |
        | addFirst()            | O(1)            |
        | addLast()             | O(1)            |
        | removeFirst()         | O(1)            |
        | removeLast()          | O(1)            |
        | getFirst()            | O(1)            |
        | getLast()             | O(1)            |
        | get(index)            | O(n)            |
        | add(index, element)   | O(n)            |
        | remove(index)         | O(n)            |
        | contains()            | O(n)            |
        | indexOf()             | O(n)            |
        | lastIndexOf()         | O(n)            |
        | size()                | O(1)            |
        | clear()               | O(n)            |
        | offer()/poll()/peek() | O(1)            |

        
        
        
        
        */





    }
}
/*


| #  | Method                      | What it does                                   | How it works                                                                      |

| 1  | `add(E e)`                  | Adds an element to the end.                    | Creates a new node and links it after the last node.                              |
| 2  | `add(int index, E e)`       | Inserts an element at a specific position.     | Traverses to the index, updates previous/next links, and inserts the new node.    |
| 3  | `addFirst(E e)`             | Adds an element at the beginning.              | Creates a new head node and points it to the old head.                            |
| 4  | `addLast(E e)`              | Adds an element at the end.                    | Creates a new tail node and updates the last node's next reference.               |
| 5  | `get(int index)`            | Returns the element at a given index.          | Traverses from the head or tail (whichever is closer) until the index is reached. |
| 6  | `getFirst()`                | Returns the first element.                     | Reads the data stored in the head node.                                           |
| 7  | `getLast()`                 | Returns the last element.                      | Reads the data stored in the tail node.                                           |
| 8  | `set(int index, E e)`       | Replaces the element at an index.              | Traverses to the node and updates its value.                                      |
| 9  | `remove()`                  | Removes the first element.                     | Removes the head node and makes the next node the new head.                       |
| 10 | `remove(int index)`         | Removes the element at an index.               | Traverses to the node and reconnects its neighboring nodes.                       |
| 11 | `remove(Object o)`          | Removes the first matching element.            | Searches for the object, then unlinks that node.                                  |
| 12 | `removeFirst()`             | Removes the first node.                        | Moves the head pointer to the next node.                                          |
| 13 | `removeLast()`              | Removes the last node.                         | Updates the previous node to become the new tail.                                 |
| 14 | `clear()`                   | Removes all elements.                          | Unlinks all nodes so the list becomes empty.                                      |
| 15 | `size()`                    | Returns the number of elements.                | Returns the internally maintained count of nodes.                                 |
| 16 | `isEmpty()`                 | Checks whether the list has elements.          | Returns `true` if the size is 0.                                                  |
| 17 | `contains(Object o)`        | Checks if an element exists.                   | Traverses the list comparing each node's value.                                   |
| 18 | `indexOf(Object o)`         | Returns the first index of an element.         | Traverses from the beginning until a match is found.                              |
| 19 | `lastIndexOf(Object o)`     | Returns the last index of an element.          | Searches through the list and remembers the last matching position.               |
| 20 | `offer(E e)`                | Adds an element as a queue operation.          | Internally adds the node at the end.                                              |
| 21 | `offerFirst(E e)`           | Adds an element at the front.                  | Inserts a new head node.                                                          |
| 22 | `offerLast(E e)`            | Adds an element at the end.                    | Inserts a new tail node.                                                          |
| 23 | `peek()`                    | Returns the first element without removing it. | Reads the head node's value. Returns `null` if empty.                             |
| 24 | `peekFirst()`               | Returns the first element without removing it. | Same as `peek()`.                                                                 |
| 25 | `peekLast()`                | Returns the last element without removing it.  | Reads the tail node's value.                                                      |
| 26 | `poll()`                    | Removes and returns the first element.         | Removes the head node and returns its value. Returns `null` if empty.             |
| 27 | `pollFirst()`               | Removes and returns the first element.         | Same as `poll()`.                                                                 |
| 28 | `pollLast()`                | Removes and returns the last element.          | Removes the tail node and returns its value.                                      |
| 29 | `push(E e)`                 | Pushes an element onto the stack.              | Adds a new node at the beginning (LIFO).                                          |
| 30 | `pop()`                     | Pops the top stack element.                    | Removes and returns the first node.                                               |
| 31 | `element()`                 | Returns the first element.                     | Reads the head node. Throws an exception if the list is empty.                    |
| 32 | `iterator()`                | Provides forward traversal.                    | Returns an `Iterator` that visits nodes from head to tail.                        |
| 33 | `descendingIterator()`      | Provides backward traversal.                   | Returns an iterator that visits nodes from tail to head.                          |
| 34 | `listIterator()`            | Provides bidirectional traversal.              | Returns a `ListIterator` that can move forward and backward, and modify the list. |
| 35 | `clone()`                   | Creates a shallow copy of the list.            | Creates a new `LinkedList` with new nodes referencing the same element objects.   |
| 36 | `toArray()`                 | Converts the list into an array.               | Copies each element into a new array.                                             |
| 37 | `addAll(Collection c)`      | Adds all elements from another collection.     | Iterates over the collection and appends each element.                            |
| 38 | `removeAll(Collection c)`   | Removes all matching elements.                 | Traverses the list and removes elements found in the given collection.            |
| 39 | `retainAll(Collection c)`   | Keeps only common elements.                    | Removes every element not present in the specified collection.                    |
| 40 | `containsAll(Collection c)` | Checks whether all specified elements exist.   | Verifies that every element in the given collection is present in the list.       |





*/