package learn.dsa.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class NextGreaterElementII {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 1};
        int[] res = findNextGreaterII(arr);
        for(int i: res){
            System.out.println(i);
        }
    }

//    [1,2,3,4,3]
//    [2,3,4,-1,4]
    public static int[] findNextGreaterII(int[] nums){
        int res[] = new int[nums.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = (nums.length*2) -1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek() <= nums[i% nums.length]){
                stack.poll();
            }
            if(!stack.isEmpty()) {
                res[i%nums.length] = stack.peek();
            }else{
                res[i%nums.length] = -1;
            }
            stack.push(nums[i%nums.length]);

        }
        return res;
    }
}
