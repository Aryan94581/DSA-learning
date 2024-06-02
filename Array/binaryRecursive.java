package Array;
class binaryRecursive {
    public static void main(String[] args) {
        int num[] = { 2, 3, 4, 6, 11 };
        int Target = 6;
        int result = binarySearch(num, Target, 0, num.length - 1);
        if (result != -1)
            System.out.println("your element is at index of :" + result);
        else
            System.out.println("Your Target is not present ");
    }

    // recursive binary search
    // we are passing two more argument (left and right )
    private static int binarySearch(int[] num, int target, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            if (num[middle] == target) {
                return middle;
            } else if (num[middle] < target) {
                return binarySearch(num, target, middle + 1, right);
            } else {
                return binarySearch(num, target, left, middle - 1);
            }
        }
        return -1;
    }
}

// normal binary search
// private static int binarySearch(int[] num, int target) {
// int left = 0;
// int right = num.length - 1;
// while (left <= right) {
// int middle = (left + right) / 2;
// if (num[middle] == target) {
// return middle;
// } else if (num[middle] < target) {
// left = middle + 1;
// } else
// right = middle - 1;
// }