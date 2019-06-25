package com.klyagin;

//Task URL: https://leetcode.com/problems/roman-to-integer/

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++){
            if(map.containsKey(chars[i])){
                result += map.get(chars[i]);
            }
        }

        if (s.contains("IV") || s.contains("IX")) result -=2;
        if (s.contains("XL") || s.contains("XC")) result -=20;
        if (s.contains("CD") || s.contains("CM")) result -=200;
        return result;
    }

    public static void main(String[] args) {
        //Tests
        System.out.println(RomanToInteger.romanToInt("III"));
        System.out.println(RomanToInteger.romanToInt("IV"));
        System.out.println(RomanToInteger.romanToInt("IX"));
        System.out.println(RomanToInteger.romanToInt("LVIII"));
        System.out.println(RomanToInteger.romanToInt("MCMXCIV"));
        /** Result:
         Runtime: 7 ms, faster than 42.66% of Java online submissions for Roman to Integer.
         Memory Usage: 38.3 MB, less than 33.73% of Java online submissions for Roman to Integer.
         */
    }
}
