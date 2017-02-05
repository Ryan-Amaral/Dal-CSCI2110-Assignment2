package exceptions;

/**
 * An exception for when a data structure is full. Mainly for array 
 * based implementations.
 * 
 * Assumptions/Restrictions: None.
 * 
 * Noteworthy Features: 
 * 
 * @author Ryan Amaral
 *
 */
@SuppressWarnings({ "serial" })
public class FullStructureException extends RuntimeException {

    public FullStructureException() {super();}
    public FullStructureException(String s) {super(s);}
}