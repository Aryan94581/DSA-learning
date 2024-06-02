package Array;
public class AddingValueInArray {
    public static void main(String[] args) {
        // int num[] = { 2, 3, 4, 6, 11 };
        // SearchingInArray SA = new SearchingInArray();
        // // SA.SearchElement(num, 8);
        // int nums[][] = new int[3][3];
        // nums[0][0] = 3;
        // nums[0][1] = 5;
        // nums[1][0] = 6;
        // nums[1][1] = 2;
        // SA.SearchElementIn2dArray(nums, 6);
        int[] Xyz = { 1, 1, 2, 2, 3, 4, 5 };
        noDublicate nD = new noDublicate();
        nD.removeDuplicates(Xyz);
    }
}
