package learn.dsa.Sorting;

public class QuickSort {
    public static void main(String[] args) {
//        int[] arr = {80, 70, 14, 32, 16, 17};
        int arr[] = {2,5,6,8,13,21,56,34,22,58,16};
//        int[] arr = {18, 80, 30, 90, 40, 50, 70};
//        int[] arr = {5, 3, 8, 4, 2, 7, 1, 10};
        lomutoSort(arr, 0, arr.length-1);
        for(int a: arr){
            System.out.print(a+" ");
        }
    }

    public static void lomutoSort(int[] arr, int low, int high){
        int i = low -1;
        int pivot = arr[high];
        for (int j = low; j < high; j++) {
            if(arr[j] < pivot){
                i++;
                arr[j] = arr[j] + arr[i];
                arr[i] = arr[j] - arr[i];
                arr[j] = arr[j] - arr[i];
            }
        }
        arr[i+1] = arr[high] + arr[i + 1];
        arr[high] = arr[high] - arr[i + 1];
        arr[i+1] = arr[high] - arr[i + 1];
    }

    public static void hoareSort(int arr[], int l, int h){
        int pivot = arr[l];
        int i = l-1;
        int j = h +1;
//        int[] arr = {18, 80, 30, 90, 40, 50, 70};
        while(true){
            do{
                i++;
            }while(arr[i] < pivot);
            do{
                j--;
            }while (arr[j] > pivot);
            if(i>=j) return;
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
        }
    }
}
