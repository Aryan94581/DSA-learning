package Array;
public class noDublicateSortedArray {
    public int removeDuplicates(int[] nums) {
        // TODO
        if (nums.length < 1) {
            return 0;
        }
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

}
