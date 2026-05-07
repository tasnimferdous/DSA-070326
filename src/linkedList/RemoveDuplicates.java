package linkedList;

import org.w3c.dom.Node;

public class RemoveDuplicates {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(2);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(4);
        list.display();
        list.deleteDuplicates();
        list.display();
    }
}
