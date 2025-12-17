public class LinkedList {

    private Node head = null; // List head (beginning of list)

    // Method to add a new node
    public void addToEnd(String data) {
        Node newNode = new Node(data);

        if (this.head == null) { // If the new node doesn’t have a head, make it the head
            this.head = newNode;
            return;
        }

        Node current = this.head; // Create a temporary node to iterate over the linked list to check for the end node (current.next == null)
        while (current.next != null) {
            current = current.next;
        }
	    if (current.next == null) {
            current.next = newNode; // If this is the last node in the linked list, then make the last node’s pointer to the new node (adding a node at the end)
	    }
    }

    public void addToBegin(String data) {
        if (this.head == null) {
            this.head = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void deleteEnd() {
        Node current = this.head;
        Node previous = null;
        if (current == null) {
            return;
        }
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            this.head = null;
            return;
        }
        previous.next = null;
    }

    public void deleteBegin() {
        if (this.head == null) {
            return;
        }
        this.head = this.head.next;
    }

    public void printList() {
        String result = "[ ";
        Node current = this.head;
        while (current != null) {
            result += current.data + " ";
            current = current.next;
        }
        System.out.println(result + "]");
    }
}
