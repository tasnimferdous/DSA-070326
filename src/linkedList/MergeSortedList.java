package linkedList;

public class MergeSortedList {
    public static void main(String[] args) {
        SLL list1 = new SLL();
        list1.insertLast(1);
        list1.insertLast(3);
        list1.insertLast(5);
        list1.insertLast(7);
        list1.insertLast(9);

        SLL list2 = new SLL();
        list2.insertLast(1);
        list2.insertLast(4);
        list2.insertLast(6);
        list2.insertLast(8);
        list2.insertLast(10);

        SLL ans = new SLL();
        ans = ans.mergeSortedLists(list1, list2);
        ans.display();
    }
}
