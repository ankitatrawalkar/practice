package in.ankitatrawalkar.leetcode;

import java.util.Arrays;

/*
    977. Squares of a Sorted Array
 */
public class SquaresOfSortedArray {

    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };
        System.out.println(Arrays.toString(SquaresOfSortedArray.sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int[] squares = new int[nums.length];
        int counter = nums.length - 1;
        while (i <= j) {
            int leftSquare = nums[i] * nums[i];
            int rightSquare = nums[j] * nums[j];
            if (leftSquare > rightSquare) {
                squares[counter--] = leftSquare;
                i++;
            } else if (leftSquare < rightSquare) {
                squares[counter--] = rightSquare;
                j--;
            } else {
                if (i == j) {
                    squares[counter--] = leftSquare;
                } else {
                    squares[counter--] = leftSquare;
                    squares[counter--] = rightSquare;
                }
                i++;
                j--;
            }
        }
        return squares;
    }

}
