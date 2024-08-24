package learn.dsa.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {

    public static void main(String[] args) {
    int[] arr = new int[]{1,2};
    HashMap<Integer, Integer> hashTable = new HashMap<>();
    for(int a: arr){
        if(hashTable.containsKey(a)){
            hashTable.put(a, hashTable.get(a)+1);
        }else{
            hashTable.put(a, 1);
        }
    }

        HashSet<Integer> hashSet = new HashSet<>(hashTable.values());
        if(hashSet.size()==hashTable.size()) {
            System.out.println(true);
        }else System.out.println(false);


    }
}
