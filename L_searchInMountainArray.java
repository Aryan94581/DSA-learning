// 1095. Find in Mountain Array 
public class L_searchInMountainArray { 
public static void main(String[] args) {
    int[] array = {0, 2, 5, 7, 8, 6, 2, 0};
        System.out.println("your value is at index of :" + searchInMountainArray(array, 5));
}
    static int searchInMountainArray(int[] arr, int target){
        if(arr.length <= 0){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        int peak = peakPoint(arr);
        int firstSide = binarySearchAsse(arr, target, start, peak);
        int secondSide =  binarySearchDec(arr, target, peak, end);
        if(firstSide != -1){
            return firstSide;
        }else if(secondSide != -1){
            return secondSide;
        }else{
            return -1;
        }
    }
    static int binarySearchAsse(int[] arr, int target, int start, int end){          
    
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
            return -1;
            }

    static int binarySearchDec(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = mid(start, end);
            if (target == arr[mid]) {
                return mid;
            }else if(target < arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    static int peakPoint(int[] arr){
        int start = 0 ,end = arr.length-1;
            
            while(start < end){
                int mid = mid(start, end);
                
                if(arr[mid] > arr[mid+1]){
                    end = mid;
                }else {
                    start = mid+1;
                }
            }
            return start;
    }
    static int mid(int start, int end){
        return start +(end - start)/2;
    }
}
