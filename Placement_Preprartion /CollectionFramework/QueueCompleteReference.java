/*
==========================================================
            JAVA QUEUE - COMPLETE REFERENCE
==========================================================

Queue follows FIFO (First In First Out)

Queue is an Interface

Common Implementations
----------------------
1. LinkedList
2. PriorityQueue
3. ArrayDeque (Recommended)

Time Complexities (LinkedList Queue)
------------------------------------
offer()      -> O(1)
add()        -> O(1)
poll()       -> O(1)
remove()     -> O(1)
peek()       -> O(1)
element()    -> O(1)
contains()   -> O(n)
size()       -> O(1)

==========================================================
*/

import java.util.*;

public class QueueCompleteReference {

    public static void main(String[] args) {

        /*
        ==========================================================
                        CREATE QUEUE
        ==========================================================
        */

        Queue<Integer> queue = new LinkedList<>();


        /*
        ==========================================================
                        ADD ELEMENTS
        ==========================================================
        */

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println("Initial Queue : " + queue);


        /*
        ==========================================================
                        BASIC QUEUE METHODS
        ==========================================================
        */

        // Returns front element
        System.out.println("Peek : " + queue.peek());

        // Removes front element
        System.out.println("Poll : " + queue.poll());

        System.out.println("After Poll : " + queue);

        // Add element
        queue.add(60);

        System.out.println("After Add : " + queue);

        // Removes front element
        System.out.println("Remove : " + queue.remove());

        System.out.println("After Remove : " + queue);

        // Returns front element
        System.out.println("Element : " + queue.element());



        /*
        ==========================================================
                        COLLECTION METHODS
        ==========================================================
        */

        // Size
        System.out.println("Size : " + queue.size());

        // isEmpty
        System.out.println("isEmpty : " + queue.isEmpty());

        // Contains
        System.out.println("Contains 30 : " + queue.contains(30));

        // Remove specific object
        queue.remove(Integer.valueOf(40));

        System.out.println("After remove(object) : " + queue);



        /*
        ==========================================================
                        ADD ALL
        ==========================================================
        */

        Queue<Integer> q2 = new LinkedList<>();

        q2.offer(100);
        q2.offer(200);

        queue.addAll(q2);

        System.out.println("After addAll : " + queue);

        System.out.println("containsAll : " + queue.containsAll(q2));



        /*
        ==========================================================
                        REMOVE ALL
        ==========================================================
        */

        Queue<Integer> temp1 = new LinkedList<>(queue);

        temp1.removeAll(q2);

        System.out.println("removeAll : " + temp1);



        /*
        ==========================================================
                        RETAIN ALL
        ==========================================================
        */

        Queue<Integer> temp2 = new LinkedList<>(queue);

        temp2.retainAll(q2);

        System.out.println("retainAll : " + temp2);



        /*
        ==========================================================
                        ITERATION METHODS
        ==========================================================
        */

        System.out.println("\n----- Enhanced For Loop -----");

        for(Integer num : queue)
        {
            System.out.println(num);
        }



        System.out.println("\n----- Iterator -----");

        Iterator<Integer> iterator = queue.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }



        System.out.println("\n----- forEach -----");

        queue.forEach(System.out::println);



        System.out.println("\n----- Stream API -----");

        queue.stream().forEach(System.out::println);



        System.out.println("\n----- Iterator forEachRemaining -----");

        Iterator<Integer> itr = queue.iterator();

        itr.forEachRemaining(System.out::println);



        /*
        ==========================================================
                        CONVERSION
        ==========================================================
        */

        // Queue -> Array
        Object[] array = queue.toArray();

        System.out.println("\nQueue to Array");

        for(Object obj : array)
        {
            System.out.println(obj);
        }


        // Queue -> List
        List<Integer> list = new ArrayList<>(queue);

        System.out.println("\nQueue to List");

        System.out.println(list);


        // List -> Queue
        Queue<Integer> newQueue = new LinkedList<>();

        newQueue.addAll(list);

        System.out.println("\nList to Queue");

        System.out.println(newQueue);



        /*
        ==========================================================
                        SORTING
        ==========================================================
        */

        List<Integer> sortList = new ArrayList<>(queue);

        Collections.sort(sortList);

        Queue<Integer> ascending = new LinkedList<>(sortList);

        System.out.println("\nAscending");

        System.out.println(ascending);


        Collections.sort(sortList, Collections.reverseOrder());

        Queue<Integer> descending = new LinkedList<>(sortList);

        System.out.println("\nDescending");

        System.out.println(descending);



        /*
        ==========================================================
                        COPY QUEUE
        ==========================================================
        */

        Queue<Integer> copy = new LinkedList<>(queue);

        System.out.println("\nCopy Queue");

        System.out.println(copy);



        /*
        ==========================================================
                        CLEAR
        ==========================================================
        */

        Queue<Integer> clearQueue = new LinkedList<>(queue);

        clearQueue.clear();

        System.out.println("\nAfter Clear");

        System.out.println(clearQueue);



        /*
        ==========================================================
                        REMOVE ALL ELEMENTS USING POLL
        ==========================================================
        */

        Queue<Integer> demo = new LinkedList<>(queue);

        System.out.println("\nPoll Until Empty");

        while(!demo.isEmpty())
        {
            System.out.println(demo.poll());
        }



        /*
        ==========================================================
                LINKEDLIST SPECIFIC METHODS
        ==========================================================
        */

        LinkedList<Integer> linkedQueue = new LinkedList<>();

        linkedQueue.offer(10);
        linkedQueue.offer(20);
        linkedQueue.offer(30);

        linkedQueue.addFirst(5);

        linkedQueue.addLast(40);

        System.out.println("\nLinkedList Queue");

        System.out.println(linkedQueue);

        System.out.println("First : " + linkedQueue.getFirst());

        System.out.println("Last : " + linkedQueue.getLast());

        System.out.println("Peek First : " + linkedQueue.peekFirst());

        System.out.println("Peek Last : " + linkedQueue.peekLast());

        System.out.println("Poll First : " + linkedQueue.pollFirst());

        System.out.println("Poll Last : " + linkedQueue.pollLast());

        linkedQueue.offerFirst(100);

        linkedQueue.offerLast(200);

        System.out.println(linkedQueue);



        /*
        ==========================================================
                DESCENDING ITERATOR
        ==========================================================
        */

        System.out.println("\nDescending Iterator");

        Iterator<Integer> reverse =
                linkedQueue.descendingIterator();

        while(reverse.hasNext())
        {
            System.out.println(reverse.next());
        }



        /*
        ==========================================================
                    PRIORITY QUEUE
        ==========================================================
        */

        PriorityQueue<Integer> priorityQueue =
                new PriorityQueue<>();

        priorityQueue.offer(50);
        priorityQueue.offer(20);
        priorityQueue.offer(80);
        priorityQueue.offer(10);
        priorityQueue.offer(40);

        System.out.println("\nPriority Queue");

        System.out.println(priorityQueue);

        System.out.println("Peek : " + priorityQueue.peek());

        System.out.println("Poll : " + priorityQueue.poll());

        System.out.println(priorityQueue);

        System.out.println("Contains 40 : "
                + priorityQueue.contains(40));

        System.out.println("Size : "
                + priorityQueue.size());

        System.out.println("Comparator : "
                + priorityQueue.comparator());



        /*
        NOTE:
        Iterating PriorityQueue DOES NOT guarantee sorted order.
        Only repeated poll() returns elements in priority order.
        */

        System.out.println("\nPriority Order");

        while(!priorityQueue.isEmpty())
        {
            System.out.println(priorityQueue.poll());
        }



        /*
        ==========================================================
                    ARRAYDEQUE (RECOMMENDED)
        ==========================================================
        */

        Deque<Integer> deque = new ArrayDeque<>();

        deque.offer(10);
        deque.offer(20);
        deque.offer(30);

        System.out.println("\nArrayDeque");

        System.out.println(deque);

        System.out.println("Peek : "
                + deque.peek());

        System.out.println("Poll : "
                + deque.poll());

        deque.offerFirst(5);

        deque.offerLast(40);

        System.out.println(deque);

        System.out.println("Poll First : "
                + deque.pollFirst());

        System.out.println("Poll Last : "
                + deque.pollLast());



        /*
        ==========================================================
                        STACK USING DEQUE
        ==========================================================

        deque.push(100);
        deque.push(200);

        System.out.println(deque.peek());

        System.out.println(deque.pop());

        ==========================================================
        */

    }
}

/*
| Method           | Description             | Time Complexity |
| ---------------- | ----------------------- | --------------- |
| `offer()`        | Insert element          | O(1)            |
| `add()`          | Insert element          | O(1)            |
| `poll()`         | Remove front            | O(1)            |
| `remove()`       | Remove front            | O(1)            |
| `peek()`         | View front              | O(1)            |
| `element()`      | View front              | O(1)            |
| `size()`         | Number of elements      | O(1)            |
| `isEmpty()`      | Check empty             | O(1)            |
| `contains()`     | Search                  | O(n)            |
| `clear()`        | Remove all              | O(n)            |
| `remove(Object)` | Remove specific element | O(n)            |
| `addAll()`       | Add collection          | O(n)            |
| `toArray()`      | Convert to array        | O(n)            |
| `iterator()`     | Traverse queue          | O(n)            |
| `stream()`       | Stream traversal        | O(n)            |


*/