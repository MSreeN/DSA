package learn.dsa.queue;

import java.util.LinkedList;
import java.util.Queue;

//If the given digits are 5, 6 then the generated number should only have 5 or 6 for ex, 5, 6,
// 55, 56, 66, 65
public class GenerateNumsWithGivenDigits {

    public static void main(String[] args) {
        generateNumbers(5, 6);
    }

    public static void generateNumbers(int a, int b){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(a);
        queue.add(b);
        for(int i = 0; i < 10; i++){
            int v = queue.remove();
            System.out.println(v);
            queue.add(Integer.valueOf(v+"5"));
            queue.add(Integer.valueOf(v+"6"));
        }
//        System.out.println(queue.poll());

    }
}
