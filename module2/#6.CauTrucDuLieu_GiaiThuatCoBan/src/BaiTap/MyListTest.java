package BaiTap;

class MyList<E>{
    int size=0;
    static final int DEFAULT_CAPACITY=10;
    Object elements[];
    public MyList(){}
    public MyList(int capacity){
        elements=new Object[capacity];
    }
    void add(int index,E element){
        size=elements.length+1;

    }
    E remote(int index){

    }
    int size(){
        return this.size=size;
    }
//    E clone(){
//
//    }
    boolean contains(E o){

    }
    int indexOf(E o){

    }
    boolean add(E e){

    }
    void ensureCapacity(int minCapacity){

    }
    E get(int i){

    }
    void clear(){

    }
}
public class MyListTest {

}
