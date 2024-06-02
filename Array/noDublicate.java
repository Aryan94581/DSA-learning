package Array;
import java.util.Arrays;

public class noDublicate {
    public static int[] removeDuplicates(int[] arr) {
        // TODO
        int[] A = new int[arr.length];
        int index = 0;
        for (int B : arr) {
            for (int i = 1; i < arr.length; i++) {
                if (B != arr[i]) {
                    A[index+1] = B;
                }
            }
        }

        return Arrays.copyOf(A, index);
    }
}