/**
 * A_recursiveBinary
 */
public class A_recursiveBinary {

    public static void main(String[] args) {
        int[] array = {1,3,6,8,15,24,38,49,52,58,69,83};
        int start = 0;
        int end = array.length-1;
        int result = binaryS(array, start, end,  49);
    System.out.println("your value is at index of :" + result);
    }
    static int binaryS(int[] arr, int start, int end, int target){
        if(start <= end){
            int mid = (start+end)/2;
            if(target > arr[mid]){
                start = mid+1;
                return binaryS(arr, start, end, target);
            }else if(target < arr[mid]){
                end = mid-1;
                return binaryS(arr, start, end, target);
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}