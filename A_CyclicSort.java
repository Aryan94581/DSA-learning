public class A_CyclicSort {
    public static void main(String[] args) {
        
        
    }
    static void cyclicSort(int[] arr){

        for (int i = 0; i < arr.length-1;) {
            if(i != arr[i]){
                swap(arr, (arr[i]-1), i);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
