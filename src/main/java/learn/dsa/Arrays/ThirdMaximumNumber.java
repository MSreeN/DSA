package learn.dsa.Arrays;

import java.util.*;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        System.out.println(find(new int[]{1,2,2,5,3,5}));
    }

    public static int find(int[] arr){
//        List<Integer> list = new ArrayList<>();
//        for(int a: arr){
//            if(!list.contains(a)){
//                list.add(a);
//            }
//        }
//        Integer[] nda = new Integer[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            nda[i] = list.get(i);
//        }
//
//
//        Arrays.sort(nda, Collections.reverseOrder());
//        return nda[2];
        SortedSet<Integer> sortedSet = new TreeSet<>();
        for(int a: arr){
            if(sortedSet.size() < 3){
                sortedSet.add(a);
            }
            else{
                if(sortedSet.first() < a && !sortedSet.contains(a)){
                    sortedSet.remove(sortedSet.first());
                    sortedSet.add(a);
                }
            }
        }

        if (sortedSet.size() < 3) return sortedSet.last();
        return sortedSet.first();
    }
}
