package learn.dsa.Arrays;

import java.util.Arrays;

public class ReplaceElementWithGreatestElementOnRightSide {
    public static void main(String[] args) {
        int arr[] = {17, 18, 5, 4, 6, 1};
        findGreatestAndReplace(arr);
        Arrays.stream(arr).forEach(System.out::println);

    }

    public static void findGreatestAndReplace(int[] arr){
        int length = arr.length;
        int max = arr[length - 1];
        arr[length - 1] = -1;
        if(length == 1) return;
        for(int i = length -2 ; i >= 0; i--){
            int temp = arr[i];
            arr[i] = max;
            if(temp > max){
                max = temp;
            }
        }
    }
}
