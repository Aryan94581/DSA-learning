import java.util.Arrays;

public class A_selectionSort {
    public static void main(String[] args) {
    int[] arr = {23, 12, 22, 11, 3};    
    selectSort(arr);
    System.out.println(Arrays.toString(arr));
    }
    static void selectSort(int[] arr) {
    int length = arr.length - 1;

    for (int start = 0; start <= length; start++) {
        int min = arr[start];
        int index = start;

        for (int i = start + 1; i <= length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }

        if (index != start) {
            int temp = arr[start];
            arr[start] = arr[index];
            arr[index] = temp;
        }
    }
}

}
