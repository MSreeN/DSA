package learn.dsa.SlidingWindow;

import java.util.Arrays;

public class LongestRepeatingCharacter {
  public static void main(String[] args) {
    String s = "BAABAABBBAAA";
    optimal(s, 2);
  }

  public static void brute(String s, int k){
    int maxCount = 0;
    for(int i = 0; i<s.length(); i++){
      int[] hash = new int[26];
      int maxFrequency = 0;
      for(int j = i; j < s.length(); j++){
        hash[s.charAt(j) - 'A']++;
        maxFrequency = Math.max(maxFrequency, hash[s.charAt(j) - 'A']);
        if((j-i+1) - maxFrequency <= k){
          maxCount = Math.max(maxCount, (j-i+1));
        }
        else{
          break;
        }
        
      }
    }
    System.out.println(maxCount);
  }

  public static void optimal(String s, int k){
    // BAABAABBBAAA
    // 0123456789    
    int maxCount = 0;
    int r = 0, l = 0;
    int[] freq = new int[26];
    int maxFrequency = 0;
    freq.si
    int changes = 0;
    while(r < s.length() && l <= r){
      freq[s.charAt(r) - 'A']++;
      maxFrequency = Math.max(maxFrequency, freq[s.charAt(r) - 'A']);
      changes = r-l+1 - maxFrequency;
      while(changes > k){
        freq[s.charAt(l) - 'A']--;
        l++;
        maxFrequency = Math.max(maxFrequency, freq[s.charAt(r) - 'A']);
        changes = r-l+1 - maxFrequency;
      }
      maxCount = Math.max(maxCount, r-l+1);
      r++;
    }
    System.out.println(maxCount);
  }
}
