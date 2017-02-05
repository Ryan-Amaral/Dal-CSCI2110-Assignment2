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
 * @param <E>
 *
 */
public class ArrayDeque<E> implements Deque {
    
    private Object[] elements; // where the data is stored
    private final int DefaultSize = 10; // starting size of queue array
    private int maxSize; // the actual size of the queue
    private int head = 0; // the index of the first element
    private int tail = 0; // one past the index of the last element
    
    /**
     * Creates an array based double ended queue of size DefaultSize.
     */
    public ArrayDeque(){
        elements = (E[])new Object[DefaultSize];
        maxSize = DefaultSize;
    }
    
    /**
     * Creates an array based double ended queue of specified size.
     * @param size The desired size.
     */
    public ArrayDeque(int size){
        elements = (E[])new Object[size];
        maxSize = size;
    }

    @Override
    public int size() {
        return (elements.length - head + tail) % maxSize;
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    @Override
    public void insertFirst(Object element) throws FullStructureException {
        if(size() == maxSize) throw new FullStructureException(); // error
        // slide all elements to right, then insert new element in head
        for(int i = size() - 1; i >= 0; i--){
            elements[(head + i + 1) % maxSize] 
                    = elements[(head + i) % maxSize];
        }
        elements[head] = element; // head location same, but element is new
        tail++; // increment tail
        tail%=maxSize; // wrap if needed
    }

    @Override
    public void insertLast(Object element) throws FullStructureException {
        if(size() == maxSize) throw new FullStructureException(); // error
        elements[tail] = element;
        tail++;
    }

    @Override
    public Object removeFirst() throws EmptyStructureException {
        if(isEmpty()) throw new EmptyStructureException();
        Object element = elements[head]; // ref element
        elements[head] = null; // clear up space
        head++; // move head one forward
        head%=maxSize; // wrap
        return element;
    }

    @Override
    public Object removeLast() throws EmptyStructureException {
        if(isEmpty()) throw new EmptyStructureException();
        Object element = elements[(tail - 1) % maxSize]; // ref element
        elements[(tail - 1) % maxSize] = null; // clear up space
        tail--; // move tail back and wrap
        tail%=maxSize;
        return element;
    }

    @Override
    public Object firstElement() throws EmptyStructureException {
        if(isEmpty()) throw new EmptyStructureException();
        return elements[head];
    }

    @Override
    public Object lastElement() throws EmptyStructureException {
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