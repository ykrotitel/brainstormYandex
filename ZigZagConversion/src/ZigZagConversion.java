import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {
    public static void main(String[] args) {


    }
        public static String convert(String source, int numRows) {
            List<List <Integer>> double_massiv = new ArrayList<>();
            List<Integer> tmp = new ArrayList<>();

            int i = 0;
            while (i < numRows) {
                double_massiv.add(tmp);
                i++;
            }

            double_massiv.add(tmp);

    }
}
