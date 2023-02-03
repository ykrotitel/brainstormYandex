public class IntToRoman {

    public static void main(String[] args) {
        int num = 10;
        System.out.println(intToRoman(num));

    }

    public static String intToRoman(int num) {
        String answer = "";
        int tmp = 0;

        if (num >= 1000) {
            tmp = num / 1000;
            while (tmp > 0) {
                answer += "M";
                num -= 1000;
                tmp--;
            }
        }

        if (num >= 900) {
            answer += "CM";
            num = num % 100;
        }
        else if (num >= 500) {
            answer += "D";
            num -= 500;
        }

        if (num >= 400) {
            answer += "CD";
            num = num % 100;
        }
        else if (num >= 100 && num < 400)
        {
            tmp = num / 100;
            while (tmp > 0) {
                answer += "C";
                num -= 100;
                tmp--;
            }
        }

        if (num >= 90) {
            answer += "XC";
            num = num % 10;
        }
        else if (num >= 50) {
            answer += "L";
            num -= 50;
        }

        if (num < 50 && num >= 40) {
            answer += "XL";
            num = num % 10;
        }

        if (num >= 10) {
            tmp = num / 10;
            while (tmp > 0) {
                answer += "X";
                num -= 10;
                tmp--;
            }
        }

        if (num < 10 && num >= 9) {
            answer += "IX";

            tmp = num / 10;
            while (tmp > 0) {
                answer += "X";
                num -= 10;
                tmp--;
            }
        }
        else if (num == 8)
            answer += "VIII";
        else if (num == 7)
            answer += "VII";
        else if (num == 6)
            answer += "VI";
        else if (num == 5)
            answer += "V";
        else if (num == 4)
            answer += "IV";
        else if (num == 3)
            answer += "III";
        else if (num == 2)
            answer += "II";
        else if (num == 1)
            answer += "I";

        return answer;
    }

}
