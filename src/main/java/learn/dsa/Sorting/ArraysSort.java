package learn.dsa.Sorting;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArraysSort {

    public static void main(String[] args) {
//        nonPrimitiveSort();
        primitiveSort();
    }

    public static void nonPrimitiveSort(){
        int[] arr = {1,6,4,2,7,4,8};
        Arrays.sort(arr);
        for(int a: arr){
            System.out.println(a);
        }
    }

    public static void primitiveSort() {
        Integer[] arr = {5, 6, 8, 2, 4, 8, 4, 3, 7, 5};
//        Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr, new ArraysSort().new MyComparator());
        for(int a: arr){
            System.out.print(a+" ");
        }
    }

    class MyComparator implements Comparator<Integer>{

        public int compare(Integer o1, Integer o2){
            if(o1 > o2) return -1;
            else if(o1 < o2) return 1;
            else return 0;

        }
    }
}
