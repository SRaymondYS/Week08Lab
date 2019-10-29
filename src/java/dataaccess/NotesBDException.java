package dataaccess;

/**
 *
 * @author 794471
 */
public class NotesBDException extends Exception 
{
    /**
     * Creates a new instance of <code>NotesBDException</code> without detail
     * message.
     */
    public NotesBDException() 
    {
        
    }

    /**
     * Constructs an instance of <code>NotesBDException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NotesBDException(String msg) 
    {
        super(msg);
    }
}
