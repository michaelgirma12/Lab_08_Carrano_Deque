package deque;

/**
 * A class that implements the ADT deque by using a doubly linked chain of
 * nodes. class DLinkedDeque<T> implements DequeInterface<T>
 * 
 * @author Frank M. Carrano
 * @author Timothy M. Henry
 * @version 4.0
 * @param <T>
 */
public abstract class DLinkedDeque<T> implements DequeInterface<T>
{
    /**
     * References node at front of deque
     */
    protected DLNode<T> firstNode;
    /**
     * References node at back of deque
     */
    protected DLNode<T> lastNode;
    /**
     * number of elements in the deque
     */
    protected int size;

    /**
     * Create a new DLinkedDeque object.
     */
/**
 * DLinkedDeque: Describe the method's purpose here.
 */
    public DLinkedDeque()
    {
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    /**
     * Get the number of items in this deque. Does not alter the deque.
     *
     * @return The number of items this deque contains.
     */
/**
 * int: Describe the method's purpose here.
 */
    public int size()
    {
        return size;
    }

    // ----------------------------------------------------------

    /**
     * Doubly Linked Node
     * 
     * @author Carrano
     *
     * @param <T>
     */
    protected static final class DLNode<T>
    {

        /**
         * Deque entry
         */
        private T data;
        /**
         * Link to next node
         */
        private DLNode<T> next;
        /**
         * Link to previous node
         */
        private DLNode<T> previous;

        /**
         * Constructor
         * 
         * @param dataPortion
         *            the data to be stored in the node
         */
        protected DLNode(T dataPortion)
        {
            data = dataPortion;
            next = null;
            previous = null;
        } 

        /**
         * Constructor
         * 
         * @param previousNode
         *            the reference to the previous node
         * @param dataPortion
         *            the data to be stored in the node
         * @param nextNode
         *            the reference to the next node
         */
        protected DLNode(DLNode<T> previousNode, T dataPortion,
            DLNode<T> nextNode)
        {
            // data = dataPortion;
            this(dataPortion);
            next = nextNode;
            previous = previousNode;
        }

        /**
         * Returns the data portion of the node
         * 
         * @return data portion
         */
        protected T getData()
        {
            return data;
        }

        /**
         * Sets the data portion of the node
         * 
         * @param newData
         *            data to store in the node
         */
        protected void setData(T newData)
        {
            data = newData;
        } 

        /**
         * Returns the next node
         * 
         * @return reference to the next node
         */
        protected DLNode<T> getNextNode()
        {
            return next;
        } 

        /**
         * Sets the next node reference
         * 
         * @param nextNode
         *            reference to next node
         */
        protected void setNextNode(DLNode<T> nextNode)
        {
            next = nextNode;
        } 

        /**
         * Returns the previous node
         * 
         * @return reference to the previous node
         */
        protected DLNode<T> getPreviousNode()
        {
            return previous;
        } 

        /**
         * Sets the previous node reference
         * 
         * @param previousNode
         *            reference to previous node
         */
        protected void setPreviousNode(DLNode<T> previousNode)
        {
            previous = previousNode;
        } 
    }
}