package com.klyagin;

//Task URL: https://leetcode.com/problems/two-sum/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0){
            return new int[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++){
            int secArg = target - nums[j];
            if (map.containsKey(secArg) && j != map.get(secArg)){
                return new int[]{j, map.get(secArg)};
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        //Tests
        System.out.println(Arrays.toString(TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(TwoSum.twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(TwoSum.twoSum(new int[]{3, 2, 4}, 6)));
        /** Result:
         Success
         Details
         Runtime: 2 ms, faster than 99.10% of Java online submissions for Two Sum.
         Memory Usage: 38.2 MB, less than 94.04% of Java online submissions for Two Sum.
        **/
    }
}
