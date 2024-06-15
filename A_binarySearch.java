public class A_binarySearch {
public static void main(String[] args) {
    
}
static int binarySearch(int[] arr, int target){
    if(arr.length <= 0 ){
        return -1;
    }

    int start = 0 ,end = arr.length-1;
    
    while(start <= end){
        int mid = mid(start, end);
        if(target < arr[mid]){
            end = mid-1;
        }else{
            
        }
        return mid;
    }
    return -1;
}
    static int mid(int start, int end){
        return start+end/2;
    }
    
}