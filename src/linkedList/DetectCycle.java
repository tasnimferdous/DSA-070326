package linkedList;

public class DetectCycle {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertLast(1);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(7);
        list.insertLast(8);
        list.createCycle(15,3);
        System.out.println(list.hasCycle(list));
        list.detectCycle(list);
    }
}
