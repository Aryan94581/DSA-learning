
public class Module {
public static void main(String[]args){
String name = "Aryan Swami";
String name1 = changeName(name);
System.out.println(name1);
}
    public static String changeName(String name){
        String temp = name;
        name = "Swami ji";
        return name;
    }
}