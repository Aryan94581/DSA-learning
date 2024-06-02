package Array;

public class SelectSortArray {
    public static void main(String[] args) {
        int nums[] = { 7, 4, 3, 6, 2, 5 };
        int size = nums.length;
        int temp;
        int minIndex;

        System.err.println("before sorting ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < size - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

        System.out.println();
        System.err.println("After sorting ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
