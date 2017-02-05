package exceptions;

/**
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
