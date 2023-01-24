import java.util.HashMap;
import java.util.Map;

public class easySolution {

    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = 2;
        nums[1] = 7;
        nums[2] = 11;
        nums[3] = 5;
        int target = 9;
        int[] sol;

        sol = twoSum(nums, target);
    }
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> buff = new HashMap<Integer, Integer>();
        int[] answer = new int[2];

        for (Integer i = 0; i < nums.length; i++) {
            Integer diff = target - nums[i];
            if (buff.containsKey(diff)) {
                answer[0] = buff.get(diff);
                answer[1] = i;
                return answer;
            }
            else {
                buff.put(nums[i], i);
            }
        }
        return answer;
    }
}

// Solution
//  https://www.youtube.com/watch?v=luicuNOBTAI&t=286s
