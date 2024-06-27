import java.util.Arrays;

public class A_selectionSort {
    public static void main(String[] args) {
    int[] arr = {23, 12, 22, 11, 3};    
    selectSort(arr);
    System.out.println(Arrays.toString(arr));
    }
    static void selectSort(int[] arr){

            for (int i=0; i <= arr.length-1; i++) {
                int last = arr.length - i - 1;
                int max = maxInd(arr, i, arr.length-1);
                swap(arr, max,last);
            }
        
        }
        static int maxInd(int[] arr, int startInd, int endInd){
            int max = startInd;
            for (int i = startInd; i <= endInd; i++) {    
                if(arr[max] < arr[i]){
                    max = i;
                }
            }
            return max;
    }
    static void swap(int[] arr, int index1, int index2){
                int temp = arr[index1];
                arr[index1] = arr[index2];
                arr[index2] = temp;
    }
}
