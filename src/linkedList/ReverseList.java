package linkedList;

public class ReverseList {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.display();
        list.reverse();
        list.display();

        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        ListNode ans = reverseBetween(node, 2, 4);
        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }

    static ListNode reverseBetween(ListNode head, int left, int right) {
        if(right-left == 0 || head == null){
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        for(int i = 1; i < left; i++){
            prev = curr;
            curr = curr.next;
        }
        ListNode temp = prev;
        ListNode temp2 = curr;
        ListNode next = curr.next;

        for(int i = left; i <= right; i++){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null){
                next = next.next;
            }
        }

        if(temp == null){
            head = prev;
        }else{
            temp.next = prev;
        }
        temp2.next = curr;
        return head;
    }
}
