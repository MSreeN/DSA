package learn.dsa.Sorting;

public class SortArrayOfTwoTypes {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7};
        sortTypes(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sortTypes(int[] arr, int low, int high){
        if(low < high){
            int p = partition(arr, low, high);
            sortTypes(arr, low, p);
            sortTypes(arr, p+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int l = low - 1;
        int h = high + 1;
        int pivot = arr[low];
        while(true){
            do{
                l++;
            }while(arr[l] % 2 == 0);

            do{
                h--;
            }while(arr[h] % 2 != 0);

            if(l >= h) return h;
            arr[h] = arr[l] + arr[h] - (arr[l] = arr[h]);
        }
    }
}
