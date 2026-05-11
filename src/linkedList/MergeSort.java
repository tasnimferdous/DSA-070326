package linkedList;

public class MergeSort {
    public static void main(String[] args) {
        ListNode head = new ListNode(6);
        head.next = new ListNode(2);
        head.next.next = new ListNode(5);
        ListNode ans = mergeSort(head);

        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }

    static ListNode mergeSort(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = findMidNode(head);
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(mid);
        return merge(left, right);
    }

    static ListNode findMidNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        assert prev != null;
        prev.next = null;
        return slow;
    }

    static ListNode merge(ListNode node1, ListNode node2) {
        ListNode ans = new ListNode();
        ListNode temp = ans;
        while(node1 != null && node2 != null){
            if(node1.val < node2.val){
                temp.next = node1;
                temp = temp.next;
                node1 = node1.next;
            }else{
                temp.next = node2;
                temp = temp.next;
                node2 = node2.next;
            }
        }
        temp.next = (node1 == null) ? node2: node1;
        return ans.next;
    }
}
