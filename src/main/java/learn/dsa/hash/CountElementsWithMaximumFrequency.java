package learn.dsa.hash;

import java.util.HashMap;
import java.util.Map;

public class CountElementsWithMaximumFrequency {
    //Find max frequency in hashmap and then find how many elements has that frequency and return
    // count
    //[1,2,2,3,1,4] o/p is 4 cox 1,2,2,1 has max frequencies
    public static void main(String[] args) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int arr[] = {3, 3, 2, 3, 1, 4};
        for (int i = 0; i < arr.length; i++) {
            frequencyMap.computeIfPresent(arr[i], (k, v) -> v + 1);
            frequencyMap.putIfAbsent(arr[i], 1);
        }
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(Integer val: frequencyMap.values()){
            if(val>max) {
                max = val;
            }
        }
        

        for(Integer val: frequencyMap.values()){
            if(max == val) count+=val;
        }

        System.out.println(count);


    }
}
