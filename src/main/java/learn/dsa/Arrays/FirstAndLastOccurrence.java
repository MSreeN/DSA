package learn.dsa.Arrays;

import learn.dsa.Main;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        firstAndLast(new int[]{1, 2, 3, 3, 3, 3, 4, 5, 9}, 3);
    }

    public static int[] firstAndLast(int[] nums, int target){
            int low = 0;
            int high = nums.length - 1;
            int mid = 0;
            int[] result = new int[]{-1, -1};
            if (nums.length == 0) return result;

            while (low <= high) {
                mid = (low + high) / 2;
                if (nums[mid] == target && result[0] == -1) {
                    if (mid - 1 >= 0 && nums[mid - 1] == target) {
                        high = mid - 1;
                    } else if (mid - 1 >= 0 && nums[mid] == target) {
                        result[0] = mid;

                    }

                }
                else if(nums[mid] == target && result[1] == -1) {
                    if (mid + 1 <= nums.length && nums[mid + 1] == target) {
                        low = mid + 1;
                    } else if (mid + 1 <= nums.length && nums[mid + 1] != target) {
                        result[1] = mid;
                    }
                }
                else if (nums[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            }
            return result;
    }
    }

