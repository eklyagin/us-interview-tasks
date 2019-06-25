package com.klyagin;

//Task URL: https://leetcode.com/problems/integer-to-roman/

import java.util.NavigableMap;
import java.util.TreeMap;

public class IntegerToRoman {
    public static String intToRoman(int number) {
        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
        StringBuilder result = new StringBuilder();
        int val = map.floorKey(number);
        if (val == number){
            return map.get(number);
        }
        return result.append(map.get(val) + intToRoman(number - val)).toString();
    }

    public static void main(String[] args) {
        //Tests
        System.out.println(IntegerToRoman.intToRoman(3));
        System.out.println(IntegerToRoman.intToRoman(4));
        System.out.println(IntegerToRoman.intToRoman(9));
        System.out.println(IntegerToRoman.intToRoman(58));
        System.out.println(IntegerToRoman.intToRoman(1994));
        /** Result:
         Runtime: 15 ms, faster than 12.32% of Java online submissions for Integer to Roman.
         Memory Usage: 41.9 MB, less than 6.82% of Java online submissions for Integer to Roman.
         */
    }
}
