package Queue;

public class circularQueueUsingArray {

    static class Queue {

        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // Checks whether the queue is empty
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // Checks whether the queue is full
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Adds an element to the queue
        public static void add(int data) {

            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            // Set front for the first element
            if (front == -1) {
                front = 0;
            }

            // Move rear circularly
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Removes and returns the front element
        public static int remove() {

            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[front];

            // If only one element is present
            if (rear == front) {
                rear = front = -1;
            } else {
                // Move front circularly
                front = (front + 1) % size;
            }

            return result;
        }

        // Returns the front element without removing it
        public static int peek() {

            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());

        q.add(4);

        System.out.println(q.remove());

        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}