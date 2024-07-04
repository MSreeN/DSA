package learn.dsa.Arrays;

public class LeadersInArray {
    public static void main(String[] args) {
        int nums[] = {17, 18, 5, 4, 6, 1};
//        int nums[] = {400};
        LeetLeaders(nums);
        for(int i : nums){
            System.out.print(i + ", ");
        }
    }

//    LeetCode version - Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
//After doing so, return the array.
// Input: arr = [17,18,5,4,6,1]
//Output: [18,6,6,6,1,-1]
    public static int[] LeetLeaders(int[] nums){
//        for(int i = 0; i< nums.length ; i++){
//            nums[i] = getTheLeader(nums, i);
//        }

        int highest = -1;
//        nums[nums.length-1] = -1;
//        if(nums.length == 1) return nums;
        for(int i = nums.length -1; i>=0; i-- ){
            nums[i] = highest;
            if(nums[i] > highest) highest = nums[i];
        }
        return nums;
    }

    public static int getTheLeader(int[] nums, int k){
        if(k == nums.length - 1) return -1;
        if(k+1 == nums.length -1) return nums[nums.length-1];
        int highest = 0;
        for(int i = k+1; i < nums.length; i++){
            if(nums[i] > highest) highest = nums[i];
        }
        return highest;
    }

    //Leaders in Array GFG
    //Print the element in array if there is no other element greater than it on its right
    // Ex = [6, 10, 5,3 2 8,9]
    //op = [10, 9]

}
