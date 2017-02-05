package exceptions;

/**
 * An exception for when a data structure is empty.
 * 
 * Assumptions/Restrictions: None.
 * 
 * Noteworthy Features: 
 * 
 * @author Ryan Amaral
 *
 */
@SuppressWarnings("serial")
public class EmptyStructureException extends Exception {
    
    public EmptyStructureException() { super(); }
    public EmptyStructureException(String s) { super(s); }
}
