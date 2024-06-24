public class A_RotatedArrayCountTimes {
    public static void main(String[] args) {
        
    }
    static int pivitElDublicate(int[] arr, int start, int end){
        while(start <= end){
            int mid = mid(start, end);
            
                if( mid < end && arr[mid] > arr[mid+1]){
                    return mid;
                }
                if (mid > start && arr[mid] < arr[mid-1]) {
                    return mid-1;
                }
                if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                    
                        if(arr[mid] > arr[mid+1]){
                            return mid;
                        }
                        start++;
    
                        if(arr[mid] < arr[mid-1]){
                            return mid-1;
                        }
                    end--;
                }else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                    start = mid + 1;
                }else{
                    end = mid -1;
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
