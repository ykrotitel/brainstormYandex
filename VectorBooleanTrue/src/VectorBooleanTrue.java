import java.util.Vector;

public class VectorBooleanTrue {
    public static void main(String[] args) {
        String S = "qwherg";
        Vector<Boolean> vector = new Vector<>();
        vector.add(false);
        vector.add(false);
        vector.add(true);
        vector.add(true);
        vector.add(true);
        vector.add(true);
        vector.add(true);
        vector.add(false);
        vector.add(true);
        vector.add(true);
        vector.add(true);
        int i = 0;
        int answer = 0;
        int j = 0;
        int tmp = 0;

        while (i < vector.size()) {
            j = 0;
            if (vector.get(i)) {
                j = i + 1;
                while (i < vector.size() && vector.get(i)) {
                    tmp++;
                    i++;
                }
                i = j;
            }
            if (answer < tmp)
                answer = tmp;
            tmp = 0;
            i++;
        }
        System.out.println(answer);
    }
}
