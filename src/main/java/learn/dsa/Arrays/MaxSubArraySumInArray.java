package learn.dsa.Arrays;

public class MaxSubArraySumInArray {
    public static void main(String[] args) {
        int[] arr = new int[] {-2,-1};
//        System.out.println(findMaxSum(arr));
        System.out.println(kadanesAlgo(arr));
    }

    static int findMaxSum(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                max = Math.max(sum, max);
            }
        }

        return max;
    }

    static int kadanesAlgo(int[] nums){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum > max){
               max = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}
