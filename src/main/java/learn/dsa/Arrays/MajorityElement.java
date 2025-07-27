package learn.dsa.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
//        HashMap<Integer, Integer> hashTable = new HashMap<>();
//        int max = 0, key = 0;
//        for (int i = 0; i < nums.length; i++) {
//            hashTable.computeIfPresent(nums[i], (k, v) -> v + 1);
//            hashTable.putIfAbsent(nums[i], 1);
//        }
//
//        int k = nums.length / 2;
//        int res = 0;
//        for (Map.Entry<Integer, Integer> entry : hashTable.entrySet()) {
//            if (entry.getValue() > k) res = entry.getKey();
//        }
//
//
//        return res;


        Arrays.sort(nums);

        int max = 0, res = 0, count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) count++;
            if (max < count) {
                max = count;
                res = nums[i];
            }
            if (nums[i] != nums[i + 1]) {
                count = 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{4,4,8,7,5,4,4,8,7,9,5,4}));
    }
}
