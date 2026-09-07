public class searchIterative {
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
        // Step 1: Create a new node
        Node newNode = new Node(data);

        // If linked list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2: Connect new node to the current head
        newNode.next = head;

        // Step 3: Make new node the new head
        head = newNode;
    }

    // Add element at the end of the linked list
    public void addLast(int data) {
        // Step 1: Create a new node
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

    // Iterative search in linked list
    public static int findValue(int key) {
        Node temp = head;
        int i = 0;

        // Traverse the linked list
        while (temp != null) {

            // If key is found, return its index
            if (temp.data == key) {
                return i;
            }

            temp = temp.next;
            i++;
        }

        // Key not found
        return -1;
    }

    public static void main(String[] args) {
        searchIterative ll = new searchIterative();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        ll.printLL();

        System.out.println("Index: " + ll.findValue(5));
    }
}