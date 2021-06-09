package in.ankitatrawalkar.leetcode;

/*
    520. Detect Capital
 */
public class CapitalDetector {

    public static void main(String[] args) {
        String word = "FlaG";
        System.out.println(CapitalDetector.detectCapitalUse(word));
    }

    public static boolean detectCapitalUse(String word) {
        boolean isCapitalUse = true;
        boolean firstCapital = false;
        boolean secondCapital = false;
        if (isUppercase(word.charAt(0))) {
            // first letter is capital
            firstCapital = true;
        }
        if (word.length() > 1 && isUppercase(word.charAt(1))) {
            // second letter is capital
            secondCapital = true;
        }
        if (!firstCapital && secondCapital) {
            return false;
        }
        boolean shouldAllBeCapital = firstCapital && secondCapital;
        for (int i = 2; i < word.length(); i++) {
            char test = word.charAt(i);
            if (shouldAllBeCapital && !isUppercase(test)) {
                isCapitalUse = false;
                break;
            } else if (!shouldAllBeCapital && !isLowercase(test)) {
                isCapitalUse = false;
                break;
            }
        }
        return isCapitalUse;
    }

    public static boolean isUppercase(char a) {
        return a >= 65 && a <= 90;
    }

    public static boolean isLowercase(char a) {
        return a >= 97 && a <= 122;
    }
}
