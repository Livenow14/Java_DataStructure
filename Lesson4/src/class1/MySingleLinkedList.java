package class1;

import java.util.LinkedList;

public class MySingleLinkedList<T> {

    public Node<T> head;
    public int size;
    public MySingleLinkedList(){
        head = null;
        size = 0 ;
    }

    public void addFirst(T item){
        Node<T> newNode = new Node<>(item);     //T : type parameter
        newNode.next=head;
        head = newNode;
        size++;

        //Node<T>[] arr = new Node<T>[100]; // not OK
        /*  T t = new T(); // not OK
            T [] array = new T[100];
*/
    }
    public void addAfter(Node<T> before, T item){
        Node<T> temp = new Node<>(item);
        temp.next= before.next;
        before.next=temp;
        size++;
    }

    public T removeFirst(){

        if(head==null)
            return null;
        else{
            Node<T> temp = head;
            head = head.next;
            size --;
            return temp.data;
        }
    }

    public T removeAfter(Node<T> before){
        if(before.next==null)
            return null;
        else{
            T temp = before.next.data;
            before.next=before.next.next;
            size--;
            return temp;
        }
    }
    public void add(int index, T item){     //insert
        if(index<0|| index>size){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(index==0){
            addFirst(item);
        }
        else{
            Node<T> node = getNode(index -1);
            addAfter(node,item);
        }
    }
    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        if (index==0)
            return removeFirst();
        Node<T> prev = getNode(index-1);
        return removeAfter(prev);
    }


    public T remove(T item){          //delete
        Node<T> p = head;
        Node<T> q = null;
        while(p!=null && !p.data.equals(item)) {
            q=p;
            p = p.next;
        }
        if(p==null)
            return null;
        if(q==null)
            return removeFirst();
        else
            return removeAfter(q);
    }
    public T get(int index){
        if(index<0|| index>=size)
            return null;
        return getNode(index).data;
    }

    public Node<T> getNode(int index){
        if(index<0|| index>=size)
            return null;
        Node<T> p = head;
        for(int i=0; i <index; i++){
            p=p.next;
        }
        return p;
    }
    public int indexOf(T item ){          //search
        Node<T> p = head;
        int index = 0;
        while(p!=null){
            if(p.data.equals(item))
                return index;
            p=p.next;
            index++;
        }
        return -1;
    }


        public static void main(String[] args) {
        MySingleLinkedList<String> list = new MySingleLinkedList<>();
       // LinkedList<Integer> mylist = new LinkedList<>();
        list.add(0, "Saturday");
        list.add(1, "Friday");
        list.add(0, "Mondya");
        list.add(2, "Tuesday");

        String str = list.get(2);
        list.remove(2);
        int pos = list.indexOf("Friday");

        for(int i=0; i<list.size; i++)
            System.out.println(list.get(i));
/*        mylist.add(1);
        mylist.add(0,2);
        mylist.add(3);
        mylist.add(0,4);
        System.out.println(mylist.get(0));
        System.out.println(mylist.get(1));
        System.out.println(mylist.get(2));
        System.out.println(mylist.get(3));*/
    }
}
