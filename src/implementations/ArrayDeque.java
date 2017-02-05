package implementations;

import adt.Deque;
import exceptions.EmptyStructureException;
import exceptions.FullStructureException;

/**
 * An array implementation of a double ended queue.
 * 
 * Assumptions/Restrictions: None.
 * 
 * Noteworthy Features: 
 * 
 * @author Ryan Amaral
 * @param <E> Use generics.
 *
 */
public class ArrayDeque<E> implements Deque<E> {
    
    private E[] elements; // where the data is stored
    private final int DefaultSize = 10; // starting size of queue array
    private int maxSize; // the actual size of the queue
    private int head = 0; // the index of the first element
    private int tail = 0; // one past the index of the last element
    private boolean isFull; // stores whether the dequeu is full
    
    /**
     * Creates an array based double ended queue of size DefaultSize.
     */
    public ArrayDeque(){
        elements = (E[])new Object[DefaultSize];
        maxSize = DefaultSize;
        isFull = false;
    }
    
    /**
     * Creates an array based double ended queue of specified size.
     * @param size The desired size.
     */
    public ArrayDeque(int size){
        elements = (E[])new Object[size];
        maxSize = size;
        isFull = false;
    }

    @Override
    public int size() {
        // seperate case for isFull because formula will give length of 0
        // if full
        if(isFull)
            return maxSize;
        else
            return (elements.length - head + tail) % maxSize;
    }

    @Override
    public boolean isEmpty() {
        return head == tail && isFull == false;
    }

    @Override
    public void insertFirst(E element) throws FullStructureException {
        if(isFull == true) throw new FullStructureException(); // error
        // slide all elements to right, then insert new element in head
        for(int i = size() - 1; i >= 0; i--){
            elements[(head + i + 1) % maxSize] 
                    = elements[(head + i) % maxSize];
        }
        elements[head] = element; // head location same, but element is new
        tail++; // increment tail
        tail%=maxSize; // wrap if needed
        isFull = (head == tail); // full if head = tail on insert
    }

    @Override
    public void insertLast(E element) throws FullStructureException {
        if(isFull == true) throw new FullStructureException(); // error
        elements[tail] = element;
        tail++;
        isFull = (head == tail); // full if head = tail on insert
    }

    @Override
    public E removeFirst() throws EmptyStructureException {
        if(isEmpty()) throw new EmptyStructureException();
        E element = elements[head]; // ref element
        elements[head] = null; // clear up space
        head++; // move head one forward
        head%=maxSize; // wrap
        isFull = false; // isFull never true if remove
        return element;
    }

    @Override
    public E removeLast() throws EmptyStructureException {
        if(isEmpty()) throw new EmptyStructureException();
        E element = elements[(tail - 1) % maxSize]; // ref element
        elements[(tail - 1) % maxSize] = null; // clear up space
        tail--; // move tail back and wrap
        tail%=maxSize;
        isFull = false; // isFull never true if remove
        return element;
    }

    @Override
    public E firstElement() throws EmptyStructureException {
        if(isEmpty()) throw new EmptyStructureException();
        return elements[head];
    }

    @Override
    public E lastElement() throws EmptyStructureException {
        if(isEmpty()) throw new EmptyStructureException();
        return elements[tail-1];
    }

    public String toString(){
        String str = "{"; // the string to return
        for(int i = 0; i < size(); i++){
            str += elements[(head + i) % maxSize].toString();
            if(i < size() - 1)
                str += ",";
        }
        str += "}";
        return str;
    }
}
