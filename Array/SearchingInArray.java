package Array;
public class SearchingInArray {
    int i;
    int j;

    public void SearchElement(int Array[], int TargetValue) {
        for (i = 0; i < Array.length; i++) {
            if (Array[i] == TargetValue) {
                System.out.println("Your value present at index of :" + i);
                return;
            }
        }
        System.out.println("Your value does not Exist in this Array");
    }

    public void SearchElementIn2dArray(int Array[][], int TargetValue) {
        for (i = 0; i < Array.length; i++) {
            for (j = 0; j < Array[i].length; j++) {
                if (Array[i][j] == TargetValue) {
                    System.out.println("Your value present at index of : [" + i + "],[" + j + "]");
                    return;
                }
            }
        }
        System.out.println("Your value does not Exist in this Array");
    }
}
