package learn.dsa.Sorting;

public class QuickSort {
    public static void main(String[] args) {
//        int[] arr = {80, 70, 14, 32, 16, 17};
//        int arr[] = {2,5,6,8,13,21,56,34,22,58,16};
//        int[] arr = {18, 80, 30, 90, 40, 50, 70};
//        int[] arr = {5, 3, 8, 4, 2, 7, 1, 10};
//        hoareSort(arr, 0, arr.length-1);
        int arr[] = {15, 10, 4, 3, 20, 7};
        quickSort(arr, 0, arr.length - 1);
        for(int a: arr){
            System.out.print(a+" ");
        }
    }

    public static int lomutoSort(int[] arr, int low, int high){
        int l = low-1;
        int h = high;
        int pivot = arr[high];
        for(int i = 0; i<=high; i++){
            if(arr[i] < pivot){
                l++;
                arr[i] = arr[l] + arr[i] - (arr[l] = arr[i]);
            }
        }
        arr[h] = arr[l+1] + arr[h] - (arr[l+1] = arr[h]);
        return l+1;
    }

    public static int hoareSort(int arr[], int l, int h){
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
            if(i>=j) return j;
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
        }
    }

    public static void quickSort(int arr[], int l, int h) {
        if (l < h) {
            int p = lomutoPartition(arr, l, h);
            quickSort(arr, l, p - 1);
            quickSort(arr, p + 1, h );
        }
    }

    public static int lomutoPartition(int[] arr, int l, int h) {
        int i = l-1, p = arr[h];
        for (int j = l; j <= h; j++) {
            if (arr[j] < p) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[h] = arr[i + 1] + arr[h] - (arr[i + 1] = arr[h]);
        return i + 1;
    }

}
