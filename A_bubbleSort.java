
import java.util.Arrays;

public class A_bubbleSort {
    public static void main(String[] args) {
    int[] arr = {23, 12, 22, 11, 3};    
    System.out.println(Arrays.toString(arr));
    }
    static int[] bubbleSort(int[] arr){
        int start = 1;
        int length = arr.length-1;
        while(length >= 0){
            if(arr[start-1] > arr[start]){
                int temp = arr[start -1];
                arr[start-1] = arr[start];
                arr[start] = temp;
            }
            start++;
            length--;
        }
        return arr;
    }

}
