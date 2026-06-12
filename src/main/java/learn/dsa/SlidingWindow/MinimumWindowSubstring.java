package learn.dsa.SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given two strings s and t. Find the smallest window substring of s that
 * includes all characters in t (including duplicates) , in the window. Return
 * the empty string "" if no such substring exists.
 * 
 * 
 * Example 1
 * 
 * Input : s = "ADOBECODEBANC" , t = "ABC"
 * 
 * Output : "BANC"
 * 
 * Explanation : The minimum window substring of string s that contains the
 * string t is "BANC".
 */
public class MinimumWindowSubstring {
  public static void main(String[] args) {
    String s = "a";
    String t = "a";
    System.out.println(minimumWindowString(s, t));
  }

  public static String minimumWindowString(String s, String t) {
    String res = "";

    int l = 0;
    int r = 0;
    int startIndex = -1;
    int minLen = Integer.max(startIndex, startIndex);
    int count = 0;
    Map<Character, Integer> map = new HashMap<>();
    for (char c : t.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    while (r < s.length()) {
      char ch = s.charAt(r);
      if (map.containsKey(ch)) {
        if (map.get(ch) > 0)
          count++;
        map.put(ch, map.get(ch) - 1);
      }
        while (count == t.length()) {
          if (count == t.length()) {
        if (r - l + 1 < minLen) {
          minLen = r - l + 1;
          startIndex = l;
        }
          if (map.containsKey(s.charAt(l))) {
            map.put(s.charAt(l), map.get(s.charAt(l)) + 1);
            if (map.get(s.charAt(l)) > 0)
              count--;
          }
          l++;
        }
      }
      r++;
    }
    return startIndex == -1 ? "" : s.substring(startIndex, startIndex + minLen);
  }
}
