public class A_bsOnInfiniteArray {
    public static void main(String[] args) {
        int[] array ={2, 3, 4, 6, 8, 15, 24, 38, 49, 52, 58, 69, 83};
        int target = 38;
        findingAns(array, target);

    }
    static int findingAns(int[] arr, int target){
        // first find the range
        // start with the box of size 2
        int start = 0;
        int end = 1;
        
        // condition of the target lie in the range 
        while (target <= arr[end]){
            int newstart = end+1;
            end = end + (end - start + 1)*2;
            start = newstart;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = (start+end)/2;
            if(target > arr[mid]){
                start = mid+1;
            }else if(target < arr[mid]){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
