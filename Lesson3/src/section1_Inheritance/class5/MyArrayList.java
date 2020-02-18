package section1_Inheritance.class5;

import java.util.Arrays;

public class MyArrayList<T> {

    private static final int INIT_CAPACITY = 10;
    private T [] theData ;
    private int size;
    private int capacity = 0;

    public MyArrayList(){
        theData = (T[]) new Object[INIT_CAPACITY];
        size =0;
        capacity = INIT_CAPACITY;
    }

    public void add (int index, T anEntry) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        if (size >= capacity) {
            reallocate();
        }
        for (int i = size; i > index; i--) {
            theData[i] = theData[i-1];
        }
        theData[index] = anEntry;
        size++;
    }

    private void reallocate() {
        capacity*=2;
        theData = Arrays.copyOf(theData,capacity);  //Arrays.copyOf(원래배열, 길이만큼 추가  )
    }

    public void add(T anEntry){
        add(size, anEntry);

    }
    public T get (int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return theData[index];
    }
    public T remove (int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        T returnValue = theData[index];
        for (int i = index + 1; i < size; i++) {
            theData[i-1] = theData[i];
        }
        size--;
        return returnValue;
    }
    public T set (int index, T newValue) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        T oldValue = theData[index];
        theData[index] = newValue;
        return oldValue;
    }

    public int indexOf(T anEntry){
        for(int i=0; i<size ;i++)
            if(theData[i].equals(anEntry))
                return i;
            return -1;
    }

    public static void main(String[] args) {
        MyArrayList<String> test = new MyArrayList<>();

        try {
            test.add(1, "Hello");
        }
        catch ( ArrayIndexOutOfBoundsException e){
            System.out.println("에러에러");
        }
    }

}
