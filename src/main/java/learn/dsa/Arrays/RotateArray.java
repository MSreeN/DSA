package learn.dsa.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arrOrg = {6,4,16,18,1,2,19,34,61};
        for (int i : arrOrg) {
            System.out.print(i + ", ");
        }
        System.out.println();
        inPlaceRotate(arrOrg, 4);
        for(int i : arrOrg){
            System.out.print(i + ", ");
        }
    }
    public static int[] rightRotateArray(int[] arrRef, int k){
        k = k % arrRef.length -1;
        if(k ==0) return arrRef;
        int[] arr = new int[arrRef.length];
        for(int i = 0; i < arrRef.length; i++){
            if(i+k <= arrRef.length-1){
                arr[i+k] = arrRef[i];
            }
            else{
                int toGoIndex = k - ((arrRef.length -1) - i) - 1;
                arr[toGoIndex] = arrRef[i];
            }
        }
        return arr;
    }

    public static int[] leftRotateArray(int[] arrRef, int k){
        k = k % arrRef.length;
        if(k == 0) return  arrRef;
        int[] arr = new int[arrRef.length];
        for(int i = 0; i< arr.length; i++){
            if(i-k < 0){
                int toGoIndex = ((arrRef.length - 1) - k) + i+1;
                arr[toGoIndex] = arrRef[i];
            }
            else{
                arr[i-k] = arrRef[i];
            }
        }

        return arr;
    }

    public static void inPlaceRotate(int[] nums, int k){
        k = k % nums.length;
        if (k <= 0) return;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    public static void reverse(int[] nums, int start, int end){
        int low = start;
        int high = end;
        while(low < high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
}
