package LeetCode_Question_1480;

import java.util.Arrays;

class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}

public class RunningSumof1dArray {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(Arrays.toString(s.runningSum(new int[]{1, 2, 3, 4})));      // expected [1, 3, 6, 10]
        System.out.println(Arrays.toString(s.runningSum(new int[]{1, 1, 1, 1, 1})));   // expected [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(s.runningSum(new int[]{3, 1, 2, 10, 1})));  // expected [3, 4, 6, 16, 17]
    }
}