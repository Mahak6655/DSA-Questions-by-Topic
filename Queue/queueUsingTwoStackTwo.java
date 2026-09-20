package Queue;

import java.util.*;

public class queueUsingTwoStackTwo {

    static class Queue {

        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // Checks whether the queue is empty
        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        /*
         * Add operation:
         *
         * Directly push the new element into s1.
         * Therefore, insertion takes O(1) time.
         */
        public static void add(int data) {
            s1.push(data);
        }

        /*
         * Remove operation:
         *
         * The oldest element is at the bottom of s1.
         * We move all elements from s1 to s2.
         *
         * The oldest element becomes the top of s2,
         * so we can remove it directly.
         *
         * Finally, we move the remaining elements back to s1.
         */
        public static int remove() {

            if (isEmpty()) {
                System.out.println("Queue empty");
                return -1;
            }

            // Move elements from s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // Oldest element is now at the top
            int front = s2.pop();

            // Move remaining elements back to s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }

            return front;
        }

        /*
         * Peek operation:
         *
         * Similar to remove(), we move all elements to s2
         * so that the oldest element becomes the top.
         *
         * We only read the element and do not remove it.
         */
        public static int peek() {

            if (isEmpty()) {
                System.out.println("Queue empty");
                return -1;
            }

            // Move elements from s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // Get the front element
            int front = s2.peek();

            // Move elements back to s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }

            return front;
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

