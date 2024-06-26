
import java.util.Arrays;

public class A_search2dArrayOr {
public static void main(String[] args) {
    int[][] arr = {
        {2, 5, 8, 13},
        {3, 7, 9, 15},
        {4, 10, 17, 23},
        {6, 12, 22, 27}
    };
    int target = 22;
    System.out.println(Arrays.toString(ArrSearch(arr, target))); 
    
}
static int[] ArrSearch(int[][] matrix, int target){
    int row = 0;
    int col = matrix.length-1;
    while(row < matrix.length && col >= 0){
        if(matrix[row][col] == target){
            return new int[]{row, col};
        }
        if(matrix[row][col] < target){
            row++;
        }else{
            col--;
        }

    }

    return new int[]{-1, -1};
}
    
}
