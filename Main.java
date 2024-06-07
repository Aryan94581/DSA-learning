public class Main {
    public static void main(String[] args) {

        
        DoubleLinkedList list = new DoubleLinkedList ();
        list.insertFirst(13);
        list.insertFirst(15);
        list.insertFirst(17);
        list.insertFirst(19);
        list.insertFirst(11);
        list.insertLast(19);
        list.display();
        list.insertAtIndex(99, 2);
        
       
        list.display();
       
        
        // CSLL list = new CSLL();
        // list.insertFirst(5);
        // list.insertFirst(6);
        // list.insertFirst(8);
        // list.insertFirst(3);
        // list.insertLast(99);
        // list.insertAtIndex(77, 2);
        // list.searchNode(99);
        // list.display();
        // System.out.println("First Index");
        // list.deleteFirst();
        // list.display();
        // System.out.println("Last Index!");
        // list.deleteLast();
        // list.display();
        // System.out.println("Delete by Index!");
        // list.deleteIndex(2);
        // list.display();
        // TODO: for single linkedList
        // LL list = new LL();
        // list.insertFirst(15);
        // list.insertFirst(13);
        // list.insertFirst(17);
        // list.insertFirst(19);
        // list.insertLast(16);
        // list.insert(77, 3);
        // // list.insert(66, 100); give exception

        // list.display();
        // System.err.println(list.find(13));
        // System.err.println(list.find(77));
    }
}