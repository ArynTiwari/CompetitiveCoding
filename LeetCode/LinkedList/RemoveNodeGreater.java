package LeetCode.LinkedList;

public class RemoveNodeGreater {
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

    public ListNode removeNodes(ListNode head) {
        if (head == null)
            return null;
        head.next = removeNodes(head.next);
        return head.next != null && head.val < head.next.val ? head.next : head;
    }
}
