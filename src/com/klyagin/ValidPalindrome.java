package com.klyagin;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        String palindrom = s.trim()
                .replaceAll("[^a-zA-Z0-9 ]" ,"")
                .replaceAll(" ", "")
                .toLowerCase();
        int left = 0;
        int right = palindrom.length() -1;
        System.out.println(palindrom);
        while (left < right){
            if (palindrom.charAt(left) != palindrom.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        /** Result:
         Runtime: 20 ms, faster than 20.18% of Java online submissions for Valid Palindrome.
         Memory Usage: 39 MB, less than 54.46% of Java online submissions for Valid Palindrome.
         **/
    }
}
