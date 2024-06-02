public class Main {
    public static void main(String[] args) {
        // doubble linkedlist
        DLL list = new DLL();
        list. insertFirst(13);
        list. insertFirst(12);
        list. insertFirst(18);
        list. insertFirst(16);
        list.insertLast(99);
        list.display();
        System.out.println();
        list.insert(12, 88);
        list.display();
        
        // hello
        // for single linkedList 
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
