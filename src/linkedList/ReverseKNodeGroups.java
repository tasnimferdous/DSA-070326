package linkedList;

public class ReverseKNodeGroups {
    public static void main(String[] args) {

        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);

        int k = 3;
        ListNode ans = reverseKGroup(node, k);
        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }

    static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) return head;

        ListNode temp = head;
        for(int i = 0; i < k; i++) {
            if(temp == null) return head;
            temp = temp.next;
        }

        ListNode prev = null;
        ListNode curr = head;
        for(int i = 0; i < k; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = reverseKGroup(curr, k);

        return prev;
    }
}
