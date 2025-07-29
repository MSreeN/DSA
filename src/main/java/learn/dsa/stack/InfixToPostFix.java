package learn.dsa.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class InfixToPostFix {
    public static void main(String[] args) {
//        String str = "a+(b*c)";
//        String str = "(a+(b*(c-d)))";
//        String str = "((a+((b*c)/d))+e)";
        String str = "a+b*c+d";
        System.out.println(infixToPostFix(str));
    }

    public static String infixToPostFix(String str){
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder res = new StringBuilder();
        for(char c: str.toCharArray()){
            if(!Character.isAlphabetic(c)) stack.push(c);
            else if(Character.isAlphabetic(c)) res.append(c);
            if(c == ')'){
                stack.poll();
                while(stack.peek() != '('){
                    res.append(stack.poll());
                }
                stack.poll();
            }
        }
        while(!stack.isEmpty()){
            res.append(stack.poll());
        }

        return res.toString();
    }
}
