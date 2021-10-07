package prak10;
public class Palindrom {
    private String stroka;
    static boolean isPalindromeRec(String str) {
        if (str.length() <= 1)  return true;

        if (str.charAt(0) != str.charAt(str.length() - 1))  return false;

        return isPalindromeRec(str.substring(1, str.length() - 1));
    }
}
