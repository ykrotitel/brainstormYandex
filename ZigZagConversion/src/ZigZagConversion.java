import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {
    public static void main(String[] args) {


    }
        public static String convert(String source, int numRows) {
            List<List <Character>> double_massiv = new ArrayList<>();
            List<Character> tmp = new ArrayList<>();

            int i = 0;
            while (i < numRows) {
                double_massiv.add(tmp);
                i++;
            }

            i = 0;
            while (i < source.length()) {
                int j = 0;
                while (j < numRows) {
                    double_massiv.get(j).add(source.charAt(i)); //опустились вниз и записали часть лова
                    i++;
                    j++;
                }
                j--;
            }
            double_massiv.add(tmp);

    }
}
