public class A_search2dArrayOr {
public static void main(String[] args) {
    
}
static int[] ArrSearch(int[][] matrix, int target){
    int row = 0;
    int col = matrix.length-1;
    while(row < matrix.length-1 && col >= 0){
        if(matrix[row][col] == target){
            return new int[]{row, col};
        }
        if(matrix[row][col] < target){
            row++;
        }else{
            col--;
        }

    }

    return -1;
}
    
}
