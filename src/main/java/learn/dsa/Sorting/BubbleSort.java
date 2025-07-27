package learn.dsa.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {6, 12, 3, 5, 4, 44, 12, 0, 7, 8, 1};
        int n = arr.length;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < (arr.length - i) - 1; j ++){
                if(arr[j] > arr[j+1]){
                    arr[j] = arr[j] ^ arr[j+1];
                    arr[j+1] = arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];
                }
            }
        }
        for(int i : arr){
            System.out.println(i);
        }
    }
}
