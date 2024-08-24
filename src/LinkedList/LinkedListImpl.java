package LinkedList;

public class LinkedListImpl {
    Node node;
    int length;

    LinkedListImpl(Node node) {
        this.node = node;
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
           Node temp = node;
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
        newNode.next = node;
        node = newNode;
    }

    /**
     * Add an element at the end of the linkedList
     * @param val
     */
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (this.node == null) {
            this.node = newNode;
        }
        Node current = this.node; //for ease, mark the head as the current node
        while (current.next!=null){ //iterate will you reach the end of the linkedList
            current = current.next;  // when you have reached the end of the linkedList, assign the last node as the current
        }
        current.next = newNode;      // assign the new node at the tail
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
        Node temp = node;  //put the head in a temp var

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

    public void deleteAtIndex(int index) {
        //todo
    }

    private void print() {

        while (node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.addAtHead(4);
        linkedList.addAtHead(5);
        linkedList.addAtHead(8);

        linkedList.print();

    }
}
