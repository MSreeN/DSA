package learn.dsa.Strings;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
//        int arr[] = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int arr[] = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        int left = 0;
        int maxLength = 0;
        int zeroCount = 0;
        for(int right = 0; right<arr.length; right++){
            if(arr[right] == 0) {
                zeroCount++;
            }
            if(zeroCount <= k){
                maxLength = Math.max(right - left + 1, maxLength);
            }
                while(zeroCount >k){
                    if(arr[left] == 0){
                        zeroCount--;
                    }
                    left++;
                }

        }
        System.out.println(maxLength);
    }
}
