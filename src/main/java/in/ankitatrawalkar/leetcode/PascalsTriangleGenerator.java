package in.ankitatrawalkar.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/*
    118. Pascal's Triangle
    119. Pascal's Triangle II
 */
public class PascalsTriangleGenerator {

    public static void main(String[] args) {
        int numRows = 1;
        PascalsTriangleGenerator.generate(numRows).forEach(PascalsTriangleGenerator::printer);
    }

    public static void printer(List<Integer> list) {
        System.out.print("[");
        StringJoiner joiner = new StringJoiner(",");
        for (Integer integer : list) {
            joiner.add(integer.toString());
        }
        System.out.print(joiner);
        System.out.print("]");
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows >= 1) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            result.add(row);
        }
        if (numRows >= 2) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            row.add(1);
            result.add(row);
        }
        for (int i = 2; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            for (int j = 1; j < i; j++) {
                currRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            currRow.add(1);
            result.add(currRow);
        }
        return result;
    }

    public static List<Integer> getNthRow(int rowIndex) {
        List<Integer> prevRow = new ArrayList<>();
        prevRow.add(1);
        if (rowIndex == 0) {
            return prevRow;
        }
        List<Integer> currRow = new ArrayList<>();
        currRow.add(1);
        currRow.add(1);
        if (rowIndex == 1) {
            return currRow;
        }
        for (int i = 2; i <= rowIndex; i++) {
            prevRow = currRow;
            currRow = new ArrayList<>();
            currRow.add(1);
            for (int j = 1; j < i; j++) {
                currRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            currRow.add(1);
        }
        return currRow;
    }
}

