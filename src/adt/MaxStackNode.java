package adt;

/**
 * Helper for Max Stack, for each node.
 * 
 * @author Ryan Amaral
 *
 */
public class MaxStackNode {
    
    public MaxStackNode(int value, int max){
        Value = value;
        Max = max;
    }
    
    public int Value;
    public int Max; // max at time node is pushed
    
    public String toString(){
        return Integer.valueOf(Value).toString();
    }
}
