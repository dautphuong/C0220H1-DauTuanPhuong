package BaiTap;

import java.util.Arrays;

class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }
    //them phan tu vao vi tri index
    void add(int index, E element) {
        if (index > elements.length) {
            throw new IllegalArgumentException("Index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }
    //xoa phan tu vi tri index
    E remote(int index) {
        if(index<0||index>elements.length){
            throw new IllegalArgumentException("Error index: "+index);
        }
        E element=(E)elements[index];
        for(int i=index;i<size-1;i++){
            elements[i]=elements[i+1];
        }
        elements[size-1]=null;
        size--;
        return element;
    }

    int size() {
        return this.size;
    }

    //tao mang con
    public MyList<E> clone() {
        MyList<E> v = new MyList<>();
        v.elements = Arrays.copyOf(this.elements, this.size);
        v.size = this.size;
        return v;
    }

    //kiem tra phan tu co trong mang khong
    boolean contains(E o) {
        return this.indexOf(o) >= 0;
    }

    int indexOf(E o) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements.equals(o)) {
                return i;
            }
        }
        return index;
    }

    //them phan tu cuoi mang
    boolean add(E e) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size++] = e;
        return true;
    }

    //them size
    void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    E get(int i) {
        return (E) elements[i];
    }

    private void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }
}

public class MyListTest {
    public static class ListStudent{
        int id;
        String name;
        public ListStudent(){}
        public ListStudent(int id,String name){
            this.id=id;
            this.name=name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        ListStudent a=new ListStudent(1,"nameA");
        ListStudent b=new ListStudent(2,"nameB");
        ListStudent c=new ListStudent(3,"nameC");
        ListStudent d=new ListStudent(4,"nameD");
        MyList<ListStudent> List=new MyList<>();
        MyList<ListStudent> newMyList=new MyList<>();
        List.add(a);
        List.add(b);
        List.add(c);
        for(int i=0;i<List.size();i++){
            ListStudent student=(ListStudent)List.elements[i];
            System.out.println("id: "+student.getId()+",name: "+student.getName());
        }
        System.out.println("--------------------------");
        List.add(2,d);
        System.out.println(List.size());
        System.out.println("--------------------------");
        System.out.println(List.contains(a));
        System.out.println("--------------------------");
        newMyList=List.clone();
        for(int i=0;i<List.size();i++){
            ListStudent student=(ListStudent)newMyList.elements[i];
            System.out.println("id: "+student.getId()+",name: "+student.getName());
        }
    }
}
