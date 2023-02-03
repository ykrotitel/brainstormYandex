import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

public class PhoneNumberCombination {
    public static void main(String[] args) {
        String digits = "2345";
        letterCombination(digits);
    }

    public static List<String> letterCombination(String digits) {
        List<String> answer = new ArrayList<>();
        int flag1 = 0;
        int flag2 = 0;
        int flag3 = 0;
        int flag4 = 0;
        if (digits.length() == 0)
            return new ArrayList<>();

//        else if (digits.length() == 1) {
//            if (digits.charAt(0) == '2' && answer.add("a") && answer.add("b") && answer.add("c"))
//                return answer;
//            else if (digits.charAt(0) == '3' && answer.add("d") && answer.add("e") && answer.add("f"))
//                return answer;
//            else if (digits.charAt(0) == '4' && answer.add("d") && answer.add("e") && answer.add("f"))
//                return answer;
//            else if (digits.charAt(0) == '5' && answer.add("d") && answer.add("e") && answer.add("f"))
//                return answer;
//            else if (digits.charAt(0) == '6' && answer.add("d") && answer.add("e") && answer.add("f"))
//                return answer;
//            else if (digits.charAt(0) == '7' && answer.add("d") && answer.add("e") && answer.add("f"))
//                return answer;
//            else if (digits.charAt(0) == '8' && answer.add("d") && answer.add("e") && answer.add("f"))
//                return answer;
//            else if (digits.charAt(0) == '9' && answer.add("d") && answer.add("e") && answer.add("f"))
//                return answer;
//        }

        double length = Math.pow((double)digits.length(), (double)digits.length());

        while (length > 0) {
            int size = 0;
            String buff = "";
            flag2 = (flag1 == 0 ? 0 : flag2 + 1);
            flag3 = (flag2 == (size-1) ? flag3 + 1 : 0);
            flag4 = (flag3 == (size-1) ? flag4 + 1 : 0);
            flag1 = 0;
            while (flag1 < digits.length())
            {
                size = 0;
                while (size < digits.length()) {
                    int tmp_flag;
                    if (size == 0)
                        tmp_flag = flag1;
                    else if (size == 1)
                        tmp_flag = flag2;
                    else
                        tmp_flag = (size == 2 ? flag3 : flag4);
                    buff += returnCharacter(digits.charAt(size), tmp_flag);
                    size++;
                }
                flag1++;
                answer.add(buff);
                buff = "";
            }
            length--;
        }
        return answer;
    }

    public static char returnCharacter(char button, int position) {
        if (button == '2'){
            if (position == 0)
                return 'a';
            return position == 1 ? 'b' : 'c';

        } else if (button == '3') {
            if (position == 0)
                return 'd';
            return position == 1 ? 'e' : 'f';

        } else if (button == '4') {
            if (position == 0)
                return 'g';
            return position == 1 ? 'h' : 'i';

        } else if (button == '5') {
            if (position == 0)
                return 'j';
            return position == 1 ? 'k' : 'l';

        } else if (button == '6') {
            if (position == 0)
                return 'm';
            return position == 1 ? 'n' : 'o';

        } else if (button == '7') {
            if (position == 0)
                return 'p';
            if (position == 1)
                return 'q';
            return position == 2 ? 'r' : 's';

        } else if (button == '8') {
            if (position == 0)
                return 't';
            return position == 1 ? 'u' : 'v';

        } else if (button == '9') {
            if (position == 0)
                return 'w';
            if (position == 1)
                return 'x';
            return position == 2 ? 'y' : 'z';
        }
        return '1';
    }
}
