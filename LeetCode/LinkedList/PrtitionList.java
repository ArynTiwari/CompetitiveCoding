package LeetCode.LinkedList;

public class PrtitionList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void partition(ListNode head, int x) {
        ListNode curr = head;
        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);
        ListNode smP = small, lgP = large;
        while (curr != null) {
            if (curr.val < x) {
                smP.next = curr;
                smP = smP.next;
            } else {
                lgP.next = curr;
                lgP = lgP.next;
            }
            curr = curr.next;
        }
        smP.next = large.next;
        lgP.next = null;
        while (small != null) {
            System.out.print(small.val + " ");
            small = small.next;
        }

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode first = new ListNode(1);
        head.next = first;
        first.next = null;
        partition(head, 2);

    }
}
