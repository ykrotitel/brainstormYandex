import java.util.*;

public class Solution {
    public static void main(String[] args) {
//        List<Integer> nums = Arrays.asList(5, 7, 11, 15, 16, 4);
        int[] nums = new int[6];
        nums[0] = 5;
        nums[1] = 7;
        nums[2] = 11;
        nums[3] = 15;
        nums[4] = 16;
        nums[5] = 4;
        int target = 26;


        int answer;
        List<Integer> first = new ArrayList<Integer>();
        List<Integer> second = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++)
            for (int j = i+1; j < nums.length; j++) {
                answer = nums[i] + nums[j];
                if (answer == target) {
                    first.add(i);
                    second.add(j);
                }
            }
        int[] solution = new int[first.size() + second.size()];
        for (int i = 0; i < first.size(); i++) {
            solution[i] = first.get(i);
            solution[i+1] = second.get(i);
        }
    }
}
