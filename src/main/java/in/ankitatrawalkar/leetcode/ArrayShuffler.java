package in.ankitatrawalkar.leetcode;

import java.util.Arrays;

/*
    1470. Shuffle the Array
 */
public class ArrayShuffler {

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2 };
        int n = 2;
        System.out.println(Arrays.toString(ArrayShuffler.shuffle(nums, n)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            result[i * 2] = nums[i];
            result[i * 2 + 1] = nums[n + i];
        }
        return result;
    }
}
