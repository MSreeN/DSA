package learn.dsa.Strings;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
//        String s = "abcaabcdba";
        String s = "abcddefga";
        int first = 0;
        int maxLength = 0;
        HashSet<Character> hashSet = new HashSet<>();
        for (int second = 0; second < s.length(); second++) {
            if (!hashSet.contains(s.charAt(second))) {
                hashSet.add(s.charAt(second));
                maxLength = Math.max(maxLength, second - first + 1);
            } else {
                while (hashSet.contains(s.charAt(second))) {
                    hashSet.remove(s.charAt(first));
                    first++;
                }
                hashSet.add(s.charAt(second));
            }
        }
        System.out.println(maxLength);
    }
}
