package Queue;

import java.util.*;

public class queueUsingJavaCollectionFramework {

    public static void main(String[] args) {

        /*
         * Queue is an interface in the Java Collection Framework.
         *
         * Queue follows the FIFO principle:
         * First In, First Out.
         *
         * Common Queue implementations:
         *
         * 1. LinkedList
         * 2. ArrayDeque
         */

        // LinkedList can be used as a Queue because it implements
        // the Queue interface.
        //
        // LinkedList supports insertion at the rear and removal
        // from the front, making it suitable for FIFO operations.
        //
        // Queue<Integer> q = new LinkedList<>();

        /*
         * ArrayDeque is another implementation of the Queue interface.
         *
         * ArrayDeque is backed by a resizable array and is generally
         * preferred over LinkedList when we only need normal queue
         * operations.
         *
         * It provides efficient add(), remove(), and peek() operations.
         */
        Queue<Integer> q = new ArrayDeque<>();

        // Add elements to the rear of the queue
        q.add(1);
        q.add(2);
        q.add(3);

        // Process elements from the front
        while (!q.isEmpty()) {

            // peek() returns the front element without removing it
            System.out.println(q.peek());

            // remove() removes the front element
            q.remove();
        }
    }
}