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
            return;
        }
        tail.next = head;
        node.next = head;
        head = node;
        return;
    }

    public void display() {
        if (head == null) {
        }
        Node temp = head;
        while (temp != head) {
            System.out.println(temp + " -> ");
            temp = temp.next;
        }

    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

    }

}