package adt;

import exceptions.EmptyStructureException;

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
	
    /**
     * @return The amount of elements in the queue.
     */
    public int size();
    
    /**
     * @return Whether the queue is empty.
     */
    public boolean isEmpty();
    
    /**
     * Inserts an element at the head of the queue.
     * @param element The element to insert.
     */
    public void insertFirst(E element);
    
    /**
     * Inserts an element at the tail of the queue.
     * @param element The element to insert.
     */
    public void insertLast(E element);
    
    /**
     * Removes and returns the element at the head of the queue.
     * @return The element at the head of the queue.
     * @throws EmptyStructureException
     */
    public E removeFirst() throws EmptyStructureException;
    
    /**
     * Removes and returns the element at the tail of the queue.
     * @return The element at the tail of the queue.
     * @throws EmptyStructureException
     */
    public E removeLast() throws EmptyStructureException;
    
    /**
     * Returns but does not remove the element at the head of the queue.
     * @return The element at the head of the queue.
     * @throws EmptyStructureException
     */
    public E firstElement() throws EmptyStructureException;
    
    /**
     * Returns but does not remove the element at the tail of the queue.
     * @return The element at the tail of the queue.
     * @throws EmptyStructureException
     */
    public E lastElement() throws EmptyStructureException;
}
