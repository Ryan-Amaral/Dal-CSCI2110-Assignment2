package deque;

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
        return (elements.length - head + tail) % elements.length;
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
            elements[(head + i + 1) % size()] 
                    = elements[(head + i) % size()];
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
        return null;
    }

    @Override
    public Object removeLast() throws EmptyStructureException {
        if(isEmpty()) throw new EmptyStructureException();
        return null;
    }

    @Override
    public Object firstElement() throws EmptyStructureException {
        if(isEmpty()) throw new EmptyStructureException();
        return null;
    }

    @Override
    public Object lastElement() throws EmptyStructureException {
        if(isEmpty()) throw new EmptyStructureException();
        return null;
    }

}
