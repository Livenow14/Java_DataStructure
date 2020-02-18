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

    }
}
