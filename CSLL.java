import javax.xml.transform.Source;

public class CSLL {
    private static final char[] ExceptionInInitializerError = null;
    public Node head;
    public Node tail;
    public int size;

    public CSLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        head = node;
        size++;

    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if (tail == null) {
            insertFirst(val);
            return;
        } else {
            tail.next = node;
            node.next = head;
            tail = node;
            size++;
        }
    }

    public void insertAtIndex(int val, int index) {
        Node node = new Node(val);
        if (index < 0 && index > size + 1) {
            System.out.println(ExceptionInInitializerError);
        }
        if (index == 0) {
            insertFirst(val);
            return;
        } else if (index >= size) {
            insertLast(val);
            return;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    public void deleteFirst() {
        if (head != null) {
            tail.next = head.next;
            Node DeletedNode = head;
            head = head.next;
            size--;
            System.out.println("Removed Element is : " + DeletedNode.value);
        }
        System.out.println("Your LinkedList is Empty Please Enter some Values! ");
    }

    public void deleteLast() {
        if (head != null) {
            Node temp = head;
            for (int i = 0; i < size - 1; i++) {
                temp = temp.next;
            }
            temp.next = head;
            Node DeletedNode = tail;
            tail = temp;
            size--;
            System.out.println("Removed Element is : " + DeletedNode.value);
        }
        System.out.println("Your LinkedList is Empty Please Enter some Values! ");
    }

    public void deleteIndex(int index) {
        if (index > 0 && index < size) {
            if (index == 0) {
                deleteFirst();
                return;
            } else if (index == size) {
                deleteLast();
                return;
            } else {
                Node temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                Node DeletedNode = temp.next;
                temp.next = temp.next.next;
                size--;
                System.out.println("Removed Element is : " + DeletedNode.value);
            }
        } else {
            System.out.println("You Entered a wrong index!");
        }
    }

    public boolean searchNode(int val) {
        if (head != null) {
            Node temp = head;
            for (int i = 0; i <= size; i++) {
                if (temp.value == val) {
                    System.out.println("Your value find at index of: " + i);
                    return true;
                }
                temp = temp.next;
            }
        }
        System.out.println("Node not found!");
        return false;
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

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

    }

}