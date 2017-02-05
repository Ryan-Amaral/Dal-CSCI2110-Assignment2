package test;

import exceptions.EmptyStructureException;
import exceptions.FullStructureException;
import implementations.*;

/**
 * The class for testing the data structures built by me.
 * 
 * Assumptions/Restrictions: None.
 * 
 * Noteworthy Features: 
 * 
 * @author Ryan Amaral
 *
 */
public class TestClass {

    /**
     * Performs tests on the deque based data structures that I built.
     * @param args
     */
    public static void main(String[] args) {

        testArrayDeque();
        System.out.println();
        testLinkedListDeque();
    }
    
    private static void testArrayDeque(){
        System.out.println("FOR ARRAY_DEQUE: Of size 10 (default)");
        
        int output;
        
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        System.out.println("new: " + deque.toString());
        
        deque.insertFirst(3);
        System.out.println("insertFirst(3): " + deque.toString());
        
        deque.insertFirst(5);
        System.out.println("insertFirst(5): " + deque.toString());
        
        System.out.println("isEmpty(): " + deque.isEmpty());
        
        try {
            output = deque.removeFirst();
            System.out.println("removeFirst(): " + deque.toString() + 
                    " Output: " + output);
        } catch (EmptyStructureException e) {
            System.out.println("removeFirst(): error");
        }
        
        deque.insertLast(7);
        System.out.println("insertLast(7): " + deque.toString());
        
        try {
            output = deque.removeFirst();
            System.out.println("removeFirst(): " + deque.toString() + 
                    " Output: " + output);
        } catch (EmptyStructureException e) {
            System.out.println("removeFirst(): error");
        }
        
        try {
            output = deque.removeLast();
            System.out.println("removeLast(): " + deque.toString() + 
                    " Output: " + output);
        } catch (EmptyStructureException e) {
            System.out.println("removeLast(): error");
        }
        
        try {
            output = deque.lastElement();
            System.out.println("lastElement(): " + deque.toString() + 
                    " Output: " + output);
        } catch (EmptyStructureException e) {
            System.out.println("lastElement(): error");
        }
        
        try {
            output = deque.removeFirst();
            System.out.println("removeFirst(): " + deque.toString() + 
                    " Output: " + output);
        } catch (EmptyStructureException e) {
            System.out.println("removeFirst(): error");
        }
        
        System.out.println("isEmpty(): " + deque.isEmpty());
        
        deque.insertFirst(9);
        System.out.println("insertFirst(9): " + deque.toString());
        deque.insertLast(8);
        System.out.println("insertLast(8): " + deque.toString());
        deque.insertFirst(7);
        System.out.println("insertFirst(7): " + deque.toString());
        deque.insertLast(6);
        System.out.println("insertLast(6): " + deque.toString());
        deque.insertFirst(5);
        System.out.println("insertFirst(5): " + deque.toString());
        deque.insertLast(4);
        System.out.println("insertLast(4): " + deque.toString());
        deque.insertFirst(3);
        System.out.println("insertFirst(3): " + deque.toString());
        deque.insertLast(2);
        System.out.println("insertLast(2): " + deque.toString());
        deque.insertFirst(1);
        System.out.println("insertFirst(1): " + deque.toString());
        deque.insertLast(0);
        System.out.println("insertLast(0): " + deque.toString());
        try{
            deque.insertFirst(4);
            System.out.println("insertFirst(4): " + deque.toString());
        } catch (FullStructureException e){
            System.out.println("insertFirst(4): error");
        }
    }
    
    private static void testLinkedListDeque(){
        System.out.println("FOR LINKED_LIST_DEQUE:");
        
        int output;
        
        LinkedListDeque<Integer> deque = new LinkedListDeque<Integer>();
        System.out.println("new: " + deque.toString());
        
        deque.insertFirst(3);
        System.out.println("insertFirst(3): " + deque.toString());
        
        deque.insertFirst(5);
        System.out.println("insertFirst(5): " + deque.toString());
        
        System.out.println("isEmpty(): " + deque.isEmpty());
        
        try {
            output = deque.removeFirst();
            System.out.println("removeFirst(): " + deque.toString() + 
                    " Output: " + output);
        } catch (EmptyStructureException e) {
            System.out.println("removeFirst(): error");
        }
        
        deque.insertLast(7);
        System.out.println("insertLast(7): " + deque.toString());
        
        try {
            output = deque.removeFirst();
            System.out.println("removeFirst(): " + deque.toString() + 
                    " Output: " + output);
        } catch (EmptyStructureException e) {
            System.out.println("removeFirst(): error");
        }
        
        try {
            output = deque.removeLast();
            System.out.println("removeLast(): " + deque.toString() + 
                    " Output: " + output);
        } catch (EmptyStructureException e) {
            System.out.println("removeLast(): error");
        }
        
        try {
            output = deque.lastElement();
            System.out.println("lastElement(): " + deque.toString() + 
                    " Output: " + output);
        } catch (EmptyStructureException e) {
            System.out.println("lastElement(): error");
        }
        
        try {
            output = deque.removeFirst();
            System.out.println("removeFirst(): " + deque.toString() + 
                    " Output: " + output);
        } catch (EmptyStructureException e) {
            System.out.println("removeFirst(): error");
        }
        
        System.out.println("isEmpty(): " + deque.isEmpty());
        
        deque.insertFirst(9);
        System.out.println("insertFirst(9): " + deque.toString());
        deque.insertLast(8);
        System.out.println("insertLast(8): " + deque.toString());
        deque.insertFirst(7);
        System.out.println("insertFirst(7): " + deque.toString());
        deque.insertLast(6);
        System.out.println("insertLast(6): " + deque.toString());
        deque.insertFirst(5);
        System.out.println("insertFirst(5): " + deque.toString());
        deque.insertLast(4);
        System.out.println("insertLast(4): " + deque.toString());
        deque.insertFirst(3);
        System.out.println("insertFirst(3): " + deque.toString());
        deque.insertLast(2);
        System.out.println("insertLast(2): " + deque.toString());
        deque.insertFirst(1);
        System.out.println("insertFirst(1): " + deque.toString());
        deque.insertLast(0);
        System.out.println("insertLast(0): " + deque.toString());
        try{
            deque.insertFirst(4);
            System.out.println("insertFirst(4): " + deque.toString());
        } catch (FullStructureException e){
            System.out.println("insertFirst(4): error");
        }
    }

}
