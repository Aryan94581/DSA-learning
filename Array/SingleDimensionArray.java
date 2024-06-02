package Array;
class SingleDimensionArray {
    int arr[];
    boolean isSet[];

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        isSet = new boolean[sizeOfArray];
    }

    public void insertIntoArray(int Index, int valueToBeInserted) {

        if (Index >= 0 && Index < arr.length) {
            if (!isSet[Index]) {
                arr[Index] = valueToBeInserted;
                isSet[Index] = true;
                System.out.println("Value Inserted Successfully!");
            } else {
                System.out.println("This cell is already occupied, Sorry!");
            }
        } else {
            System.out.println("Invalid index value Entered");
        }
    }

    public void isEmptyOrNot(int Index) {

        if (Index >= 0 && Index < arr.length) {
            if (isSet[Index]) {
                System.out.println("This Cell is Full :" + Index);

            } else {
                System.out.println("This Cell is Empty");

            }
        } else {
            System.out.println(
                    "Invalid index value Entered. [\" + arr.length + \"] is " +
                            "the highest you can enter.\");\r\n");
        }
    }

    public void show() {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public void DeleteItemArray(int IndexWantToEmpty) {
        try {
            arr[IndexWantToEmpty] = Integer.MIN_VALUE;
            isSet[IndexWantToEmpty] = false;
            System.out.println("Your value is empty at index of :" + IndexWantToEmpty);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("your index value doesnot exist");
        }
    }

}
