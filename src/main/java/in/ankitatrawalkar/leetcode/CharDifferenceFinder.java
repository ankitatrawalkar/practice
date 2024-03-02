package in.ankitatrawalkar.leetcode;

/*
    389. Find the Difference
 */
public class CharDifferenceFinder {

    public static void main(String[] args) {
        String shorterString = "";
        String longerString = "u";
        System.out.println(CharDifferenceFinder.findCharDifference(shorterString, longerString));
    }

    private static char findCharDifference(String shorterString, String longerString) {
        int result = 0;
        for (int i = 0; i < longerString.length(); i++) {
            result += longerString.charAt(i);
            if (i != longerString.length() - 1) {
                result -= shorterString.charAt(i);
            }
        }
        return (char) result;
    }

}
