package learn.dsa.stack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class PreviousAndNextGreaterElement {
    public static void main(String[] args) {
//        int arr[] = new int[]{2, 10, 30, 5, 15};
//        int arr[] = new int[]{20, 30, 10, 5, 15};
        int arr[] = new int[]{1, 3, 2, 4};
        int res[] = new int[arr.length];
        nextGreater(arr, res);
//        for(int a: res){
//            System.out.print(a + " ");
//        }
    }

    static void prevGreater(int[] arr, int[] res){
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while(i < arr.length){
            if(stack.empty()) {
                res[i] = -1;
                stack.push(arr[i]);
                i++;
            }
            if(!stack.empty() && stack.peek() < arr[i]) stack.pop();
            if(!stack.empty() && stack.peek() > arr[i]) {
                res[i] = stack.peek();
                stack.push(arr[i]);
                i++;
            }
        }
    }

    public static void nextGreater(int[] arr, int[] ress){
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            res.add(-1);
        }
        for(int i = arr.length-1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }

            if(!stack.empty() && stack.peek() > arr[i]){
                res.set(i, stack.peek());
            }

            stack.push(arr[i]);
        }

        for(int k: res){
            System.out.print(k+" ");
        }
    }
}
