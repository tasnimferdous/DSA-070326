package linkedList;

public class SLL {
    private Node head;
    private Node tail;
    private int size;

    public SLL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }


    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = head.next;

        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null) {
                next = next.next;
            }
        }
        head = prev;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    void deleteDuplicates() {
        Node node = head;
        while (node != null && node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
            }else{
                node = node.next;
            }
        }
    }

    public SLL mergeSortedLists(SLL first, SLL second) {
        Node temp1 = first.head;
        Node temp2 = second.head;

        SLL ans = new SLL();

        while (temp1 != null && temp2 != null) {
            if (temp1.value < temp2.value) {
                ans.insertLast(temp1.value);
                temp1 = temp1.next;
            } else {
                ans.insertLast(temp2.value);
                temp2 = temp2.next;
            }
        }

        while (temp1 != null) {
            ans.insertLast(temp1.value);
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            ans.insertLast(temp2.value);
            temp2 = temp2.next;
        }

        return ans;
    }

    public void createCycle(int val, int pos) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        Node temp = head;
        int i = 1;
        while(i != pos && temp!= null){
            i++;
            temp = temp.next;
        }
        tail.next = temp;
        size++;
    }

    public boolean hasCycle(SLL list){
        Node fast = list.head;
        Node slow = list.head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;
        }
        return false;
    }

    public void detectCycle(SLL list){
        Node fast = list.head;
        Node slow = list.head;
        Node f = list.head;
        Node s = list.head;
        int length = 0;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                do{
                    slow = slow.next;
                    length++;
                }while(slow != fast);
                System.out.println();
                break;
            }
        }

        if(length == 0){
            System.out.println("No Cycle");
            return;
        }
        while(length > 0){
            f = f.next;
            length--;
        }

        while (f != s){
            f = f.next;
            s = s.next;
        }
        System.out.println("Cycle at " + f.value);
    }

    public void middle(){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        assert slow != null;
        System.out.println("Middle is " + slow.value);
    }
}
