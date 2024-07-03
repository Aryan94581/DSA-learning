import java.util.ArrayList;
import java.util.List;

class L_dublicateNumber {

public static void main(String[] args) {
        int[] nums = {5, 4, 6, 7, 9, 3, 10, 9, 5, 6};
        List<Integer> arr = findDuplicates(nums);
        System.out.println(arr);
            
        }

    public static List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                if (i != correctIndex && !list.contains(nums[i])) {
                    list.add(nums[i]);
                }
                i++;
            }
        }
        return list;
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

   
}
