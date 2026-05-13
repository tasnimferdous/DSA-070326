package linkedList;

public class Palindrome {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(head));
    }

    private static boolean isPalindrome(ListNode head) {
        ListNode mid = middle(head);
        ListNode revHead = reverse(mid);
        ListNode temp = revHead;
        while(head != null && revHead != null){
            if(head.val != revHead.val){
                reverse(temp);
                return false;
            }
            head = head.next;
            revHead = revHead.next;
        }
        reverse(temp);
        return true;
    }

    private static ListNode reverse(ListNode head) {
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

    private static ListNode middle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
