package linkedList;

public class DetectCycle {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.createCycle(6,7);
        System.out.println(list.hasCycle(list));
    }
}
