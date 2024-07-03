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
            if(i != correctIndex) {
                if(nums[i] == nums[correctIndex]) {
                    if(!list.contains(nums[i])) {
                        list.add(nums[i]);
                    }
                } else {
                    swap(nums, i, correctIndex);
                }
            } else {
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
