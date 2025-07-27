package learn.dsa.Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class FruitIntoBaskets {
    public static void main(String[] args) {
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        int maxFruits = 0;
//        int l = 0;
//        for(int r = 0; r < arr.length; r++){
//            if(!hashMap.containsKey(arr[r])){
//                hashMap.put(arr[r], 1);
//            }
//            if(hashMap.containsKey(arr[r])){
//                hashMap.put(arr[r], hashMap.get(arr[r])+1);
//            }
//
//            if(hashMap.size() >2){
//               while(hashMap.get(arr[l]) > 0){
//                   hashMap.put(arr[l], hashMap.get(arr[l]) - 1);
//                   l++;
//               }
//            }
//        }
//        int arr[] = {3, 3, 3 ,1, 2, 1, 1, 2, 3, 3, 4};
        int arr[] = {1, 2, 1};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int l = 0;
        int max = -1;
        for(int r = 0; r < arr.length; r++){
            hashMap.computeIfPresent(arr[r], (k, v) -> v + 1);
            if(!hashMap.containsKey(arr[r])){
                hashMap.put(arr[r], 1);
            }
            if(hashMap.size() > 2) {
                while(hashMap.size() > 2){
                    hashMap.computeIfPresent(arr[l], (k, v) -> v -1);
                    if(hashMap.get(arr[l]) == 0) hashMap.remove(arr[l]);
                    l++;
                }
            }
            max = Math.max(max, r - l +1);
        }
        System.out.println(max);
    }
}
