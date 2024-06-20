public class L_mountainArray {
    public static void main(String[] args) {
        int[] array = {1,3,6,8,15,24,38,49,52,58,69,83};
        System.out.println("your value is at index of :" + mountainArrBs(array));
        
    }
    
    static int mountainArrBs(int[] arr){
        if(arr.length <= 0 ){
            return -1;
        }
    
        int start = 0 ,end = arr.length;
        
        while(start <= end){
            int mid = mid(start, end);
            
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
        static int mid(int start, int end){
            return (start+end)/2;
        }
        
    }