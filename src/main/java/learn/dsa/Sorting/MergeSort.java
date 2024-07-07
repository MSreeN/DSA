package learn.dsa.Sorting;

public class MergeSort {


    public static void main(String[] args) {
        int arr[] = {4,6,12,15,20,22, 1,13,18};
        merge(arr, 0, 5, 9);
        for(int a : arr){
            System.out.print(a+ " ");
        }
    }

    public static void merge(int[] arr, int low, int mid, int high){
        int[] arr1 = new int[mid+1 - low];
        int[] arr2 = new int[high - mid - 1];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[low+i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[mid+i+1];
        }
        int i = 0, j = 0;
        int k = low;
        while(i<arr1.length && j < arr2.length){
            if(arr1[i]<=arr2[j]){
                arr[k] = arr1[i];
                i++;
            }else if(arr1[i] > arr2[j]){
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length){
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            arr[k] = arr2[j];
            j++;
            k++;
        }

    }
}
