
import java.util.Arrays;

public class A_insertionSort {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-2; i++) {
            int j = i + 1 ;
            while(j > 0){
            if(arr[j] < arr[i] ){
                swap(arr, i, j);
                j--;
            }else{
                break;
            }
        }
    }
        

    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
