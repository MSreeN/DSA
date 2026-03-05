package learn.dsa.Arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        twoSum(new int[]{2, 7, 11, 15}, 9);
    }

    public static int[] twoSum(int nums[], int target){
        Arrays.sort(nums);

        int i = 0;
        int j = nums.length - 1;
        int res[] = new int[2];
        while (j > i) {
            int currentSum = nums[i] + nums[j];
            if (currentSum == target) res = new int[]{i, j};
            else if (currentSum < target) i++;
            else j--;
        }
        return res;
    }
}
