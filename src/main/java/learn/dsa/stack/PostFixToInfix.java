package learn.dsa.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class PostFixToInfix {
    public static void main(String[] args) {
//        String str = "ABC*D-E/+";
        String str = "ABCD^E-FGH*+^*+I-";
        System.out.println(postfixToInfix(str));
    }

//    ABC*D-E/+
//    A+(B*C-D)/E
    public static String postfixToInfix(String str){
        StringBuilder res = new StringBuilder();
        Deque<String> stack = new ArrayDeque<>();

        for(int i = 0; i < str.length(); i++){
            if(Character.isLetterOrDigit(str.charAt(i))) stack.push(str.charAt(i)+"");
            if(!Character.isLetterOrDigit(str.charAt(i))){
                String ele1 = stack.poll();
                String ele2 = stack.poll();
                stack.push(ele2+str.charAt(i)+ele1);
            }
        }
        return stack.poll();
    }
}
