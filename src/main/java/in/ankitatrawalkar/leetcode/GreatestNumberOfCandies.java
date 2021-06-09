package in.ankitatrawalkar.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
    1431. Kids With the Greatest Number of Candies
 */
public class GreatestNumberOfCandies {

    public static void main(String[] args) {
        int[] candies = { 12, 1, 12 };
        int extraCandies = 10;
        GreatestNumberOfCandies.kidsWithCandies(candies, extraCandies).forEach(System.out::println);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        List<Boolean> result = new ArrayList<>();
        for (int noOfCandy: candies) {
            if (maxCandies < noOfCandy) {
                maxCandies = noOfCandy;
            }
        }

        for (int noOfCandy: candies) {
            if (noOfCandy + extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
