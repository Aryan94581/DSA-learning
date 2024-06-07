

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
    public void insertAtIndex(int val, int Index){
        if(Index >=0){
            if(Index == 0){
                insertFirst(val);
            }else if(Index >= size){
                insertLast(val);
            }else{
                Node node = new Node(val);
                Node temp = head;
                for(int i=0;i<Index-1;i++){
                    temp = temp.next;
                }
                node.next = temp.next;
                temp.next = node;
                node.prev = temp;
            }
        }
        System.out.println("please fill a familiar index value");
        size++;
    }
    public Boolean deleteFirst(){
        if(head != null){
        head = head.next;
        head.prev = null; 
        size--;
        return true;
        }
        return false;
}
    public Boolean deleteLast(){
        if(head != null){
        tail = tail.prev;
        tail.next = null; 
        size--;
        return true;
        }
        return false;
    }

    public Boolean deleteByIndex(int Index){
        if(head != null){
            if(Index == 0){
                deleteFirst();
            }else if(Index >= size){
                deleteLast();
            }else{
                Node temp = head;
                for(int i = 0; i < Index -1; i++ ){
                    temp = temp.next;
                }
                temp.next= temp.next.next;
                temp.next.prev = temp;
                size--;

            }






            return true;
        }

        return false;
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
