package linkedList;

public class MergeKSortedList {
    public static void main(String[] args) {
        SLL list1 = new SLL();
        list1.insertLast(-1);
        list1.insertLast(4);
        list1.insertLast(7);

        SLL list2 = new SLL();
        list2.insertLast(2);
        list2.insertLast(5);
        list2.insertLast(8);

        SLL list3 = new SLL();
        list3.insertLast(3);
        list3.insertLast(6);
        list3.insertLast(9);

        SLL[] lists = {list1, list2, list3};
        SLL ans = mergeKLists(lists);
        ans.display();
    }

    static SLL mergeKLists(SLL[] lists) {
        if (lists == null || lists.length == 0) return null;
        SLL mergedList = new SLL();
        for (SLL list : lists) {
            mergedList = mergedList.mergeSortedLists(mergedList, list);
        }
        return mergedList;
    }
}
