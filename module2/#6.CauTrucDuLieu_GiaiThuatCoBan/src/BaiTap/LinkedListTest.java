package BaiTap;

class MyLinkedList<E> {
    //Phần tử đầu tiên của danh sách liên kết
    private Node head;
    //số lượng phần tử trong danh sách
    private int numNodes = 0;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }


    public void add(int index, E e) {

        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            //nhay temp vao node tiep theo
            temp = temp.next;
        }
        //holder tham chiếu temp.next
        holder = temp.next;
        //node vị trí index-1 trỏ đến node mới
        temp.next = new Node(e);
        //node mới trỏ đến holder
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E e) {
        //khai báo temp nhận giá trị head
        Node temp = head;
        //giá trị head nhận giá trí node mới
        head = new Node(e);
        //địa chỉ được trỏ đến giá trị temp
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public boolean remove(E e) {
        if (head.data.equals(e)) {
            remove(0);
            return true;
        } else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data.equals(e)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
            }
        }
        return false;
    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        Node temp = head;
        Object data;
        //nếu index=0 trả data hiện tại
        if (index == 0) {
            data = temp.data;
            head = head.next;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
        return (E) data;
    }
    public MyLinkedList<E>clone(){
        if(numNodes==0){
            throw new NullPointerException("LinkedList null");
        }
        MyLinkedList<E>returnLinkedList=new MyLinkedList<>();
        Node temp=head;
        returnLinkedList.addFirst((E)temp);
        temp=temp.next;
        while (temp!=null){
            returnLinkedList.addLast((E)temp.data);
            temp=temp.next;
        }
        return returnLinkedList;
    }
    public boolean constrains(E e){
        Node temp=head;
        while (temp.next!=null){
            if(temp.data.equals(e)){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public int indexOf(E e){
        Node temp =head;
        for(int i=0;i<numNodes;i++){
            if(temp.getData().equals(e)){
                return 1;
            }
        }
        return -1;
    }
}

public class LinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList();
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4, 9);
        ll.add(4, 8);
        ll.printList();
        ll.remove(2);
        System.out.println("sau remove");
        ll.printList();
    }
}
