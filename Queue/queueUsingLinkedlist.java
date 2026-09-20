package Queue;

public class queueUsingLinkedlist {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {

        static Node head = null;
        static Node tail = null;

        // Checks whether the queue is empty
        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // Adds an element at the rear of the queue
        public static void add(int data) {

            Node newNode = new Node(data);

            // If queue is empty
            if (head == null) {
                head = tail = newNode;
                return;
            }

            // Add new node at the end
            tail.next = newNode;
            tail = newNode;
        }

        // Removes and returns the front element
        public static int remove() {

            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            int front = head.data;

            // If only one element is present
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }

            return front;
        }

        // Returns the front element without removing it
        public static int peek() {

            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}