class L_findrange {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10}; 
        int target = 8;
        System.out.println(searchRange(nums, target));
    }



    public  static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start >= end){
            int mid = (start + end)/2;
            if(target < nums[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return mid;
        
    }
}




