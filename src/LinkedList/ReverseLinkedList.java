package LinkedList;

public class ReverseLinkedList {


    public Node reverseList(Node head) {

        Node prev = null;
        Node current = head;

        while (current!=null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
    return prev;
    }
}
