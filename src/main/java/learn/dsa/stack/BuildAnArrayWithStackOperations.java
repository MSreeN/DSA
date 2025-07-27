package learn.dsa.stack;

import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOperations {

    static final String PUSH = "Push";
    static final String POP = "Pop";

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2,3,4, 7, 8};
        buildArray(arr, 8);

    }

    public static void buildArray(int[] arr, int n){
        List<String> result = new ArrayList<>();
//        int index = 0;
//        int[] arr2 = IntStream.range(1, n).toArray();
//        IntStream.range(0, arr.length).forEach((i) -> {
////            if(arr.length - 1 == i) return;
//            if(arr[i] == arr2[i]){
//                result.add(PUSH);
//            }
//            if(arr[i] !=  arr2[i]) {
//                result.add(PUSH);
//                result.add(POP);
//            }
//        });
//
////        return result;

        int arr1Index = 0;
        int stream = 1;
        while(arr1Index < arr.length && stream <= n){
            result.add(PUSH);
            if(arr[arr1Index] == stream){
                arr1Index++;
            }
            else if(arr[arr1Index] != stream){
                result.add(POP);
            }
            stream++;
        }
        result.forEach(System.out::println);
    }
}
