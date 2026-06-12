package learn.dsa.stack;

import java.util.ArrayDeque;

public class BalancedParentheses {
  
  public static void main(String[] args) {
    // ()[{}()]
    String s = "[]]}{[)]()]";
    System.out.println(checkBalance(s));
  }
  public static boolean checkBalance(String s){
    ArrayDeque<Character> deque = new ArrayDeque<>();
    for(char c: s.toCharArray()){
      if(c == '[' || c == '{' || c =='('){
        deque.add(c);
      }
      else if ( c == ']' || c == '}' || c == ')'){
        if(deque.getLast() == giveOtherBrace(c)){
          deque.removeLast();
        }
        else{
          return false;
        }
      }
    }
    if(!deque.isEmpty()) return false;

    return true;
  }

  public static char giveOtherBrace(char ch){
    return switch (ch) {
      case '}' -> '{';
      case ']' -> '[';
      case ')' -> '(';
        
    
      default -> ' ';
    };
  }

}
