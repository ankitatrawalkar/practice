package in.ankitatrawalkar.leetcode;

import java.util.HashSet;
import java.util.Set;

/*
    36. Valid Sudoku
 */
public class SudokuValidator {

    public static void main(String[] args) {
        char[][] board = new char[][]{  {'.','.','4','.','.','.','6','3','.'},
                                        {'.','.','.','.','.','.','.','.','.'},
                                        {'5','.','.','.','.','.','.','9','.'},
                                        {'.','.','.','5','6','.','.','.','.'},
                                        {'4','.','3','.','.','.','.','.','1'},
                                        {'.','.','.','7','.','.','.','.','.'},
                                        {'.','.','.','5','.','.','.','.','.'},
                                        {'.','.','.','.','.','.','.','.','.'},
                                        {'.','.','.','.','.','.','.','.','.'}};
        System.out.println(SudokuValidator.isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (!isElementValid(board, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isElementValid(char[][] board, int i, int j) {
        char element = board[i][j];
        if (isBlank(element)) {
            return true;
        }
        // check row validity
        Set<Character> set = new HashSet<>();
        for (int columnNum = 0; columnNum < 9; columnNum++) {
            char columnElement = board[i][columnNum];
            if (!isBlank(columnElement)) {
                boolean added = set.add(columnElement);
                if (!added) {
                    return false;
                }
            }
        }

        // check column validity
        set.clear();
        for (int rowNum = 0; rowNum < 9; rowNum++) {
            char rowElement = board[rowNum][j];
            if (!isBlank(rowElement)) {
                boolean added = set.add(rowElement);
                if (!added) {
                    return false;
                }
            }
        }

        // validate square
        int squareRowStart = (i / 3) * 3;
        int squareColumnStart = (j / 3) * 3;
        set.clear();
        for (int i1 = 0; i1 < 3; i1++) {
            for (int j1 = 0; j1 < 3; j1++) {
                char squareElement = board[squareRowStart + i1][squareColumnStart + j1];
                if (!isBlank(squareElement)) {
                    boolean added = set.add(squareElement);
                    if (!added) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    private static boolean isBlank(char element) {
        return element == '.';
    }

}