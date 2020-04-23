package arraylist_linkedlist;

public class MyLinkedListTest {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList("abc");
        myLinkedList.add(1, "xyz");

        myLinkedList.printList();
    }
}
