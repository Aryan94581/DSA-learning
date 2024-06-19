public class A_bsOnInfiniteArray {
    public static void main(String[] args) {
        
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = 2;
        while(start> end){
            int mid = (start+end)/2;
            if(target == arr[mid]){
                return mid;
            }else if(target > arr[mid]){
                start = end+1;
                end = start*2;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
