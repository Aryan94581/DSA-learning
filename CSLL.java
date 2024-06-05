public class CSLL {
    private Node head;
    private Node tail;

    public CSLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
        }
        node.next = head;
        head = node;
        tail.next = head;

    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

    }

}