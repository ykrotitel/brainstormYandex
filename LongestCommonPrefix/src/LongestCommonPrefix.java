import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {

    }

    public static String longestCommonPrefix(String[] strs) {
        String answer = "";
        String pivot = strs[0];
        String prefix = "";
        int sizePrefix = 0;
        int prefixIndex = 0;
        int i = 0;

        while (i < pivot.length()) {
            prefixIndex++;
            sizePrefix = prefixIndex;
            prefix = givenPivotPrefix(pivot, i, prefixIndex);



        }


        return answer;
    }

//    public static String givenPivotPrefix(String source, int i, int size) {
//
//    }
}
