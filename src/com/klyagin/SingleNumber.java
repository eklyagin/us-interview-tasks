package com.klyagin;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)){
                set.remove(num);
            }else {
                set.add(num);
            }
        }
        return set.iterator().next();
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,1}));
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
        /** Result:
         Runtime: 8 ms, faster than 20.62% of Java online submissions for Single Number.
         Memory Usage: 40.4 MB, less than 89.63% of Java online submissions for Single Number.
         **/
    }
}
