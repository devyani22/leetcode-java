package LinkedList;

public class RemoveDups {
    /**
     * Method to remove duplicates from a sorted linkedList
     * @param head
     * @return
     */
    public Node removeDuplicates(Node head) {

        // base case
        if (head == null) {
            return head;
        }

        // if the list is sorted then we can assume that the duplicate is in the next position
        Node current = head; // a pointer we will use to iterate through the list and find the dups
        while (current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next; // move on to the next
            }
        }
        return head;
    }
}
