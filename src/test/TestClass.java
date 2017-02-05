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
        System.out.println();
        testDequeQueue();
        System.out.println();
        testDequeStack();
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
        System.out.println("size(): " + deque.size());
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
        System.out.println("size(): " + deque.size());
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

    private static void testDequeQueue(){
        System.out.println("FOR DEQUE_QUEUE:");
        
        int output;
        
        DequeQueue<Integer> queue = new DequeQueue<Integer>(new LinkedListDeque<>());
        System.out.println("new: " + queue.toString());
        
        queue.enqueue(3);
        System.out.println("enqueue(3): " + queue.toString());
        
        queue.enqueue(5);
        System.out.println("enqueue(5): " + queue.toString());
        
        System.out.println("isEmpty(): " + queue.isEmpty());
        
        try {
            output = queue.dequeue();
            System.out.println("deque(): " + queue.toString() + 
                    " Output: " + output);
        } catch (EmptyStructureException e) {
            System.out.println("deque(): error");
        }
        
        queue.enqueue(7);
        System.out.println("enqueue(7): " + queue.toString());
        
        try {
            output = queue.dequeue();
            System.out.println("deque(): " + queue.toString() + 
                    " Output: " + output);
        } catch (EmptyStructureException e) {
            System.out.println("deque(): error");
        }
        
        try {
            output = queue.dequeue();
            System.out.println("deque(): " + queue.toString() + 
                    " Output: " + output);
        } catch (EmptyStructureException e) {
            System.out.println("deque(): error");
        }
        
        try {
            output = queue.dequeue();
            System.out.println("deque(): " + queue.toString() + 
                    " Output: " + output);
        } catch (EmptyStructureException e) {
            System.out.println("deque(): error");
        }
        
        try {
            output = queue.dequeue();
            System.out.println("deque(): " + queue.toString() + 
                    " Output: " + output);
        } catch (EmptyStructureException e) {
            System.out.println("deque(): error");
        }
        
        System.out.println("isEmpty(): " + queue.isEmpty());
        
        queue.enqueue(9);
        System.out.println("enqueue(9): " + queue.toString());
        queue.enqueue(8);
        System.out.println("enqueue(8): " + queue.toString());
        queue.enqueue(7);
        System.out.println("enqueue(7): " + queue.toString());
        queue.enqueue(6);
        System.out.println("enqueue(6): " + queue.toString());
        queue.enqueue(5);
        System.out.println("enqueue(5): " + queue.toString());
        System.out.println("size(): " + queue.size());
        queue.enqueue(4);
        System.out.println("enqueue(4): " + queue.toString());
        queue.enqueue(3);
        System.out.println("enqueue(3): " + queue.toString());
        queue.enqueue(2);
        System.out.println("enqueue(2): " + queue.toString());
        queue.enqueue(1);
        System.out.println("enqueue(1): " + queue.toString());
        queue.enqueue(0);
        System.out.println("enqueue(0): " + queue.toString());
    }
    
    private static void testDequeStack(){
        System.out.println("FOR DEQUE_STACK:");
        
        int output;
        
        DequeStack<Integer> stack = new DequeStack<Integer>(new LinkedListDeque<>());
        System.out.println("new: " + stack.toString());
        
        stack.push(3);
        System.out.println("push(3): " + stack.toString());
        
        stack.push(5);
        System.out.println("push(5): " + stack.toString());
        
        System.out.println("isEmpty(): " + stack.isEmpty());
        
        try {
            output = stack.pop();
            System.out.println("pop(): " + stack.toString() + 
                    " Output: " + output);
        } catch (EmptyStructureException e) {
            System.out.println("pop(): error");
        }
        
        stack.push(7);
        System.out.println("push(7): " + stack.toString());
        
        try {
            output = stack.pop();
            System.out.println("pop(): " + stack.toString() + 
                    " Output: " + output);
        } catch (EmptyStructureException e) {
            System.out.println("pop(): error");
        }
        
        try {
            output = stack.pop();
            System.out.println("pop(): " + stack.toString() + 
                    " Output: " + output);
        } catch (EmptyStructureException e) {
            System.out.println("pop(): error");
        }
        
        try {
            output = stack.pop();
            System.out.println("pop(): " + stack.toString() + 
                    " Output: " + output);
        } catch (EmptyStructureException e) {
            System.out.println("pop(): error");
        }
        
        try {
            output = stack.pop();
            System.out.println("pop(): " + stack.toString() + 
                    " Output: " + output);
        } catch (EmptyStructureException e) {
            System.out.println("pop(): error");
        }
        
        System.out.println("isEmpty(): " + stack.isEmpty());
        
        stack.push(9);
        System.out.println("push(9): " + stack.toString());
        stack.push(8);
        System.out.println("push(8): " + stack.toString());
        stack.push(7);
        System.out.println("push(7): " + stack.toString());
        stack.push(6);
        System.out.println("push(6): " + stack.toString());
        stack.push(5);
        System.out.println("push(5): " + stack.toString());
        System.out.println("size(): " + stack.size());
        stack.push(4);
        System.out.println("push(4): " + stack.toString());
        stack.push(3);
        System.out.println("push(3): " + stack.toString());
        stack.push(2);
        System.out.println("push(2): " + stack.toString());
        stack.push(1);
        System.out.println("push(1): " + stack.toString());
        stack.push(0);
        System.out.println("push(0): " + stack.toString());
    }
}
