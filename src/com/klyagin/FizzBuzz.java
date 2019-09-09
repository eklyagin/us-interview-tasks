package com.klyagin;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i < n + 1 ; i++){
            if (i % 3 == 0 && i % 5 == 0){
                result.add("FizzBuzz");
                continue;
            }
            if (i % 3 == 0){
                result.add("Fizz");
                continue;
            }
            if (i % 5 == 0){
                result.add("Buzz");
                continue;
            }
            result.add("" + i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
        System.out.println(fizzBuzz(11));
        /** Result:
         Runtime: 1 ms, faster than 100.00% of Java online submissions for Fizz Buzz.
         Memory Usage: 36.9 MB, less than 100.00% of Java online submissions for Fizz Buzz.
         **/
    }
}
