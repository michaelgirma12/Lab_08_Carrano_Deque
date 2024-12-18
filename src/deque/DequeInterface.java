package deque;

/**
 * An interface for the ADT deque.
 * 
 * @author Frank M. Carrano
 * @author Timothy M. Henry
 * @version 4.0
 * @param <T> generic type for the deque
 */
/**
 * DequeInterface: Interface defining the behavior of a deque.
 */
public interface DequeInterface<T>
{
    /**
     * Adds a new entry to the front of this dequeue.
     * 
     * @param newEntry
     *            An object to be added.
     */
/**
 * void: Describe the method's purpose here.
 */
    public void addToFront(T newEntry);

    /**
     * Adds a new entry to the back of this dequeue.
     * 
     * @param newEntry
     *            An object to be added.
     */
/**
 * void: Describe the method's purpose here.
 */
    public void addToBack(T newEntry);

    /**
     * Removes and returns the front entry of this dequeue.
     * 
     * @return The object at the front of the dequeue.
     * @throws EmptyQueueException
     *             if the dequeue is empty before the operation.
     */
/**
 * T: Describe the method's purpose here.
 */
    public T removeFront();

    /**
     * Removes and returns the back entry of this dequeue.
     * 
     * @return The object at the back of the dequeue.
     * @throws EmptyQueueException
     *             if the dequeue is empty before the operation.
     */
/**
 * T: Describe the method's purpose here.
 */
    public T removeBack();

    /**
     * Retrieves the front entry of this dequeue.
     * 
     * @return The object at the front of the dequeue.
     * @throws EmptyQueueException
     *             if the dequeue is empty before the operation.
     */
/**
 * T: Describe the method's purpose here.
 */
    public T getFront();

    /**
     * Retrieves the back entry of this dequeue.
     * 
     * @return The object at the back of the dequeue.
     * @throws EmptyQueueException
     *             if the dequeue is empty before the operation.
     */
/**
 * T: Describe the method's purpose here.
 */
    public T getBack();

    /**
     * Detects whether this dequeue is empty.
     * 
     * @return True if the queue is empty, or false otherwise.
     */
/**
 * boolean: Describe the method's purpose here.
 */
    public boolean isEmpty();

    /**
     * Removes all entries from this dequeue.
     */
/**
 * void: Describe the method's purpose here.
 */
    public void clear();
} // end DequeInterface
