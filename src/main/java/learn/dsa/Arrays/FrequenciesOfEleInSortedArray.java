package learn.dsa.Arrays;

public class FrequenciesOfEleInSortedArray {

    public static void main(String[] args) {
        findFrequencies(new int[]{10,10,26,30});
    }

    public static void findFrequencies(int[] arr){
        int count = 1;
        if(arr.length == 1){
            System.out.println(arr[0] + " " + count);
            return;
        }
        int length = arr.length;
        int i = 1;
        while(i < length){

            while(arr[i] == arr[i-1]){
                count++;
                i++;
            }
            System.out.println(arr[i-1] + " " +count);
            count = 1;
            i++;
        }
            if(arr[length-1] != arr[length-2]){
                System.out.println(arr[length-1] + " "+count);
            }
    }
}
