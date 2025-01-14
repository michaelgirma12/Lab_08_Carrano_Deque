package deque;

/**
 * A class of runtime exceptions thrown by methods to indicate that a queue is
 * empty.
 * 
 * @author Frank M. Carrano
 * @author Timothy M. Henry
 * @version 4.0
 */
@SuppressWarnings("serial")
/**
 * EmptyQueueException: Brief description of this class.
 */
public class EmptyQueueException extends RuntimeException
{
    /**
     * default constructor for EmptyQueueException
     */
/**
 * EmptyQueueException: Describe the method's purpose here.
 */
    public EmptyQueueException()
    {
        this(null);
    }

    /**
     * uses RuntimeException's constructor to construct a new empty queue
     * exception with a specified detail message
     * 
     * @param message that explains the exception
     */
/**
 * EmptyQueueException: Describe the method's purpose here.
 */
    public EmptyQueueException(String message)
    {
        super(message);
    } 
}
