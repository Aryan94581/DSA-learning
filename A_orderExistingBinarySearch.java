public class A_orderExistingBinarySearch {
    public static void main(String[] args) {
        int[] array = {1,3,6,8,15,24,38,49,52,58,69,83};
        int[] decArray = {88,87,86,83,75,53,47,32,21,12,11};
        System.out.println("your value is at index of :" + binarySearch(array, 83));
        System.out.println("your value is at index of :" + binarySearch(decArray, 87));
        
    }
    
    static int binarySearch(int[] arr, int target){
        if(arr.length <= 0 ){
            return -1;
        }
        
        if(arr[0] > arr[arr.length-1]){

        int start = 0 ,end = arr.length;
            
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
        }else{

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
        return -1;
        }
    }

    static int mid(int start, int end){
        return (start+end)/2;
    }

}