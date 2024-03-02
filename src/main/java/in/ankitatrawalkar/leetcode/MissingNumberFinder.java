package in.ankitatrawalkar.leetcode;

/*
    268. Missing Number
 */
public class MissingNumberFinder {

    public static void main(String[] args) {
        int[] nums = { 9,6,4,2,3,5,7,0,1 };
        System.out.println(MissingNumberFinder.findMissingNumber(nums));
    }

    public static int findMissingNumber(int[] nums) {
        // initialise to sum of all distinct numbers
        int remainingSum = nums.length * (nums.length + 1) / 2;
        for (int i = 0; i < nums.length; i++) {
            // subtract current num from remainingSum to finally arrive at missing number
            remainingSum -= nums[i];
        }
        return remainingSum;
    }

}
