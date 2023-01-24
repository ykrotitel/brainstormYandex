import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String s = "pppppppp";

        int a = lengthOfLongestSubstring(s);
        System.out.println(a);
    }

    public static int lengthOfLongestSubstring(String s) {
        int answer = 0;
        int tmp = 0;
        Map<Character, Boolean> sol = new HashMap<>();

        int i = 0;
        int j;

        while (i < s.length()) {
            j = i;
            while (j < s.length()) {
                Character t = s.charAt(j);
                if (!(sol.containsKey(s.charAt(j)))) {
                    sol.put(s.charAt(j), true);
                    tmp++;
                }
                else
                    break;
                j++;
            }
            if (answer < tmp)
                answer = tmp;
                tmp = 0;
            sol.clear();
            i++;
        }

        return answer;
    }
}
