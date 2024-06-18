public class A_ceilingBs {
    
public static void main(String[] args) {
    int[] array = {1,3,6,8,15,24,38,49,52,58,69,83};
    System.out.println("your value is at index of :" + binarySearch(array, 56));
    
}
static int binarySearch(int[] arr, int target){
    if(arr.length <= 0 ){
        return -1;
    }

    int start = 0 ,end = arr.length;
    
    while(start <= end){
        int mid = mid(start, end);
        if (target == arr[mid]) {
            return mid;
        }else if(target < arr[mid]){
            end = mid-1;
        }else{
            start = mid+1;
        }
    }
    return arr[start];
}
    static int mid(int start, int end){
        return (start+end)/2;
    }
}
