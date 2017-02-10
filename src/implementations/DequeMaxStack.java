package implementations;

import adt.Deque;
import adt.MaxStackNode;
import adt.Stack;
import exceptions.EmptyStructureException;

/**
 * An implementation of max stack doing all operations in O(1) time.
 * Only allows integer type. This is the class with notable features.
 * 
 * Assumptions/Restrictions: None.
 * 
 * Noteworthy Features: The stack returns the max in O(1) time, as well
 * as the other main functions.
 * 
 * @author Ryan Amaral
 */
public class DequeMaxStack implements Stack<MaxStackNode> {

    Deque<MaxStackNode> deque; // the backing data structure of this stack
    
    /**
     * Create a deque based max stack.
     * @param deque
     */
    public DequeMaxStack(Deque<MaxStackNode> deque){
        this.deque = deque;
    }
    
    @Override
    public int size() {
        return deque.size();
    }

    @Override
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    @Override
    public MaxStackNode top() throws EmptyStructureException {
        return deque.lastElement();
    }

    @Override
    public MaxStackNode pop() throws EmptyStructureException {
        return deque.removeLast();
    }

    @Override // I wish I could make this private here
    public void push(MaxStackNode element) {
        deque.insertLast(element);
    }
    
    /**
     * Pushes new value to max stack, updating the max.
     * @param value The value of the new node
     */
    public void push(int value){
        MaxStackNode node;
        int maxVal = 0;
        if(!isEmpty()){
            // this try catch should be pointless
            try {
                maxVal = (value > max()) ? value : max();
            } catch (EmptyStructureException e) {
                // I am confident that this line will never be reached
            }
        }else{ // empty so max is the new value
            maxVal = value;
        }
        node = new MaxStackNode(value, maxVal);
        push(node); // the real push
    }

    /**
     * @return The current max value in the stack.
     * @throws EmptyStructureException If structure is empty.
     */
    public int max() throws EmptyStructureException{
        return top().Max;
    }
    
    public String toString(){
        if(!isEmpty()){
            int max;
            try {
                max = max();
            } catch (EmptyStructureException e) {
                max = 0;
            }
            return deque.toString() + " Max: " + max;
        }else{
            return deque.toString() + " Max: -";
        }
    }
}