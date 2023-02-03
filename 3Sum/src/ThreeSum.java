import javax.management.ObjectName;
import java.util.*;
import java.util.stream.Collectors;

public class ThreeSum {
    public static void main(String[] args) {
        int[] a = new int[]{0,0,0};
        threeSum(a);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List <Integer>> answer = new ArrayList<>();
        List<Set <Integer>> buff = new ArrayList<>();
        List<Set <Integer>> tmp = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < nums.length - 2) {
            tmp = findThreeSum(nums, i);
            j = 0;
            if (tmp.size() > 0)
                while (j < tmp.size()) {
                    buff.add(tmp.get(j));
                    j++;
                }
            i++;
        }

        i = 0;
        while (i < buff.size() - 1) {
            j = i + 1;
            while (j < buff.size()) {
                if (Objects.equals(buff.get(i), buff.get(j))) {
                    buff.remove(j);
                }
                j++;
            }
            i++;
        }

        i = 0;
        while (i < buff.size()) {
            answer.add(new ArrayList<>(buff.get(i)));
            if (answer.get(i).size() == 2) {
                int a = answer.get(i).get(0);
                int b = answer.get(i).get(1);
                int c = -(a + b);
                answer.get(i).add(c);
            }
            else if (answer.get(i).size() == 1 && answer.get(i).get(0) == 0) {
                answer.get(i).add(0);
                answer.get(i).add(0);
            }
            i++;
        }
        return answer;
    }

    public static List<Set <Integer>> findThreeSum(int[] nums, int index) {
        int pivot = nums[index];
        List<Integer> buff = new ArrayList<>(3);
        List<Set <Integer>> answer = new ArrayList<Set<Integer>>();
        int i = index + 1;
        int j = index + 2;

        int second = nums[i];
        int third = nums[j];

        while (i <= nums.length - 2) {
            while (j <= nums.length - 1) {
            third = nums[j];
                if (pivot + second + third == 0) {
                    buff.add(pivot);
                    buff.add(second);
                    buff.add(third);
                    answer.add(Set.copyOf(buff));
                    buff.clear();
                }
                j++;
            }
            i++;
            j = i + 1;
            second = nums[i];
        }
        return answer;
    }
}

// 1, 0, -1, 0, 2, -2, 3, -3