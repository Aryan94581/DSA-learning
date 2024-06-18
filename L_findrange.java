class L_findrange {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10}; 
        int target = 8;
        System.out.println(searchRange(nums, target));
    }



    public  static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        
        
    return ans;
    }
    static int biSearch(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while(start >= end){
            int mid = (start + end)/2;
            if(target < nums[mid]){
                end = mid-1;
            }else if(target > nums[mid]){
                start = mid+1;
            }else{
            // potential mid
            ans = mid;
            if(findStartIndex == true){
                end = mid-1;
            } else{
                start = mid+1; 
            }
            }
        }
        return ans;
    }
}




