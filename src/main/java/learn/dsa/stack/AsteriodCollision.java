package learn.dsa.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class AsteriodCollision {
  public static void main(String[] args) {
    // checkCollision(new int[]{5, 10, -5, -10, 8, -8, -3, 12});
    checkCollision(new int[]{1, 2, 3, -4, -2});
  }
//  [1, 2, 3, -4, -2]
//  [5, 10, -5, -10, 8, -8, -3, 12]
  public static void checkCollision(int[] asteriods){
//    ArrayDeque<Integer> deque = new ArrayDeque<>();
//    for(int ele : asteriods){
//      if(deque.peekLast() != null){
//        if(ele < 0 && deque.getLast() > 0){
//            while(deque.getLast() < Math.abs(ele)){
//              deque.pollLast();
//            }
//            deque.addLast(ele);
//          }
//          else if(deque.getLast() == Math.abs(ele)){
//            deque.pollLast();
//          }
//        }
//        else if(ele > 0 && deque.getLast() < 0){
//          if(Math.abs(deque.getLast()) < ele){
//            while(deque.getLast() < 0){
//              deque.pollLast();
//            }
//            deque.add(ele);
//          }
//          else if(Math.abs(deque.getLast()) == ele){
//            deque.pollLast();
//          }
//        }else{
//          deque.addLast(ele);
//        }
//      }
//      else{
//        deque.addLast(ele);
//      }
//    }
//
//    for(int ele : deque){
//      System.out.println(ele);
//    }
  }
}
