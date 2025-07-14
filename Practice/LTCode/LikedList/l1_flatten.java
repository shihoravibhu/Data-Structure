//430. Flatten a Multilevel Doubly Linked List

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};

class l1_flatten {
    public Node flatten(Node head) {

        if (head == null) {
            return head;
        }

        Node curr = head;

        while (curr != null) {

            if (curr.child != null) { // flatten the child Node
                Node next = curr.next;

                curr.next = flatten(curr.child);
                curr.next.prev = curr;
                curr.child = null;

                // Find Tail
                while (curr.next != null) {
                    curr = curr.next;
                }
                if (next != null) { //attech tail
                    curr.next = next;
                    next.prev = curr;
                }

                curr = curr.next;
            }
        }

        return head;
    }
}