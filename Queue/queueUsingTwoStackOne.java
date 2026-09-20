package Queue;

import java.util.Stack;

public class queueUsingTwoStackOne {

    static class Queue {

        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // Checks whether the queue is empty
        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        /*
         * Adds an element to the queue.
         *
         * We move all elements from s1 to s2,
         * push the new element into s1,
         * and then move all elements back from s2 to s1.
         *
         * This keeps the oldest element at the top of s1,
         * so that s1 behaves like a queue.
         */
        public static void add(int data) {

            // Move all existing elements to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // Add the new element to the bottom of the queue
            s1.push(data);

            // Move all elements back to s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // Removes and returns the front element
        public static int remove() {

            if (isEmpty()) {
                System.out.println("Queue empty");
                return -1;
            }

            return s1.pop();
        }

        // Returns the front element without removing it
        public static int peek() {

            if (isEmpty()) {
                System.out.println("Queue empty");
                return -1;
            }

            return s1.peek();
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