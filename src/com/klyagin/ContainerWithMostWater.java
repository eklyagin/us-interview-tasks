package com.klyagin;

//Task URL: https://leetcode.com/problems/container-with-most-water/

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        if (height == null || height.length < 2){
            throw new IllegalArgumentException("Bad input");
        }
        int result = 0;
        int left = 0;
        int right = height.length -1;

        while (left < right){
            result = Math.max(result, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]){
                left+=1;
            }else {
                right-=1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //Tests
        System.out.println(ContainerWithMostWater.maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
        System.out.println(ContainerWithMostWater.maxArea(new int[] {1,1}));
        System.out.println(ContainerWithMostWater.maxArea(new int[] {1,2    }));
        System.out.println(ContainerWithMostWater.maxArea(new int[] {1,2,1}));
        /** Result:
         Success
         Details
         Runtime: 2 ms, faster than 94.76% of Java online submissions for Container With Most Water.
         Memory Usage: 39.5 MB, less than 95.30% of Java online submissions for Container With Most Water.
         */
    }
}
