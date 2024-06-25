import java.util.Arrays;

public class A_search2dArray {
    public static void main(String[] args)
    {
 
        // Binary search in sorted matrix
        int arr[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 } };
        int[] ans = findAns(arr, 12);
        System.out.println("Element found at index: "
                           + Arrays.toString(ans));
    }
    static int[] findAns(int[][] arr, int target)
    {
        int row = 0;
        int col = arr[row].length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return new int[] { row, col };
            }
            if (arr[row][col] < target) {
                row++;
            }
            else {
                col--;
            }
        }
        return new int[] { -1, -1 };
    }
    
}
