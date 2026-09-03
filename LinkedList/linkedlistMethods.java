public class linkedlistMethods {

    // Node class represents each element of the linked list
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add a node at the beginning of the linked list
    public void addFirst(int data) {

        // Create a new node
        Node newNode = new Node(data);
        size++;

        // If the linked list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Connect new node to the current head
        newNode.next = head;

        // Update head
        head = newNode;
    }

    // Add a node at the end of the linked list
    public void addLast(int data) {

        // Create a new node
        Node newNode = new Node(data);
        size++;

        // If the linked list is empty
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

        // Check if linked list is empty
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;

        // Traverse the linked list
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Add a node at a specific index
    public void addMiddle(int idx, int data) {

        // Check for invalid index
        if (idx < 0 || idx > size) {
            System.out.println("Invalid index");
            return;
        }

        // If index is 0, add at the beginning
        if (idx == 0) {
            addFirst(data);
            return;
        }

        // If index is equal to size, add at the end
        if (idx == size) {
            addLast(data);
            return;
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;

        // Move to the node just before the required index
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // Insert the new node
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove the first node of the linked list
    public int removeFirst() {

        // If the linked list is empty
        if (size == 0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }

        // If there is only one node
        else if (size == 1) {
            int val = head.data;

            head = tail = null;
            size = 0;

            return val;
        }

        // Store the value of the first node
        int val = head.data;

        // Move head to the next node
        head = head.next;
        size--;

        return val;
    }

    // Remove the last node of the linked list
    public int removeLast() {

        // If the linked list is empty
        if (size == 0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }

        // If there is only one node
        else if (size == 1) {
            int val = head.data;

            head = tail = null;
            size = 0;

            return val;
        }

        // Find the second-last node
        Node prev = head;

        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        // Store the value of the last node
        int val = prev.next.data;

        // Remove the last node
        prev.next = null;

        // Update tail
        tail = prev;
        size--;

        return val;
    }

    // Head points to the first node
    public static Node head;

    // Tail points to the last node
    public static Node tail;

    // Stores the number of nodes
    public static int size;

    public static void main(String[] args) {

        linkedlistMethods ll = new linkedlistMethods();

        ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(3);
        ll.addLast(4);

        ll.addMiddle(2, 10);

        System.out.println("Removed First: " + ll.removeFirst());
        System.out.println("Removed Last: " + ll.removeLast());

        ll.printLL();

        System.out.println("Size: " + ll.size);
    }
}