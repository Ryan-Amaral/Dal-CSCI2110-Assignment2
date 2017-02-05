package implementations;

import java.util.Iterator;
import java.util.LinkedList;

import adt.Deque;
import exceptions.EmptyStructureException;

/**
 * A linked list implementation of a deque.
 * 
 * Assumptions/Restrictions: None.
 * 
 * Noteworthy Features: 
 * 
 * @author Ryan Amaral
 *
 */
public class LinkedListDeque<E> implements Deque {
    
    LinkedList<Object> elements;

    /**
     * Creates a new linked list deque with an empty list
     */
    LinkedListDeque(){
        elements = new LinkedList<Object>();
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public void insertFirst(Object element) {
        elements.add(0, element);
    }

    @Override
    public void insertLast(Object element) {
        elements.add(elements.size(), element);
    }

    @Override
    public Object removeFirst() throws EmptyStructureException {
        if(elements.isEmpty()) throw new EmptyStructureException();
        return elements.removeFirst();
    }

    @Override
    public Object removeLast() throws EmptyStructureException {
        if(elements.isEmpty()) throw new EmptyStructureException();
        return elements.removeLast();
    }

    @Override
    public Object firstElement() throws EmptyStructureException {
        if(elements.isEmpty()) throw new EmptyStructureException();
        return elements.getFirst();
    }

    @Override
    public Object lastElement() throws EmptyStructureException {
        if(elements.isEmpty()) throw new EmptyStructureException();
        return elements.getLast();
    }
    
    public String toString(){
        String str = "{"; // the string to return
        Iterator<Object> iterator = elements.iterator();
        while(iterator.hasNext()){
            str += iterator.next().toString();
            if(iterator.hasNext())
                str += ",";
        }
        str += "}";
        return str;
    }
}
