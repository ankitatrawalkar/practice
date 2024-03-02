package in.ankitatrawalkar.leetcode;

/*
    79. Word Search
 */
public class WordSearch {

    public static void main(String[] args) {
        char[][] board = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "SEE";
        System.out.println(WordSearch.exist(board, word));
    }

    public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        char[] wordChars = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            wordChars[i] = word.charAt(i);
        }
        int charMatched = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == wordChars[charMatched]) {
                    charMatched++;
                    int x = i;
                    int y = j;
                    while (x >= 0 && x < m && y >= 0 && y < n && charMatched < wordChars.length) {
                        if (x > 0 && board[x - 1][y] == wordChars[charMatched]) {
                            x--;
                            charMatched++;
                        } else if (x < m - 1 && board[x + 1][y] == wordChars[charMatched]) {
                            x++;
                            charMatched++;
                        } else if (y > 0 && board[x][y - 1] == wordChars[charMatched]) {
                            y--;
                            charMatched++;
                        } else if (y < n - 1 && board[x][y + 1] == wordChars[charMatched]) {
                            y++;
                            charMatched++;
                        } else {
                            break;
                        }
                    }
                    if (charMatched >= wordChars.length) {
                        return true;
                    }
                    charMatched = 0;
                }
            }
        }
        return false;
    }

}
