package learn.dsa.Arrays;

//Given a string and k which is an integer, you are allowed to change k char's in string to any
// alphabet to form longest substring and return and size
//for example input string ABAAB, if k is 2 they you can change B's to A so that the longest
// substring with same alphabets will be 4
public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 2;
        int l = 0;
        int max = -1;
        int[] charCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i)]++;
        }
//        for (int r = 0; r < s.length(); r++) {
//            if(s.charAt(r) != s.charAt(l) && k > 0){
//                k--;
//            }
//            max = Math.max(max, r - l +1);
//            while
//
//        }
    }
}
