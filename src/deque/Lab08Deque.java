package deque;

/**
 * A deque implemented using a doubly-linked chain.
 *
 * @param <T>
 *            The type of elements contained in the deque.
 *
 * @author Michael Girma (gmichael22)
 * @version 2023.07.27
 */
/**
 * Lab08Deque: Brief description of this class.
 */
public class Lab08Deque<T> extends DLinkedDeque<T> {

    /**
     * Inserts a new item at the front of the deque.
     * 
     * @param newEntry
     *            the item to insert.
     */
/**
 * void: Describe the method's purpose here.
 */
    public void addToFront(T newEntry) {

        DLNode<T> newNode = new DLNode<T>(newEntry);
        if (isEmpty()) {
            lastNode = newNode;
        }
        else {
            firstNode.setPreviousNode(newNode);
            newNode.setNextNode(firstNode);
        }
        firstNode = newNode;
        size++;

    }


    /**
     * Insert a new item at the rear of the deque.
     * 
     * @param newEntry
     *            the item to insert.
     */
/**
 * void: Describe the method's purpose here.
 */
    public void addToBack(T newEntry) {
        DLNode<T> newNode = new DLNode<T>(newEntry);
        if (isEmpty()) {
            firstNode = newNode;
        }
        else {
            lastNode.setNextNode(newNode);
            newNode.setPreviousNode(lastNode);
        }
        lastNode = newNode;
        size++;

    }


    /**
     * Remove the item at the front of the deque.
     * 
     * @return The item that was removed
     * @throws EmptyQueueException
     *             if there is not an element at the front
     */
/**
 * T: Describe the method's purpose here.
 */
    public T removeFront() {
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
        T removedItem = firstNode.getData();
        if (size() == 1) {
            firstNode = null;
            lastNode = null;
        }
        else {
            firstNode = firstNode.getNextNode();
            firstNode.setPreviousNode(null);
        }
        size--;
        return removedItem;

    }


    /**
     * Remove the item at the rear of the deque.
     * 
     * @return The item that was removed
     * @throws EmptyQueueException
     *             if there is no element at the front
     */
/**
 * T: Describe the method's purpose here.
 */
    public T removeBack() {
        if (isEmpty()) {
            throw new EmptyQueueException("Deque is empty.");
        }
        T removedItem = lastNode.getData();
        lastNode = lastNode.getPreviousNode();
        size--;
        if (lastNode == null) {
            firstNode = null;
        }
        else {
            lastNode.setNextNode(null);
        }
        return removedItem;

    }


    /**
     * Get the item at the front (the head) of the deque. Does not alter the
     * deque.
     * 
     * @return the item at the front of the deque.
     * @throws EmptyQueueException
     *             if no element at the front
     */
/**
 * T: Describe the method's purpose here.
 */
    public T getFront() {
        if (isEmpty()) {
            throw new EmptyQueueException("Deque is empty.");
        }
        return firstNode.getData();

    }


    /**
     * Get the item at the rear (the tail) of the deque. Does not alter the
     * deque.
     * 
     * @return the item at the rear of the deque.
     * @throws EmptyQueueException
     *             if no element at rear
     * 
     */
/**
 * T: Describe the method's purpose here.
 */
    public T getBack() {
        if (isEmpty()) {
            throw new EmptyQueueException(
                "Cannot get back element from an empty deque.");
        }
        return lastNode.getData();
    }


    /**
     * Check if the deque is empty
     * 
     * @return true if the deque has no items
     */
/**
 * boolean: Describe the method's purpose here.
 */
    public boolean isEmpty() {
        return size == 0;

    }


    /**
     * Empty the deque.
     */
/**
 * void: Describe the method's purpose here.
 */
    public void clear() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }


    // ----------------------------------------------------------
    /**
     * Returns a string representation of this deque. A deque's string
     * representation is written as a comma-separated list of its contents (in
     * front-to-rear order) surrounded by square brackets, like this:
     * 
     * [52, 14, 12, 119, 73, 80, 35]
     * 
     * An empty deque is simply [].
     *
     * @return a string representation of the deque
     */
    @Override
/**
 * String: Describe the method's purpose here.
 */
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        DLNode<T> p = firstNode;
        while (p != null) {
            if (s.length() > 1) {
                s.append(", ");
            }
            s.append(p.getData());
            p = p.getNextNode();
        }
        s.append("]");
        return s.toString();
    }


    /**
     * Removes and returns the second entry of this deque The front entry stays
     * the same and the third entry becomes the second.
     * 
     * @return The second object of the deque. Null, if it doesn't exist.
     * @throws EmptyQueueException
     *             if the deque is empty before the operation.
     */
/**
 * T: Describe the method's purpose here.
 */
    public T removeSecond() {
        if (size < 2) {
            throw new EmptyQueueException(
                "Deque does not have a second element.");
        }
        DLNode<T> secondNode = firstNode.getNextNode();
        T removedItem = secondNode.getData();
        firstNode.setNextNode(secondNode.getNextNode());
        if (secondNode.getNextNode() != null) {
            secondNode.getNextNode().setPreviousNode(firstNode);
        }
        else {
            lastNode = firstNode;
        }
        size--;
        return removedItem;
    }


    /**
     * Removes and returns the second to last entry of this deque. All other
     * entries stay the same and the third to last entry becomes the second to
     * last.
     * 
     * @return The object second to last in the deque and null if it doesn't
     *         exist.
     * @throws EmptyQueueException
     *             if the deque is empty before the operation.
     */
/**
 * T: Describe the method's purpose here.
 */
    public T removeSecondToLast() {
        if (size < 2) {
            throw new EmptyQueueException(
                "Deque does not have a second to last element.");
        }
        T removedItem;
        if (size == 2) {
            removedItem = lastNode.getData();
            firstNode = lastNode;
            lastNode = null;
        }
        else {
            DLNode<T> secondToLastNode = lastNode.getPreviousNode();
            removedItem = secondToLastNode.getData();
            secondToLastNode.getPreviousNode().setNextNode(lastNode);
            lastNode.setPreviousNode(secondToLastNode.getPreviousNode());
        }
        size--;
        return removedItem;
    }

}
