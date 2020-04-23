package arraylist_linkedlist;

import java.util.ArrayList;
import java.util.List;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("abc");
        myList.add("xyz");

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        List<String> listStr = new ArrayList();
    }
}
