public class RomanToInt {
    public static void main(String[] args) {

        String s = "MMM";

        System.out.println(romanToInt(s));

    }

    public static int romanToInt(String s) {
        int answer = 0;
        int i = 0;

        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) == 'M') {
                answer += 1000;
                i++;
            }

            if (i < s.length() && s.charAt(i) == 'D') {
                answer += 500;
                i++;
            }

            if (i + 1 < s.length() && s.charAt(i + 1) == 'M') {
                answer += 900;
                i += 2;
            }
            if (i + 1 < s.length() && s.charAt(i + 1) == 'D') {
                answer += 400;
                i += 2;
            }
            while (i < s.length() && s.charAt(i) == 'C') {
                answer += 100;
                i++;
            }


            if (i < s.length() && s.charAt(i) == 'L') {
                answer += 50;
                i++;
            }
            if (i + 1 < s.length() && s.charAt(i + 1) == 'C') {
                answer += 90;
                i += 2;
            }
            if (i + 1 < s.length() && s.charAt(i + 1) == 'L') {
                answer += 40;
                i += 2;
            }
            while (i < s.length() && s.charAt(i) == 'X') {
                answer += 10;
                i++;
            }

            if (i < s.length() && s.charAt(i) == 'V') {
                answer += 5;
                i++;
            }
            if (i + 1 < s.length() && s.charAt(i + 1) == 'X') {
                answer += 9;
                i += 2;
            }
            if (i + 1 < s.length() && s.charAt(i + 1) == 'V') {
                answer += 4;
                i += 2;
            }
            while (i < s.length() && s.charAt(i) == 'I') {
                answer += 1;
                i++;
            }
        }
        return answer;
    }
}
