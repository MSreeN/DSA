package learn.dsa.Arrays;

public class FindPeak {
    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));
    }

    public static int findPeakElement(int[] nums) {
        int high = nums.length - 1;
        int low = 0;
        int result = -1;
        int mid;
        if (nums.length == 0) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[nums.length - 1] > nums[nums.length - 2]) return nums.length - 1;
        while (low <= high) {
            mid = (high + low) / 2;
            if (mid != 0 && mid != nums.length - 1) {
                if (nums[mid - 1] < nums[mid] && nums[mid + 1] < nums[mid]) {
                    result = mid;
                }
            }
            if (mid != 0 && nums[mid - 1] >= nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return result;
    }
}
