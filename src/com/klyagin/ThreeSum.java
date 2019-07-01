package com.klyagin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Task URL: https://leetcode.com/problems/3sum/

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            res.addAll(calc(i, nums));
        }
        return res.stream().distinct().collect(Collectors.toList());
    }

    public static List<List<Integer>> calc(int indexC, int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int minIndex = indexC + 1;
        int maxIndex = nums.length - 1;
        int c = -nums[indexC];
        while (minIndex < maxIndex) {
            int a = nums[minIndex];
            int b = nums[maxIndex];
            if ((a + b) == c) {
                result.add(Arrays.asList(-c, a, b));
                maxIndex--;
                minIndex++;
            }
            if ((a + b) > c) {
                b = nums[maxIndex--];
                continue;
            }
            if ((a + b) < c) {
                a = nums[minIndex++];
                continue;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Tests
        System.out.println(ThreeSum.threeSum(new int[] { -1, 0, 1, 2, -1, -4 }));
        /**
         * Runtime: 220 ms, faster than 19.58% of Java online submissions for 3Sum.
         * Memory Usage: 259.8 MB, less than 5.00% of Java online submissions for 3Sum.
         */
    }
}