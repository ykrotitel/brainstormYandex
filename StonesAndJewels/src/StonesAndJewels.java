import java.util.Vector;

public class StonesAndJewels {
    public static void main(String[] args) {
        String J = "abcdefghijk";
        String S = "qwherg";
        int i = 0;
        int answer = 0;

        while (i < S.length()) {
            int j = 0;
            int flag = 0;
            while (j < J.length()) {
                if (J.charAt(j) == S.charAt(i)) {
                    flag = 1;
                    break;
                }
                j++;
            }
            if (flag == 1) {
                answer++;
            }
            i++;
        }
        System.out.println(answer);
    }
}
