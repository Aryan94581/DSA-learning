// 852. Peak Index in a Mountain Array
public class L_mountainArray {
    public static void main(String[] args) {
        int[] array = {0, 2, 1, 0};
        System.out.println("highest value :" + mountainArrBs(array));
        
    }
    
    static int mountainArrBs(int[] arr){
        if(arr.length <= 0 ){
            return -1;
        }
    
        int start = 0 ,end = arr.length-1;
        
        while(start < end){
            int mid = mid(start, end);
            
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else {
                start = mid+1;
            }
        }
        return arr[start];
    }
        static int mid(int start, int end){
            return start + (end - start)/2;
        }
        
    }