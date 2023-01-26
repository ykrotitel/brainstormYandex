public class ReverseInteger {

    public static void main(String[] args) {
        int a = -2147483648;
        System.out.println(reverse(a));
    }

    public static int reverse(int x) {
        int flag = 1;
        int answer = 1;
        String s;
        StringBuilder sb;

        if (x == -2147483648)
            return 0;

        if (x < 0)
            flag = -1;

        if (x < 10 && x > -10)
            return x;

        if (x < 0)
            x = -x;

        while (x % 10 == 0)
            x = x / 10;

        s = Integer.toString(x);
        sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();
        if (Long.parseLong(s) > 2147483647)
            return 0;
        answer = Integer.parseInt(s);

        return answer * flag;
    }
}
