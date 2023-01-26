import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {
    public static void main(String[] args) {
        String s = "A";
        System.out.println(convert(s, 3));

    }

    public static String convert(String s, int numRows) {
        int tmp = (((s.length()/(numRows*2)) - 1 <= 0) ? 1 : ((s.length()/(numRows*2)) - 1) * numRows) + 1;
        char[][] massiv = new char[numRows][tmp];
        int pivot = 0;
        String answer = "";
        int reference;
        int i = 0;
        if (numRows >= s.length())
            return s;
        while (i < s.length()) {
            int j = 0;
            while (j < numRows && i < s.length()) {
                massiv[j][pivot] = s.charAt(i);
                i++;
                j++;
            }
            j -= 2;
            reference = j;
            pivot++;
            while (j > 0 && i < s.length()) {
                if (j == reference) {
                    massiv[j][pivot] = s.charAt(i);
                    i++;
                    pivot++;
                    reference--;
                }
                j--;
            }
        }
        i = 0;
        while (i < numRows) {
            int j = 0;
            while (j < tmp) {
              if (massiv[i][j] != 0)
                  answer = answer + massiv[i][j];
              j++;
            }
            i++;
        }
        return answer;
    }
}
