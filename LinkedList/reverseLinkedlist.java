public class reverseLinkedlist {
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

    // Reverse the linked list iteratively
    public static void reverseLL() {
        Node prev = null;
        Node curr = head;

        // Store the current head as the new tail
        tail = head;

        while (curr != null) {
            // Store the next node before changing the link
            Node next = curr.next;

            // Reverse the current node's pointer
            curr.next = prev;

            // Move prev and curr one step forward
            prev = curr;
            curr = next;
        }

        // Update head to the last node
        head = prev;
    }

    public static void main(String[] args) {
        reverseLinkedlist ll = new reverseLinkedlist();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        ll.printLL();

        reverseLL();

        ll.printLL();
    }
}