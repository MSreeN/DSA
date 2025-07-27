package learn.dsa.Sorting;

import java.util.Arrays;

public class MergeSortPractice {
    public static void main(String[] args) {
        int arr[] = {4, 6, 12, 15, 20, 22, 1, 13, 18};
        mergeSort(arr, 0, arr.length -1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int low, int high){
        int mid = (low+high)/2;
        if(low < high) {
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low,int mid, int high){
        int[] arr1, arr2;
        arr1 = new int[mid - low +1];
        arr2 = new int[high - mid];

        for(int i = 0; i < arr1.length; i++){
            arr1[i] = arr[low+i];
        }

        for(int i =0; i < arr2.length; i++){
            arr2[i] = arr[mid+i+1];
        }

        int i = 0,j = 0;
        int k = low;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                arr[k] = arr1[i];
                i++;
                k++;
            }
            else if(arr1[i] > arr2[j]){
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i < arr1.length){
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j < arr2.length){
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
}
