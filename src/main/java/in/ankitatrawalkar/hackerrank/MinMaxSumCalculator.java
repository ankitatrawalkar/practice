package in.ankitatrawalkar.hackerrank;

import java.util.List;

/*
    Mini-Max Sum
    https://www.hackerrank.com/challenges/mini-max-sum/problem
 */
public class MinMaxSumCalculator {

    public static void main(String[] args) {
        MinMaxSumCalculator.miniMaxSum(List.of(1, 3, 5, 7, 9));
    }

    public static void miniMaxSum(List<Integer> arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (Integer i: arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
            sum += i;
        }
        System.out.println((sum - max) + " " + (sum - min));
    }

}
