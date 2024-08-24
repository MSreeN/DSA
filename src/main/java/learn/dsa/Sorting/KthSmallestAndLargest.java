package learn.dsa.Sorting;

public class KthSmallestAndLargest {
    public static void main(String[] args) {
        findKthLargest(new int[]{99, 99}, 1);
    }

    public static int findKthLargest(int[] nums, int k) {
        int low = 0;
        int resultIndex = nums.length - k;
        int high = nums.length - 1;
        while (low <= high) {
            int index = partition(nums, low, high);
            if (index < resultIndex) {
                low = index + 1;
            }
            if (index > resultIndex) {
                high = index - 1;
            } else if (index == resultIndex) return nums[index];
        }
        return nums[resultIndex];
    }


    public static int partition(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = l-1;
        for (int j = l; j <= h; j++) {
            if (arr[j] < pivot) {
                i++;
                arr[j] = arr[i] + arr[j] - (arr[i] = arr[j]);
            }
        }
        arr[h] = arr[i + 1] + arr[h] - (arr[i + 1] = arr[h]);
        return i + 1;
    }
}
