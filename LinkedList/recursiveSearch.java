public class recursiveSearch {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Add element at the beginning of the linked list
    public void addFirst(int data) {
        Node newNode = new Node(data);

        // If linked list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Connect new node to the current head
        newNode.next = head;

        // Update head
        head = newNode;
    }

    // Add element at the end of the linked list
    public void addLast(int data) {
        Node newNode = new Node(data);

        // If linked list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Connect current tail to the new node
        tail.next = newNode;

        // Update tail
        tail = newNode;
    }

    // Print all elements of the linked list
    public void printLL() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Recursive helper function to search for the key
    public static int helper(Node head, int key) {

        // Base case: key not found
        if (head == null) {
            return -1;
        }

        // Key found at the current node
        if (head.data == key) {
            return 0;
        }

        // Search recursively in the remaining linked list
        int idx = helper(head.next, key);

        // Key not found in the remaining list
        if (idx == -1) {
            return -1;
        }

        // Add 1 to convert recursive index to original index
        return idx + 1;
    }

    // Recursive search function
    public static int recSearch(int key) {
        return helper(head, key);
    }

    public static void main(String[] args) {
        recursiveSearch ll = new recursiveSearch();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        ll.printLL();

        System.out.println("Index: " + recSearch(3));
    }
}