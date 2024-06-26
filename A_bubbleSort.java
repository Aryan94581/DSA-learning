
import java.util.Arrays;

public class A_bubbleSort {
    public static void main(String[] args) {
    int[] arr = {23, 12, 22, 11, 3};    
    System.out.println(Arrays.toString(arr));
    }
    static int[] bubbleSort(int[] arr){
        int length = arr.length-1;
        while(length >= 0){

                for (int i = 1; i < length+1; i++) {
                    
                    if(arr[i] > arr[i-1]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }

        return arr;
    }

}
