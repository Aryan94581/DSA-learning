import java.util.ArrayList;
import java.util.List;

class L_dublicateNumber {

public static void main(String[] args) {
        int[] nums = {5, 4, 6, 7, 9, 3, 10, 9, 5, 6};
        List<Integer> arr = findDuplicates(nums);
        System.out.println(arr);
            
        }

    public static List<Integer> findDuplicates(int[] nums) {
        
        
        int i = 0;
        while(i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int j = 0; j< nums.length; j++){
            if(nums[j] != j+1){
                list.add(nums[j]);
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
