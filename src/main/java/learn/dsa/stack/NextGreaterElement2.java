package learn.dsa.stack;

import java.util.ArrayDeque;

public class NextGreaterElement2 {
  public static void main(String[] args) {
    // findNextGreater(new int[]{3, 10, 4, 2, 1, 2, 6, 1, 7, 2, 9});
    findNextGreater(new int[]{5, 7, 1, 7, 6, 0});
  }

  public static void findNextGreater(int[] arr){
    int res[] = new int[arr.length];
    ArrayDeque<Integer> deque = new ArrayDeque<>();
    for(int i = (res.length*2)-1; i>=0; i--){
      while(!deque.isEmpty() && deque.peekLast() <= arr[i%arr.length] ){
        deque.pollLast();
      }
      if(i < arr.length && deque.isEmpty()){
        res[i%arr.length] = -1;
      }
      else if(!deque.isEmpty() && i < arr.length && deque.peekLast() > arr[i%arr.length]){
        res[i%arr.length] = deque.peekLast();
      }
      deque.addLast(arr[i%arr.length]);
    }

    for(int a: res){
      System.out.println(a);
    }
  }
}
