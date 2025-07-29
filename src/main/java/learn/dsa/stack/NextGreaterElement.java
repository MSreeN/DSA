package learn.dsa.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class NextGreaterElement {
    public static void main(String[] args) {
        int nums1[] = {4, 1, 2};
        int nums2[] = {1, 3, 4, 2};
        findNextGreaterElements(nums1, nums2);
    }

    public static int[] findNextGreaterElements(int[] nums1, int[] nums2){
        if(nums1.length == 1) return new int[]{-1};
        int[] res = new int[nums1.length];
        Deque<Integer> stack = new ArrayDeque<>();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums2[nums2.length - 1], -1);
        stack.push(nums2[nums2.length-1]);
//        [1, 3, 4, 2]
        for(int i = nums2.length -2; i >=0; i--){
            while(!stack.isEmpty() && stack.peek() < nums2[i]){
                stack.poll();
            }
            if(stack.isEmpty()) map.put(nums2[i], -1);
            else if(stack.peek() > nums2[i]) map.put(nums2[i], stack.peek());
            stack.push(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}
