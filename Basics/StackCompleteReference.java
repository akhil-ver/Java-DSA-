/*
==========================================================
                JAVA STACK - COMPLETE REFERENCE
==========================================================

Stack follows LIFO (Last In First Out)

Stack Class:
    java.util.Stack

Inheritance:
    Object
      └── Vector
            └── Stack

Since Stack extends Vector, it inherits all Vector methods.

Time Complexities
-----------------
push()        -> O(1)
pop()         -> O(1)
peek()        -> O(1)
search()      -> O(n)
contains()    -> O(n)
get()         -> O(1)

==========================================================
*/

import java.util.*;

public class StackCompleteReference {

    public static void main(String[] args) {

        /*
        ==========================================================
                        CREATE STACK
        ==========================================================
        */

        Stack<Integer> stack = new Stack<>();


        /*
        ==========================================================
                        ADD ELEMENTS
        ==========================================================
        */

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Initial Stack : " + stack);


        /*
        ==========================================================
                        BASIC STACK METHODS
        ==========================================================
        */

        // Returns top element
        System.out.println("Peek : " + stack.peek());

        // Removes top element
        System.out.println("Pop : " + stack.pop());

        System.out.println("After Pop : " + stack);

        // Checks stack empty or not
        System.out.println("Empty : " + stack.empty());

        // Position from top (1-based)
        System.out.println("Search 30 : " + stack.search(30));



        /*
        ==========================================================
                        VECTOR METHODS
        ==========================================================
        */

        // Number of elements
        System.out.println("Size : " + stack.size());

        // isEmpty()
        System.out.println("isEmpty : " + stack.isEmpty());

        // Contains
        System.out.println("Contains 20 : " + stack.contains(20));

        // Get by index
        System.out.println("Element at index 2 : " + stack.get(2));

        // Update element
        stack.set(1, 100);
        System.out.println("After set : " + stack);

        // Remove by index
        stack.remove(1);
        System.out.println("After remove(index) : " + stack);

        // Remove by object
        stack.remove(Integer.valueOf(40));
        System.out.println("After remove(object) : " + stack);

        // Add element
        stack.add(60);

        // Add element (Vector Method)
        stack.addElement(70);

        // Insert at index
        stack.insertElementAt(80, 1);

        System.out.println(stack);

        // First element
        System.out.println("First Element : " + stack.firstElement());

        // Last element
        System.out.println("Last Element : " + stack.lastElement());

        // Element at index
        System.out.println("ElementAt(2) : " + stack.elementAt(2));

        // Remove element
        stack.removeElement(80);

        System.out.println(stack);



        /*
        ==========================================================
                        CAPACITY METHODS
        ==========================================================
        */

        System.out.println("Capacity : " + stack.capacity());

        stack.ensureCapacity(20);

        stack.trimToSize();



        /*
        ==========================================================
                        ITERATION METHODS
        ==========================================================
        */

        System.out.println("\n----- For Loop -----");

        for(int i=0;i<stack.size();i++)
        {
            System.out.println(stack.get(i));
        }


        System.out.println("\n----- Enhanced For Loop -----");

        for(Integer num : stack)
        {
            System.out.println(num);
        }


        System.out.println("\n----- Iterator -----");

        Iterator<Integer> iterator = stack.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }



        System.out.println("\n----- ListIterator Forward -----");

        ListIterator<Integer> listIterator = stack.listIterator();

        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }



        System.out.println("\n----- ListIterator Reverse -----");

        ListIterator<Integer> reverseIterator =
                stack.listIterator(stack.size());

        while(reverseIterator.hasPrevious())
        {
            System.out.println(reverseIterator.previous());
        }



        System.out.println("\n----- Enumeration -----");

        Enumeration<Integer> enumeration = stack.elements();

        while(enumeration.hasMoreElements())
        {
            System.out.println(enumeration.nextElement());
        }



        System.out.println("\n----- forEach -----");

        stack.forEach(System.out::println);



        System.out.println("\n----- Stream API -----");

        stack.stream().forEach(System.out::println);



        System.out.println("\n----- Iterator forEachRemaining -----");

        Iterator<Integer> itr = stack.iterator();

        itr.forEachRemaining(System.out::println);



        /*
        ==========================================================
                        CONVERSION
        ==========================================================
        */

        // Stack -> Array
        Object[] array = stack.toArray();

        System.out.println("\nStack to Array");

        for(Object obj : array)
        {
            System.out.println(obj);
        }


        // Stack -> List
        List<Integer> list = new ArrayList<>(stack);

        System.out.println("\nStack to List");

        System.out.println(list);


        // List -> Stack
        Stack<Integer> newStack = new Stack<>();

        newStack.addAll(list);

        System.out.println("\nList to Stack");

        System.out.println(newStack);



        /*
        ==========================================================
                        SORTING
        ==========================================================
        */

        Collections.sort(stack);

        System.out.println("\nAscending");

        System.out.println(stack);


        Collections.sort(stack, Collections.reverseOrder());

        System.out.println("\nDescending");

        System.out.println(stack);



        /*
        ==========================================================
                        CLONE
        ==========================================================
        */

        Stack<Integer> clone =
                (Stack<Integer>) stack.clone();

        System.out.println("\nClone");

        System.out.println(clone);



        /*
        ==========================================================
                        CLEAR
        ==========================================================
        */

        Stack<Integer> temp = (Stack<Integer>) stack.clone();

        temp.clear();

        System.out.println("\nAfter Clear");

        System.out.println(temp);



        /*
        ==========================================================
                        REMOVE ALL ELEMENTS
        ==========================================================
        */

        Stack<Integer> removeAll =
                (Stack<Integer>) stack.clone();

        removeAll.removeAllElements();

        System.out.println(removeAll);



        /*
        ==========================================================
                        POP UNTIL EMPTY
        ==========================================================
        */

        Stack<Integer> demo =
                (Stack<Integer>) stack.clone();

        System.out.println("\nPop All");

        while(!demo.empty())
        {
            System.out.println(demo.pop());
        }



        /*
        ==========================================================
                        MODERN STACK (RECOMMENDED)
        ==========================================================

        Deque<Integer> modern = new ArrayDeque<>();

        modern.push(10);
        modern.push(20);
        modern.push(30);

        System.out.println(modern.peek());

        System.out.println(modern.pop());

        ==========================================================
        */

    }
}
/*

| Method               | Description            | Time Complexity |
| -------------------- | ---------------------- | --------------- |
| `push()`             | Add element to top     | O(1)            |
| `pop()`              | Remove top             | O(1)            |
| `peek()`             | View top               | O(1)            |
| `empty()`            | Check empty            | O(1)            |
| `search()`           | Position from top      | O(n)            |
| `size()`             | Number of elements     | O(1)            |
| `isEmpty()`          | Check if empty         | O(1)            |
| `contains()`         | Check existence        | O(n)            |
| `get()`              | Access by index        | O(1)            |
| `set()`              | Update element         | O(1)            |
| `remove()`           | Remove by index/object | O(n)            |
| `clear()`            | Remove all             | O(n)            |
| `clone()`            | Copy stack             | O(n)            |
| `toArray()`          | Convert to array       | O(n)            |
| `Collections.sort()` | Sort elements          | O(n log n)      |



*/