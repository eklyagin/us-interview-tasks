package com.klyagin;

//URL: https://leetcode.com/problems/move-zeroes/

import java.util.Arrays;

public class MoveZeros {

    public static void moveZeroes(int[] nums) {
        int pointer = 0;

        for (int i = 0; i <nums.length; i++) {
           if (nums[i] != 0){
               int temp = nums[pointer];
               nums[pointer] = nums[i];
               nums[i] = temp;
               pointer++;
           }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,0,0,1,0,3,12};
        System.out.println("Before:" + Arrays.toString(arr));
        moveZeroes(arr);
        System.out.println("After:" + Arrays.toString(arr));
    }
    /** Result:
     Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
     Memory Usage: 37.9 MB, less than 95.80% of Java online submissions for Move Zeroes.
     **/
}
