package learn.dsa.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class InfixToPostFix {
    public static void main(String[] args) {
//        String str = "a+(b*c)";
//        String str = "(a+(b*(c-d)))";
//        String str = "((a+((b*c)/d))+e)";
        String str = "a*(b+c*(d-e))"; //abc*+d+
        System.out.println(infixToPostFix(str));
    }

    public static String infixToPostFix(String str){
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder res = new StringBuilder();
        for(char c: str.toCharArray()){
            if (c == ')') {
                while (stack.peek() != '(') {
                    res.append(stack.poll());
                }
                stack.poll();
            }
            else if(Character.isLetterOrDigit(c)) res.append(c);
            else if(c == '(') stack.push(c);
            else{
                while (!stack.isEmpty() && getPriority(c) <= getPriority(stack.peek())) {
                    res.append(stack.poll());
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
            res.append(stack.poll());
        }

        return res.toString();
    }

    public static int getPriority(char c){
        return switch (c) {
            case '^' -> 4;
            case '*', '/' -> 3;
            case '+', '-' -> 2;
            default -> -1;
        };
    }
}
