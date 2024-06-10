import java.util.HashSet;
public class Hashing {
    public static void main(String[] args) {
        //TO declare a Hashsat
        HashSet<Integer> set = new HashSet<>();
        set.add(4);
        set.add(41);
        set.add(42);
        set.add(43);
        set.add(41);
        set.add(48);
        
        // check if the value is there or not
        if(set.contains(42)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        if(set.contains(2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        // delete Item from set
        set.remove(48);
        // for Print Set
        System.out.println(set);
        if(set.contains(48)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
// hello