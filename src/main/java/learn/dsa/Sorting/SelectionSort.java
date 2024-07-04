package learn.dsa.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {6, 12,3,5,4,44 , 12, 7,8,1};
        for (int i = 0; i < arr.length - 1; i++) {
        int min = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[min] > arr[j]) {
                    min = j;
                }
            }
            if(min == i) continue;
            arr[min] = arr[min] ^ arr[i];
            arr[i] = arr[min] ^ arr[i];
            arr[min] = arr[min] ^ arr[i];


        }
        for(int a: arr){
            System.out.print(a+" ");
        }

    }
}
