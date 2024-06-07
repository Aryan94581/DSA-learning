public class DoubleLinkedList {
    public Node head;
    public Node tail;
    public int size;
    public DoubleLinkedList() {
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
            head.next = node;
            node.prev = head;
            node.next = null;
            tail = node;
        }
        size++;
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
