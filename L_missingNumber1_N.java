import java.util.ArrayList;
public class L_missingNumber1_N {
        public ArrayList<Integer> findDisappearedNumbers(int[] nums) {
            ArrayList<Integer> list = new ArrayList<>();
            int i = 0;
            while(i < nums.length){
                int correctIndex = nums[i]-1;
                    if(i != correctIndex){
                        if(nums[i] == nums[correctIndex]){                        
                            i++;
                        }else{
                        swap(nums, i, correctIndex);
                        }
                    }else{
                        i++;
                    }
                }
            for(int j = 0; j < nums.length; j++){
                if(nums[j] != j+1){
                    list.add(j+1);
                }
            }
            return list;
        }
        static void swap(int[] arr, int index1, int index2){
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
}
