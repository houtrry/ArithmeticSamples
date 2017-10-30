import com.sun.istack.internal.NotNull;

/**
 * @author: houtrry
 * @time: 2017/10/30
 * @desc: https://leetcode.com/problems/add-two-numbers/description/
 */
public class AddTwoNumbers {

    public static void main(String... args) {
        ListNode l13 = new ListNode(3);
        ListNode l12 = new ListNode(4);
        l12.next = l13;
        ListNode l11 = new ListNode(2);
        l11.next = l12;

        ListNode l23 = new ListNode(4);
        ListNode l22 = new ListNode(6);
        l22.next = l23;
        ListNode l21 = new ListNode(5);
        l21.next = l22;

        ListNode listNode = addTwoNumbers(l11, l21);

        System.out.println("listNode: " + listNode);


    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
//        addTwoNumbers(l1, l2, listNode);

        ListNode next = null;
        int val1, val2, val3, flag = 0;

        while (l1 != null || l2 != null) {
            val1 = l1 == null? 0: l1.val;
            val2 = l2 == null? 0: l2.val;

            val3 = val1 + val2 + flag;

            if (val3 == 10) {
                flag = 1;
                val3 = 0;
            }
            listNode.val = val3;

            

        }










        return listNode;
    }

    public static void addTwoNumbers(ListNode l1, ListNode l2, @NotNull ListNode resultNode) {
        if (l1 == null && l2 == null) {
            resultNode = null;
            throw new IllegalArgumentException("two arguments is null");
        }
        ListNode next = new ListNode(0);
        int val1 = l1 == null ? 0 : l1.val;
        int val2 = l2 == null ? 0 : l2.val;

        int val3 = val1 + val2 + resultNode.val;

        if (val3 == 10) {
            next.val = 1;
            val3 = 0;
        }
        resultNode.val = val3;
        ListNode next1 = l1 == null ? null : l1.next;
        ListNode next2 = l2 == null ? null : l2.next;
        if (!(next1 == null && next2 == null)) {
            resultNode.next = next;
            addTwoNumbers(next1, next2, next);
        }

    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
