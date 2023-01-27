public class WaterContainer {
    public static void main(String[] args) {
        int[] a = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] b = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] c = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] d = new int[]{};
        int[] e = new int[]{10};
        System.out.println(maxAreaFastest(b));
    }

    public static int maxAreaFastest(int[] height) { //ставим два указателя, на начало и на конец массива.
        int i = 0;                                  //тот, который стоит на наименьшем элементе - двигаем к центру
        int j = height.length - 1;                  //если элементы встретились - выходим из цикла
        int min = 0;
        int current = 0;
        int max = 0;

        while (i < height.length && j >= 0 && i != j) {
            min = Math.min(height[i], height[j]);
            current = min * (j - i);
            if (max < current)
                max = current;

            if (min == height[i])
                i++;
            else
                j--;
        }
        return max;
    }

    public static int maxArea(int[] height) { //здесь сравниваем каждый с каждым, сложность O(n*n);
        int i = 0;
        int j = 0;
        int min = 0;
        int current = 0;
        int max = 0;

        while (i < height.length) {
            j = i + 1;
            current = 0;
            while (j < height.length) {
                min = Math.min(height[i], height[j]);
                current = min * (j - i);
                if (current == Integer.MAX_VALUE)
                    return current;
                if (max < current)
                    max = current;
                j++;
            }
            i++;
        }
        return max;
    }
}
