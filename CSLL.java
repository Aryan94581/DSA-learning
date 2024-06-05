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
        tail.next = node;
        node.next = head;
        head = node;
    }

    public void display() {
        Node temp = head;
        if (head != null) {

            do {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println();
    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

    }

}