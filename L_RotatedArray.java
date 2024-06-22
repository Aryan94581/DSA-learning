public class L_RotatedArray {
public static void main(String[] args) {
    
}
static int searchRotatedArr(int[] arr, int target){

    int start = 0;
    int end = arr.length-1;
    int pivit = pivit(arr, start, end);
    int firstSide = binarySearch(arr, target, start, pivit);
    if(firstSide != -1){
        return firstSide;
    }else{
        return binarySearch(arr, target, pivit+1, end);
    }

}

static int pivit(int[] arr, int start, int end){
    if(arr.length > 0){

        while(start <= end){
        int mid = mid(start, end);
        
            if(arr[mid] > arr[mid+1]){
                return mid;
            }else if (arr[mid] < arr[mid-1]) {
                return mid-1;
            }else{
                if (arr[mid] > arr[start]) {
                    start = mid+1;
                }else{
                    end = mid-1;
                }        
            }
        }
    }
        return -1;
}

static int binarySearch(int[] arr, int target, int start , int end){

    while(start <= end){
        int mid = mid(start, end);
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
static int mid(int start, int end){
    return start +(end - start)/2;
}

}
