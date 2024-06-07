public class doubleLinkedList {
    public Node head;
    public Node tail;
    public int size;
    public doubleLinkedList() {
        this.size = size;
    }
    
    public void insertFirst(int val){
        Node node = new Node(val);
        if(head == null){
            node.prev = null;
            node.next = null;
            head = node;
            tail = node;
            size++;
        }else{
            head.next = node;
            node.prev = head;
            node.next = null;
            tail = node;
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
        
        public Node(int value, doubleLinkedList.Node next, doubleLinkedList.Node prev) {
            Value = value;
                this.next = next;
                this.prev = prev;
            }
        
    }
}
