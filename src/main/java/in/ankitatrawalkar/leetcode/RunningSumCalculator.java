package in.ankitatrawalkar.leetcode;

import java.util.Arrays;

/*
    1480. Running Sum of 1d Array
 */
public class RunningSumCalculator {

    public static void main(String[] args) {
        int[] nums = { 3, 1, 2, 10, 1 };
        System.out.println(Arrays.toString(RunningSumCalculator.runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }
}
