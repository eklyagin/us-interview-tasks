package com.klyagin;

import java.util.Arrays;

public class ReverseString {

    public static void reverseString(char[] s) {
        int l = 0, h = s.length - 1;
        while(l < h) {
            char t = s[l];
            s[l++] = s[h];
            s[h--] = t;
        }
    }

    public static void main(String[] args) {
        char[] chars1 = new char[]{'h','e','l','l','o'};
        char[] chars2 = new char[]{'H','a','n','n','a','h'};
        reverseString(chars1);
        reverseString(chars2);
        System.out.println(Arrays.toString(chars1));
        System.out.println(Arrays.toString(chars2));
        /** Result:
         Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse String.
         Memory Usage: 51.3 MB, less than 57.40% of Java online submissions for Reverse String.
         **/
    }
}
