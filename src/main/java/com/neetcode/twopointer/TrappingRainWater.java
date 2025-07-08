package com.neetcode.twopointer;

class TrappingRainWater {
    public int trap(int[] height) {
        int size = height.length;

        if (size == 0)
            return 0;

        int maxArea = 0;
        int leftWall = 0;
        int rightWall = 0;

        int left = 0;
        int right = size - 1;

        while (left < right) {
            leftWall = Math.max(leftWall, height[left]);
            rightWall = Math.max(rightWall, height[right]);

            if (leftWall < rightWall) {
                maxArea += leftWall - height[left];
                left++;
            } else if (leftWall > rightWall) {
                maxArea += rightWall - height[right];
                right--;
            } else {
                maxArea += leftWall - height[left];
                left++;
            }

        }

        return maxArea;
    }
}
