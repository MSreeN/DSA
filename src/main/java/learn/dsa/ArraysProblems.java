package learn.dsa;

import java.util.ArrayList;
import java.util.List;

public class ArraysProblems {
    public static void main(String[] args) {
//        copyingArray();
//        removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3});
//        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
//        System.out.println(removeElement(new int[]{1,2,3,4,5,6,7,8}, 9));
            plusOne(new int[]{5, 6, 2, 0, 0, 4, 6, 2, 4, 9});
    }

    public static void copyingArray(){
        int a[] = {1,1,2,3,3,4};
        System.out.println();
    }

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        int twice = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[count] != nums[i]) {
                if (twice <= 2) {
                    count = i;
                    twice = 1;
                } else if (twice > 2) {
                    if (nums[count] != nums[i]) {
                        nums[count] = nums[i];
                        twice = 1;
                        i-= twice % 2;
                    }
                }
            } else {
                twice++;
                if (twice > 2 && twice < 4) {
                    count = i;
                }
            }
        }
        return count;
    }

    public static int removeElement(int[] nums, int k) {
        int firstPointer = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
//            if (firstPointer < nums.length) {
//                if (nums[firstPointer] != k) {
//                    firstPointer++;
//                }
//            }
//            if (nums[i] != k) {
//                temp = nums[firstPointer];
//                nums[firstPointer] = nums[i];
//                nums[i] = temp;
//            }

            if(nums[firstPointer] == k && nums[i] !=k){
                temp = nums[firstPointer];
                nums[firstPointer] = nums[i];
                nums[i] = temp;
                firstPointer++;
            }
            if(nums[firstPointer] != k) firstPointer++;
        }
        return firstPointer;
    }

    public static int[] plusOne(int[] digits) {
        if (digits.length > 1 && digits[digits.length - 1] < 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }
        long sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum *= 10;
            sum += digits[i];
        }
        sum += 1;
        long rem = 0;
        int[] finalDigits = new int[Long.toString(sum).length()];
        for (int i = finalDigits.length - 1; i >= 0; i--) {
            rem = sum % 10;
            sum = sum / 10;
            finalDigits[i] = (int)rem;
        }
        return finalDigits;
    }
}
