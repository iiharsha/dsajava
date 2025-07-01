package com.neetcode.twopointer;

class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int size = height.length;
        int left = 0;
        int right = size - 1;

        while (left < right) {
            int barLeft = height[left];
            int barRight = height[right];

            int length = Math.min(barLeft, barRight);
            int width = right - left;
            int area = length * width;

            maxArea = Math.max(maxArea, area);

            if (barLeft < barRight) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
