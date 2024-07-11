
public class FibonacciRecursion {
public static void main(String[] args) {
    for (int i = 0; i < 20; i++) {
        System.out.print(FibonacciRecursion(i)+ " ");
    }
    
}
    static int FibonacciRecursion(int n){
        
        // base condition
        if(n < 2){
            return n;
        }
        return FibonacciRecursion(n -1) + FibonacciRecursion(n-2);
    }
}