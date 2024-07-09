// when a function call it by it self then it is called recursion!
public class A_recursion {
    public static void main(String[] args) {
        print(1);
    }
    public static void print(int n){
        if(n == 5){
            System.out.println(n);
        return;
        }
        System.out.println(n);
        print(n+1);
    }
}
