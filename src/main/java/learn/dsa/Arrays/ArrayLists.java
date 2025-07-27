package learn.dsa.Arrays;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> arrayLists = List.of(1,2);
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> l = Collections.unmodifiableList(list);
//        l.add(4);

//        arrayLists.add(5);

        //synchronized list

        //This thread is modifying the thread while below for loop which uses iterator under the
        // hood is iterating, it checks if

        new Thread(() -> l.add(5)).start();
        List<Integer> syncList = Collections.synchronizedList(list);

        for(int i : syncList){
            System.out.println(i);
        }
    }
}
