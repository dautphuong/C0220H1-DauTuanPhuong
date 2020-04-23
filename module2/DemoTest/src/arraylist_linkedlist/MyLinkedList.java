package arraylist_linkedlist;

public class MyLinkedList {

    private class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private  Node head;
    private  int size;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            // Nhay temp vao node tiep theo
            temp = temp.next;
        }
        holder = temp.next;

        // Tao node moi
        temp.next = new Node(data);

        Node newNode = temp.next;

        // Ket noi dia chi node moi = voi holder
        newNode.next = holder;
        size++;
    }

    public Node get(int index){
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
