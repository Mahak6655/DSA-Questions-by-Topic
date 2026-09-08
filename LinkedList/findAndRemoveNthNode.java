public class findAndRemoveNthNode {
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

    // Remove the Nth node from the end of the linked list
    public static void findAndRemoveNthNodeFromEnd(int n) {

        // Find the size of the linked list
        int size = 0;
        Node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // Handle invalid value of n
        if (n <= 0 || n > size) {
            return;
        }

        // If the first node needs to be removed
        if (n == size) {
            head = head.next;

            // If list becomes empty
            if (head == null) {
                tail = null;
            }

            return;
        }

        // Find the node just before the node to be removed
        Node prev = head;

        for (int i = 1; i < size - n; i++) {
            prev = prev.next;
        }

        // Remove the Nth node from the end
        if (prev.next == tail) {
            tail = prev;
        }

        prev.next = prev.next.next;
    }

    public static void main(String[] args) {
        findAndRemoveNthNode ll = new findAndRemoveNthNode();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        ll.printLL();

        findAndRemoveNthNodeFromEnd(3);

        ll.printLL();
    }
}