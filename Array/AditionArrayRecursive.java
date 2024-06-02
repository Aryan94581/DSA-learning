package Array;
class Operation {
    public int sum(int[] Array, int elementNo) {
        if (elementNo == 1) {
            return Array[0];
        }
        int result = sum(Array, elementNo - 1);
        result = result + Array[elementNo - 1];
        return result;
    }
}

public class AditionArrayRecursive {

    public static void main(String[] args) {
        int num[] = { 2, 3, 4, 6, 11 };
        Operation oper = new Operation();
        ;
        System.out.println(oper.sum(num, num.length));
    }
}
