package class4;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class KWLinkedList<E> {

    private Node<E> head = null;
    private Node<E> tail = null;
    public int size = 0 ;

    //static으로 선언한 이유, generic 프로그램을 하기위해
    private static class Node<T>{
        public T data;
        public Node<T> next;
        public Node<T> previous;

        public Node(T item){
            data = item;
            next = null;

        }
    }

    public Iterator<E> iterator(){
        return new KMListIterator(0);
    }

    public ListIterator<E> listIterator(){
        return new KMListIterator(0);
    }
    public ListIterator<E> listIterator(int index){
            return new KMListIterator(index);
        }

    private class KMListIterator implements ListIterator<E>{

        //data member and constructor

        private Node<E> nextItem ;
        private Node<E> lastItemReturned ;
        private int index;

        public KMListIterator(int i ){
            if (i < 0 || i > size)
                throw new IndexOutOfBoundsException("Invalid index " + i);
            lastItemReturned = null;
            if (i == size) {
                index = size;
                nextItem = null;
            }
            else {
                nextItem = head;
                for (index = 0; index < i; index++)
                    nextItem = nextItem.next;
            }
        }


        @Override
        public boolean hasNext() {
            return nextItem != null;
        }

        @Override
        public E next() {
            if (!hasNext())
                throw new NoSuchElementException();

            lastItemReturned = nextItem;
            nextItem = nextItem.next;
            index++;
            return lastItemReturned.data;
        }

        @Override
        public boolean hasPrevious() {
            return (nextItem == null && size != 0) || nextItem.previous != null;
        }

        @Override
        public E previous() {
            if (!hasPrevious())
                throw new NoSuchElementException();
            if (nextItem == null) // Iterator past the last element
                nextItem = tail;
            else
                nextItem = nextItem.previous;
            lastItemReturned = nextItem;
            index--;
            return lastItemReturned.data;
        }

        @Override
        public int nextIndex() {
            return index;
        }

        @Override
        public int previousIndex() {
            return index - 1;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(E e) {

        }

        @Override
        public void add(E e) {

        }
    }

    public int indexOf(E item){
        return 0;
    }

    public void add(int index, E item){

    }
    public E get(int index){
        return null;
    }

    public boolean remove(int index){
        return true;
    }

    public void remove(E obj){

    }
    public int size(){
        return 0;
    }
}
