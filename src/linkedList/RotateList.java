package linkedList;

public class RotateList {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        ListNode ans = rotateRight2(node, 3);
        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }

    static ListNode rotateRight(ListNode head, int k) {
        for(int i = 0; i < k; i++){
            ListNode temp  = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            ListNode newNode = temp.next;
            temp.next = null;
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    static ListNode rotateRight2(ListNode head, int k) {
        if(k == 0 || head == null || head.next == null) return head;
        ListNode temp  = head;
        int n = 1;
        while(temp.next != null){
            temp = temp.next;
            n++;
        }
        temp.next = head;
        temp = head;
        int rotation = k % n;
        int skip = n - rotation;
        for(int i = 1; i < skip; i++){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}
