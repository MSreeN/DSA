package learn.dsa.SlidingWindow;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

class SlidingWindowMaximum {
  public static void main(String[] args) {
    // System.out.println(Arrays.toString(returnMax(new int[]{1,3,-1,-3,5,3,6,7},
    // 3)));
    System.out.println(Arrays.toString(returnMax(new int[] { -7, -8, 7, 5, 7, 1, 6, 0 }, 4)));
    // System.out.println(Arrays.toString(returnMax(new int[]{1}, 1)));
  }

  public static Integer[] returnMax(int[] nums, int k) {
    ArrayDeque<Integer> dequeue = new ArrayDeque<>();
    int i = 0;
    // int j = i + k -1;
    while (i < nums.length) {
      if (!dequeue.isEmpty()) {
        int peek = dequeue.getFirst();
        int csw = i - peek;
        if (nums[peek] <= nums[i]) {
          if (csw < k) {
            dequeue.removeFirst();
            dequeue.add(i);
          } else {
            dequeue.add(i);
          }
        }
      } else
        dequeue.add(i);
      i++;
    }

    return dequeue.toArray(new Integer[0]);

  }
}