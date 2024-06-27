import java.util.Arrays;

public class A_secectionSort {
    public static void main(String[] args) {
    int[] arr = {23, 12, 22, 11, 3};    
    selectSort(arr);
    System.out.println(Arrays.toString(arr));
    }
    static void selectSort(int[] arr){
        int length = arr.length;
        int max = 0;
        while(length >=0){
            for (int i= 0; i<= length; i++) {
                if(max < i){
                    max = i;
                }
            }

        }
    }
}
