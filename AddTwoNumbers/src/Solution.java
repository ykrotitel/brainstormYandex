import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        ListNode tmp1;
        ListNode l1 = new ListNode(2, new ListNode());
        tmp1 = l1;

        l1.next = new ListNode(4, new ListNode());
        l1 = l1.next;
        l1.next = new ListNode(9, new ListNode());
        l1 = l1.next;
//        l1.next = new ListNode(9, new ListNode());
//        l1 = l1.next;
        l1.next = null;
        l1 = tmp1;

//        l1.next = new ListNode(9, new ListNode());
//        l1 = l1.next;
//        l1.next = new ListNode(9, new ListNode());
//        l1 = l1.next;
//        l1.next = new ListNode(9, new ListNode());
//        l1 = l1.next;
//        l1.next = new ListNode(9, new ListNode());
//        l1 = l1.next;
//        l1.next = new ListNode(9, new ListNode());
//        l1 = l1.next;
//        l1.next = new ListNode(9, new ListNode());
//        l1 = l1.next;
//        l1.next = new ListNode(9, new ListNode());
//        l1 = l1.next;
//        l1.next = new ListNode(9, new ListNode());
//        l1 = l1.next;
//        l1.next = new ListNode(9, new ListNode());
//        l1 = l1.next;
//        l1.next = null;
//        l1 = tmp1;



        ListNode tmp2;
        ListNode l2 = new ListNode(5, new ListNode());
        tmp2 = l2;

        l2.next = new ListNode(6, new ListNode());
        l2 = l2.next;
        l2.next = new ListNode(4, new ListNode());
        l2 = l2.next;
        l2.next = new ListNode(9, new ListNode());
        l2 = l2.next;
        l2.next = null;
        l2 = tmp2;

//        l2.next = null;
//        l2 = tmp2;




        ListNode ann = anotherSol(l1, l2);
        int a;
        a = 5;
    }

    public static ListNode anotherSol(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode();
        ListNode flag = answer;

        List<Integer> firstList = new ArrayList<Integer>();
        List<Integer> secondList = new ArrayList<Integer>();
        List<Integer> third = new ArrayList<Integer>();

        while (l1 != null) {
            firstList.add(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            secondList.add(l2.val);
            l2 = l2.next;
        }

        int i = 0;
        int f = 0;

        if (firstList.size() > secondList.size()) {
            f = firstList.size() - secondList.size();
            while (i++ < f)
                secondList.add(0);
        }

        else if (firstList.size() < secondList.size()) {
            f = secondList.size() - firstList.size();
            while (i++ < f)
                firstList.add(0);
        }

        f = 0;
        i = 0;
        while (i < firstList.size() || i < secondList.size()) {
            third.add((firstList.get(i) + secondList.get(i) + f) % 10);
            if ((firstList.get(i) + secondList.get(i) + f) >= 10)
                f = 1;
            else
                f = 0;
            i++;
        }
        if ((i == firstList.size() || i == secondList.size()) && f == 1)
            third.add(f);
        i = 0;
        while (i < third.size()) {
            answer.val = third.get(i);
            if (i + 1 == third.size())
                break;
            answer.next = new ListNode();
            answer = answer.next;
            answer.next = null;
            i++;
        }
        return flag;
    }

}

//TODO МОЕ РЕШЕНИЕ
//1. перекопирую оба листа в два массива
//2. Складываю два массива в столбик, записываю в третий массив
//3. Результат третьего массива перезаписываю в список


//TODO Идеальное решение
//1. Записывать результат сложения в столбик сразу же, в список и не использовать массив как промежуточный пункт
