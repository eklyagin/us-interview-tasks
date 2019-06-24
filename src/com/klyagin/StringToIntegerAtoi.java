package com.klyagin;

//Task URL: https://leetcode.com/problems/string-to-integer-atoi/

public class StringToIntegerAtoi {

    public static int myAtoiYAEBALEGOVROT(String str) {
        if (str == null || (str.length() == 1 && str.matches("[^a-zA-Z0-9 ]"))){
            return 0;
        }
        StringBuilder result = new StringBuilder();
        char[] chars = str.trim().toCharArray();
        for (int i = 0; i < chars.length; i++){
            if ((i == 0 && chars[i] == '+')){
                continue;
            }
            if ((i == 0 && chars[i] == '-') || Character.isDigit(chars[i])){
                result.append(chars[i]);
            }else {
                break;
            }
        }
        if (result.length() == 0){
            return 0;
        }

        try {
            return Integer.parseInt(result.toString());
        } catch (Exception e) {
            if(Character.isDigit(result.toString().charAt(0))) {
                return Integer.MAX_VALUE;
            }
            if (result.toString().charAt(0) == '-' && result.toString().length() > 1) {
                return Integer.MIN_VALUE;
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        //Tests
        System.out.println(StringToIntegerAtoi.myAtoiYAEBALEGOVROT("42"));
        System.out.println(StringToIntegerAtoi.myAtoiYAEBALEGOVROT("-abc"));
        System.out.println(StringToIntegerAtoi.myAtoiYAEBALEGOVROT("-"));
        System.out.println(StringToIntegerAtoi.myAtoiYAEBALEGOVROT("0-1"));
        System.out.println(StringToIntegerAtoi.myAtoiYAEBALEGOVROT("+-2"));
        System.out.println(StringToIntegerAtoi.myAtoiYAEBALEGOVROT("20000000000000000000"));
        System.out.println(StringToIntegerAtoi.myAtoiYAEBALEGOVROT("   -42"));
        System.out.println(StringToIntegerAtoi.myAtoiYAEBALEGOVROT("4193 with words"));
        System.out.println(StringToIntegerAtoi.myAtoiYAEBALEGOVROT("words and 987"));
        System.out.println(StringToIntegerAtoi.myAtoiYAEBALEGOVROT("-91283472332"));
        /** Result:
         Success
         Details
         Runtime: 4 ms, faster than 25.26% of Java online submissions for String to Integer (atoi).
         Memory Usage: 36.1 MB, less than 99.93% of Java online submissions for String to Integer (atoi).
         */
    }
}
