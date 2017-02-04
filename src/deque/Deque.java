package deque;

/**
 * This is an interface for double ended queues. It uses generics so it
 * is more reusable.
 * 
 * Assumptions/Restrictions: None.
 * 
 * Noteworthy Features: 
 * 
 * @author Ryan Amaral
 *
 * @param <E> Use generic.
 */
public interface Deque<E> {
	
    public int size();
    public boolean isEmpty();
    public void insertFirst(E element);
    public void insertLast(E element);
    public E removeFirst() throws EmptyStructureException;
    public E removeLast() throws EmptyStructureException;
    public E firstElement() throws EmptyStructureException;
    public E lastElement() throws EmptyStructureException;
}
