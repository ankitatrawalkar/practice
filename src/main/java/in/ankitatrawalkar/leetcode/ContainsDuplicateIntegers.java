package in.ankitatrawalkar.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
    217. Contains Duplicate
    219. Contains Duplicate II - Check for duplicate numbers in a window
 */
public class ContainsDuplicateIntegers {

    public static void main(String[] args) {
        int[] nums = { 1,2,3,1,2,3 };
        int windowLength = 2;
        System.out.println(ContainsDuplicateIntegers.containsDuplicate(nums));
        System.out.println(ContainsDuplicateIntegers.containsDuplicateInWindow(nums, windowLength));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!numSet.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicateInWindow(int[] nums, int windowLength) {
        Map<Integer, Integer> numLastSeenIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numLastSeenIndexMap.containsKey(nums[i])) {
                Integer lastSeenIndex = numLastSeenIndexMap.get(nums[i]);
                if (i - lastSeenIndex <= windowLength) {
                    return true;
                } else {
                    numLastSeenIndexMap.put(nums[i], i);
                }
            } else {
                numLastSeenIndexMap.put(nums[i], i);
            }
        }
        return false;
    }

}
