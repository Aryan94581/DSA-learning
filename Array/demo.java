package Array;
class demo {
    public static void main(String[] args) {
        int num[] = { 2, 3, 4, 6, 11 };
        int Target = 3;
        int result = linearSearch(num, Target);
        if (result != -1)
            System.out.println("your element is at index of :" + result);
        else
            System.out.println("Your is not present ");
    }

    private static int linearSearch(int[] num, int target) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                return i;
            }
        }
        return -1;
    }
}