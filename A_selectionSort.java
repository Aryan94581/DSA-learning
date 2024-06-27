import java.util.Arrays;

public class A_selectionSort {
    public static void main(String[] args) {
    int[] arr = {23, 12, 22, 11, 3};    
    selectSort(arr);
    System.out.println(Arrays.toString(arr));
    }
    static void selectSort(int[] arr){
        int length = arr.length-1;
        int max = 0;
        int index = 0;
        while(length >=0){
            for (int i= 0; i<= length; i++) {
                if(max < arr[i]){
                    max = arr[i];
                    index = i;
                }
            }
            if(arr[length] != max){
                int temp = arr[length];
                arr[length] = arr[index];
                arr[index] = temp;
            }
            length--;
        }
    }
}
