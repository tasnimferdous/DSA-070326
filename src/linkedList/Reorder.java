package linkedList;

public class Reorder {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next = new ListNode(6);
        reorderList(node);
    }

    static void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }

        ListNode first = head;
        ListNode second = reverse(middle(head));

        while (second != null && second.next != null) {
            ListNode temp = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            second.next = temp;
            second = temp2;
            first = temp;
        }

        while(head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
    }

    static ListNode middle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;

        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null) {
                next = next.next;
            }
        }
        return prev;
    }
}
