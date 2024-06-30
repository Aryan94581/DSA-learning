
import java.util.Arrays;

public class A_CyclicSort {
    public static void main(String[] args) {
        int[] array = {3, 8, 5, 9, 2, 6, 1, 4, 7};
        cyclicSort(array);
        System.out.println(Arrays.toString(array));
        
    }
    static void cyclicSort(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correctInd = arr[i]-1;
            if(i != correctInd){
                swap(arr, correctInd, i);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
