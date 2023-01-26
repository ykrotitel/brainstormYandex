import java.util.Arrays;

public class PalindromicInteger {
    public static void main(String[] args) {
        int a = 21;
        System.out.println(isPalindrome(a));
    }

    public static boolean isPalindrome(int x) {
        int i = 0;
        String s = String.valueOf(x);
        int j = s.length() - 1;

        if (x == 0)
            return true;
        if (x < 0)
            return false;
        if (s.length() % 2 == 0) {
            while (i < j) {
                if (s.charAt(i) != s.charAt(j))
                    return false;
                i++;
                j--;
            }
        }
        else {
            while (i != j) {
                if (s.charAt(i) != s.charAt(j))
                    return false;
                i++;
                j--;
            }
        }
        return true;
    }
}
