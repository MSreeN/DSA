package learn.dsa.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "[";
        System.out.println(checkIfValid(str));
    }

    public static boolean checkIfValid(String str){
        Deque<Character> stack = new ArrayDeque<>();
        for(char c: str.toCharArray()){
            if('{'== c || '[' == c || '(' == c ){
                stack.push(c);
            }else if(stack.isEmpty()) return false;
            else {
                if (isMatching(stack.getFirst(), c)) stack.poll();
                else return false;
            }
        }
        //below return is need instead of false in scenario when input string is just '[';
        return stack.isEmpty();
    }

    public static boolean isMatching(char a, char b){
        return ((a == '[' && b == ']') ||
                (a == '{' && b == ']') ||
                (a == '(' && b == ')'));
    }
}
