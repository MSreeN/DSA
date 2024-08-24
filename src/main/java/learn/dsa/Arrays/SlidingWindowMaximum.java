package learn.dsa.Arrays;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
//        int arr[] = {1, 8, 30, -5, 20, 7};
        int arr[] = {5, 10, 6, 90, 3};
        int k = 2;
//        int result[] = new int[arr.length-k+1];
//        for(int i = 0; i<arr.length-k; i++){
//
//        }
        maxOfKConsecutiveElements(arr, k);
    }

    public static void maxOfKConsecutiveElements(int[] arr, int k){
        int max = 0;
        int arrLen = arr.length;
        int sum = 0;
        for(int l = 0; l<k; l++){
            sum+=arr[l];
        }
        int last = arr[0];
        for(int i = 1; i<arrLen-k; i++){
            sum = sum-last+arr[i+k-1];
            last = arr[i];
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
