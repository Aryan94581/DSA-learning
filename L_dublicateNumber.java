// 287. Find the Duplicate Number
public class L_dublicateNumber {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length){
                int correctIndex = nums[i]-1;
                    if(i != correctIndex){
                        if(nums[i] == nums[correctIndex]){                        
                            return nums[i];
                        }else{
                        swap(nums, i, correctIndex);
                        }
                    }else{
                        i++;
                    }
                }
        return -1;
    }
    public static void swap(int[] arr, int indexFir, int indexSec){
        int temp = arr[indexFir];
        arr[indexFir] = arr[indexSec];
        arr[indexSec] = temp;
    }
}
