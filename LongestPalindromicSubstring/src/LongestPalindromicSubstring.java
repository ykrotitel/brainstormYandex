import java.util.*;

public class LongestPalindromicSubstring {
    //TODO как возможное решение - итерироваться c начала массива до его середины и записывать строку в tmp
    // дошли до середины, либо встретили символ, который уже был - начинаем проверку на палиндром
    // Если проверку не прошли, но еще не дошли до середины массива, это место как-то помечаем, чтобы в следующий раз
    // не начать тут проверку полиндрома, а пойти искать первую половину полиндрома далее
    // далее итерируемся от 0+1 до середины. Потом от 0+2 до середины и так далее. Повторяем эту картину,
    // но потом с середины до конца, с середины + 1 до конца и тд

    public static void main(String[] args) {
        String s = "abcabccbacbaa";
//        String s = "dccb";
        System.out.println(findPalindromic1(s));
    }

    public static String findPalindromic1(String s) {
        String answer = "";
        String buff = "";
        int size = 0;
        int tmp = 0;
        double iter = 0;
        int to = s.length() - 1;

        while (iter <= to) {
            if (iter % 1 == 0.5) {
                answer = evenIndex(s, iter, 0.5);
                tmp = answer.length() * 2;
            } else {
                answer = evenIndex(s, iter, 1);
                tmp = answer.length() * 2 - 1;
            }
            if (size < tmp) {
                size = tmp;
                if (size % 2 == 1) {
                    StringBuilder reverse = new StringBuilder(answer);
                    reverse.reverse();
                    reverse.deleteCharAt(reverse.length() - 1);
                    buff = reverse.toString() + answer;
                } else {
                    StringBuilder reverse = new StringBuilder(answer);
                    reverse.reverse();
                    buff = reverse.toString() + answer;
                }
            }
            iter += 0.5;
        }
        return buff;
    }

    public static String evenIndex(String source, double iter, double delta) {
        String buff = delta == 1 ? String.valueOf(source.charAt((int) iter)) : "";
        int left = (int) (iter - delta);
        int right = (int) (iter + delta);

        while (left >= 0 & right < source.length()) {
            if (source.charAt(left) == source.charAt(right)) {
                buff = buff + source.charAt(right);
                left--;
                right++;
            } else
                return buff;
        }
        return buff;
    }
}