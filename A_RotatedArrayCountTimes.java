public class A_RotatedArrayCountTimes {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println("your array is rotated "+ countRotation(nums) +" times!");
    }
    static int countRotation(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int pivit = pivitElDublicate(arr, start, end);
        if(pivit == -1){
            System.out.println("your array is not rotated!");
        }
        // because pivot is the point like end point of non rotated array so the index of pivot is the rotation
        // hese we start index with 0 so we have to Add +1;  
        return pivit +1;
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
