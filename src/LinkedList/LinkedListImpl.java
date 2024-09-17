package LinkedList;

public class LinkedListImpl {
    Node head;
    int length;

    LinkedListImpl(Node head) {
        this.head = head;
    }
    LinkedListImpl(){}

    /**
     * Access the element at a specific index
     * @param index
     * @return value
     */
    public int get(int index) {
        if (index >= length) {
            return -1;
        }

          int counter = 0;        // start a counter
           Node temp = head;
           while(counter<index) { // iterate till the counter reaches the position of the required index
               counter++;
               temp = temp.next;  // assign the next node in a temporary var
           }
           return temp.data;
    }

    /**
     * Add an element at the head of the LinkedList
     * @param val
     */
    public void addAtHead(int val) {

        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    /**
     * Add an element at the end of the linkedList
     * @param val
     */
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node current = this.head; //for ease, mark the head as the current node
            while (current.next!=null){ //iterate will you reach the end of the linkedList
                current = current.next;  // when you have reached the end of the linkedList, assign the last node as the current
            }
            current.next = newNode;      // assign the new node at the tail
        }
        length++;
    }

    public void addAtIndex(int index, int val) {

        // 1. if index is larger than the length of the linkedList
        if (index >= length) {
            System.out.println("error");
        }

        // 2. if index is the first position, insert at the head
        if (index == 0) {
            addAtHead(val);
        }
        // 3. iterate to the required index
        int counter = 0;   // start a counter
        Node temp = head;  //put the head in a temp var

        while(counter < index) {
            counter++;
            temp = temp.next;
        }
        Node newNode = new Node(val);
        Node next = temp.next;
        temp.next = newNode;
        newNode.next = next;
        length++;
    }

    public void insertAt(int data, int index) {
        Node newNode = new Node(data);
        // check boundary conditions
        if (index < 0 || index > length) {  // Check if index is out of bounds
            System.out.println("Cannot insert at index");
            return;  // Exit the method if the index is invalid
        }

        if (index == 0) {
            newNode.next = head;    // point new node to current head or the rest of the list will be lost
            head = newNode;         // insert at the head
        } else {
            Node current = head;
            for (int i = 0; i < index-1; i++) {
                current = current.next;  // Traverse to the node before the insertion point
            }
            newNode.next = current.next; // Point new node to the current node
            current.next = newNode;      // Point previous node to the new node
        }
        length++;                        // Increment length after successful insertion
    }

    public void deleteAtIndex(int index) {
        // Check if the index is out of bounds
        if (index < 0 || index >= length) {
            System.out.println("Cannot delete at index: Index out of bounds");
            return;
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index-1; i++) { // Traverse to the node just before the one we want to delete
                current = current.next;
            }
            // Now, 'current' is the node before the node to be deleted
            if (current.next!=null) {
                current.next = current.next.next;   // Bypass the node to be deleted
            }
        }
        length--;   // Decrement the length of the list by 1
    }

    public void reverse() {
        Node next = null;
        Node previous = null;
        Node current = head;

        while(current!=null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    private void print() {
        Node temp = head;  // Use a temporary variable to traverse the list without modifying the head

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.addAtHead(1);
        linkedList.addAtTail(2);
        linkedList.addAtTail(3);
        linkedList.addAtTail(4);

        linkedList.print();  // Output: 1, 2, 3, 4
        System.out.println();
        linkedList.deleteAtIndex(2);  // Deletes the element at index 2 (which is '3')
        linkedList.print();  // Output: 1, 2, 4

        linkedList.deleteAtIndex(0);  // Deletes the element at index 0 (which is '1')
        linkedList.print();  // Output: 2, 4

        linkedList.deleteAtIndex(5);  // Trying to delete out of bounds (prints an error message)

        linkedList.reverse();  // Reverse the linked list

        System.out.println("Reversed List:");
        linkedList.print();  // Output: 4, 3, 2, 1
    }
}
