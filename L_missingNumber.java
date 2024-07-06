public class L_missingNumber {
    // 268. Missing Number leet code
    public int missingNumber(int[] nums) {
        int sumOfArray = 0;
        int sumOfIndex = 0;
        for(int i = 0; i< nums.length; i++){
            sumOfArray += nums[i];
            sumOfIndex += i+1;
        }
        return sumOfIndex - sumOfArray; 
    }
}