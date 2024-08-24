package learn.dsa.hash;

public class PariWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {3, 2, 8, 15, -8};
        int sum = 17;
        int[] hashTable = new int[1001];
        for(int ele: arr){
            hashTable[ele] = 1;
        }
        
    }
}
