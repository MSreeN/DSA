package learn.dsa.Arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
//        int arr[] = new int[]{2, 3, 4, 1, 8, 3, 2, 0, 0};
        int arr[] = new int[]{9,8,7,6,5,4,3,2,1};
        findNextPermutation(arr);
    }

    static int[] findNextPermutation(int[] nums){
        int len = nums.length;
        int breakIndex = -1;

        for(int i = len - 2; i >= 0 ; i--){
            if(nums[i + 1] > nums[i]){
                breakIndex = i;
                break;
            }
        }

        if(breakIndex >= 0){

            for(int i = len - 1; i > breakIndex; i--){
                if(nums[breakIndex] < nums[i]){
                    int temp = nums[breakIndex];
                    nums[breakIndex] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
            Arrays.sort(nums, breakIndex + 1, len);

        }
        if(breakIndex == -1){
            reverseArray(nums);
        }
        return nums;
    }

    static void reverseArray(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
