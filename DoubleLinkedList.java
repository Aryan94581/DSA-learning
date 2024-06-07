public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int size;
    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = size;
    }
    
    public void insertFirst(int val){
        Node node = new Node(val);
        if(head == null){
            node.prev = null;
            node.next = null;
            head = node;
            tail = node;
            
        }else{
            node.next = head;
            head.prev = node;
            node.prev = null;
            head = node;
        }
        size++;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        if(head == null){
            insertFirst(val);
            return;
        }else{
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
    }
    
    public boolean  display(){
        if(head == null){
            return false;
        }else{
            Node temp = head;
            System.out.println("START");
            while(temp != null){
                System.out.print(temp.Value + " -> ");
                temp = temp.next;
            }
            System.out.println(" END ");
            return true;
        }
    }
    
    private class Node{
        int Value;
        Node next;
        Node prev;

        public Node(int value ){
            Value = value;
            this.prev = prev;
            }
        
        public Node(int value, DoubleLinkedList.Node next, DoubleLinkedList.Node prev) {
            Value = value;
                this.next = next;
                this.prev = prev;
            }
        
    }
}
