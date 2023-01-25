import java.util.*;

public class LongestPalindromicSubstring {
    //TODO как возможное решение - итерироваться c начала массива до его середины и записывать строку в tmp
    // дошли до середины, либо встретили символ, который уже был - начинаем проверку на палиндром
    // Если проверку не прошли, но еще не дошли до середины массива, это место как-то помечаем, чтобы в следующий раз
    // не начать тут проверку полиндрома, а пойти искать первую половину полиндрома далее
    // далее итерируемся от 0+1 до середины. Потом от 0+2 до середины и так далее. Повторяем эту картину,
    // но потом с середины до конца, с середины + 1 до конца и тд

    public static void main(String[] args) {
        String s = "abcabccbacbaa";
        System.out.println(findPalindromic(s));
    }


    public static String findPalindromic(String source) {
        String answer = null;
        int sizePalindromic = 0;
        int tmp = 0;

        List<Integer> helper = Arrays.asList(new Integer[source.length()]);
        int i = 0;
        while (i < helper.size()) { //запонили вспомогательный лист нулями, чтобы в случае ложной проверки на палиндром отметить этот индекс в массиве
            helper.set(i, 0);       //и не попасться туда еще раз, а пройти его мимо
            i++;
        }

        int from = 0;
        int to = (source.length() % 2 == 0 ? (source.length() / 2) + 1 : (source.length() / 2) + 2);

        while (from < to) {
            tmp = checkPalindromic(source, helper, from, to).length();
            if (tmp > sizePalindromic)
                sizePalindromic = tmp;
            tmp = 0;
            from++;
        }

        return answer;
    }

    public static String checkPalindromic(String source,List<Integer> helper, int lIndex, int rIndex) {
        int flag = 0;
        String buff = "" + source.charAt(lIndex);
        int tmp = lIndex;

        while(tmp != rIndex) {
            while(tmp != rIndex) {
                if (buff.charAt(tmp) != source.charAt(tmp + 1) && (helper.get(tmp + 1) == 0)) { // проверили следующий элемент в source
                    buff = buff + source.charAt(tmp + 1);                                       //если он не равен текущему в буфере и на этом месте мы еще не были
                }                                                                               //по хэлперу - записываем в палиндром и пока проверять вторую половину рано
                tmp++;
            }
            rmp = lIndex;
        }

        while (lIndex < rIndex) { //нужно добавить вложенность, чтобы проверить наличие первой половины палиндрома от начаала и до rIndex
            if (source.charAt(lIndex + 1) == buff.charAt(lIndex)) {
                //Возможно, нашли середину палиндрома
                if (checkSecondPiecePalindromic(source, buff, lIndex + 1, helper)) {
                    return buff;
                }
            }
            lIndex++;
        }
        return buff;
    }

    public static boolean checkSecondPiecePalindromic(String source, String buff, int index, List<Integer> helper) {
        int i = buff.length();
        int flag = index;

        while (i >= 0) {
            if (buff.charAt(i) == source.charAt(index) && (i == buff.length() && helper.get(flag) == 0)) { //второе условие на проверку вспомогательного массива
                                                                                                            // это условие нужно проверять в предыдущем методе
                i--;
                index++;
            }
            else if (i == 0) {
                helper.set(flag, 1);
                return false;
            }
        }
        return true;
    }
}


//      abcbcba