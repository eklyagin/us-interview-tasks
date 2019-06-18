package com.klyagin;

//Task URL: https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int stringSize = s.length();
        int result = 0;
        int step = 0;
        for (int i = 0; i < stringSize; i++) {
            if (map.containsKey(s.charAt(i))) {
                step = Math.max(map.get(s.charAt(i)), step);
            }
            result = Math.max(result, i - step + 1);
            map.put(s.charAt(i), i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        //Tests
        System.out.println(LengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(LengthOfLongestSubstring.lengthOfLongestSubstring("bbbbb"));
        System.out.println(LengthOfLongestSubstring.lengthOfLongestSubstring("pwwkew"));
        System.out.println(LengthOfLongestSubstring.lengthOfLongestSubstring("aa"));
        System.out.println(LengthOfLongestSubstring.lengthOfLongestSubstring("au"));
        System.out.println(LengthOfLongestSubstring.lengthOfLongestSubstring("cdd"));
        System.out.println(LengthOfLongestSubstring.lengthOfLongestSubstring("dtdztwhepnkguuuowsxztrmivgdyiw"));
        /** Result:
         Runtime: 7 ms, faster than 85.45% of Java online submissions for Longest Substring Without Repeating Characters.
         Memory Usage: 36.2 MB, less than 99.88% of Java online submissions for Longest Substring Without Repeating Characters.
         **/
    }
}
