package Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrarListClass {
    public static void main(String[] args) {
        ArrayList<String> StringList = new ArrayList<String>();
        StringList.add("A");
        StringList.add("B");
        StringList.add("C");
        StringList.add("D");
        StringList.add("E");
        // first way
        for (int i = 0; i < StringList.size(); i++) {
            String Value = StringList.get(i);
            System.out.println(Value);
        }
        System.out.println();
        // Second way
        for (String Value : StringList) {
            System.out.println(Value);
        }
        System.out.println();
        // Third way
        Iterator<String> iterator = StringList.iterator();
        while (iterator.hasNext()) {
            String Latter = iterator.next();
            System.out.println(Latter);
        }
    }
    
}