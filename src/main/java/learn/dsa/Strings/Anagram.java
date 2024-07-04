package learn.dsa.Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("nl", "cx"));
        int[] arr1 = {3,3,-1};
        int [] arr2 = {3,3,-1};
        System.out.println(Arrays.compare(arr1, arr2));
        int[] arr3 = Arrays.copyOf(arr2, arr2.length);
//        System.out.println(Arrays.toString(arr3));
//        System.out.println(arr1.equals(arr2));
    }

    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()) return false;
        int[] sHash = new int[26];
        int[] tHash = new int[26];
        for (int i = 0; i <= s.length() - 1; i++) {
            char c = s.charAt(i);
            int index = c - 'a';
            sHash[index] = ++sHash[index];
        }
        for (int i = 0; i <= t.length() - 1; i++) {
            char c = t.charAt(i);
            int index = c - 'a';
            tHash[index] = ++tHash[index];
        }

        for (int i = 0; i <= sHash.length - 1; i++) {
            if (sHash[i] != tHash[i]) return false;
        }
        return true;
    }
}
