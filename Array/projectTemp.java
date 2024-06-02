package Array;
import java.util.Scanner;

public class projectTemp {
    public static void main(String[] args) {
        int Result = 0;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter numberof days you want to calculate :");
        int Days = S.nextInt();
        int DaysArray[] = new int[Days];
        for (int i = 0; i < DaysArray.length; i++) {
            System.out.print("Enter degree of Day " + (i + 1));
            System.out.println();
            DaysArray[i] = S.nextInt();
        }

        for (int A : DaysArray) {
            Result = A;
            Result++;
        }
        System.out.println("The avrage temperature of your area is " + Result / 2);
        for (int i = 0; i < DaysArray.length; i++) {
            if (DaysArray[i] > Result / 2) {
                System.out.println("temperature above the average on day Number :" + (i + 1));
            }
        }
    }
}
