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
            System.out.println("true");
        }else{
            System.out.println(false);
        }
        



        
    }
}