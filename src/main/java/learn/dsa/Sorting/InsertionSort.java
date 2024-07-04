package learn.dsa.Sorting;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class InsertionSort {
    public static void main(String[] args) {
        merge(new int[]{2, 0},1, new int[]{1}, 1);

        int[] arr = {6, 12, 3, 5, 4, 44, 12, 7, 8, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = i+1; j >  0; j--){
                if(arr[j] < arr[j-1]){
                    //swap
                    arr[j] = arr[j] ^ arr[j-1];
                    arr[j-1] = arr[j] ^ arr[j-1];
                    arr[j] = arr[j] ^ arr[j-1];
                }
                else{
                    break;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if (nums2.length < 1) return;

        int nums2Pointer = 0;
        //inserting nums2 elements in nums1 at the end
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[nums2Pointer];
            nums2Pointer++;
        }

        //sorting the nums1

        for (int i = 0; i < nums1.length - 1; i++) {
            int j = i;
            while (j > 0 && nums1[j - 1] > nums1[j]) {
                nums1[j] = nums1[j] ^ nums1[j - 1];
                nums1[j - 1] = nums1[j] ^ nums1[j - 1];
                nums1[j] = nums1[j] ^ nums1[j - 1];
                j--;
            }
        }

        // for(int i = 0; i < nums1.length; i++){
        //     if(nums2[nums2Pointer] <= nums1[i]){

        //     }
        // }
    }
}
