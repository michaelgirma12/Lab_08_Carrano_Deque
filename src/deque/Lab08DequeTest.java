package deque;

import student.TestCase;

/**
 * test class for the lab8Deque class
 *
 * @author Michael Girma (gmichael22)
 * @version 2023.07.27
 */
/**
 * Lab08DequeTest: Brief description of this class.
 */
public class Lab08DequeTest extends TestCase {

    private Lab08Deque<String> deque;

    /**
     * Creates two brand new, empty sets for each test method.
     */
/**
 * void: Describe the method's purpose here.
 */
    public void setUp() {
        deque = new Lab08Deque<String>();
    }


    /**
     * test for addToFront
     * for an empty deque
     */
/**
 * void: Describe the method's purpose here.
 */
    public void testAddToFrontEmpty() {
        deque.addToFront("new front");
        assertEquals(1, deque.size());
        assertEquals("new front", deque.getFront());
        assertEquals("new front", deque.getBack());
    }


    /**
     * test for addToFront
     * for a nonempty deque
     */
/**
 * void: Describe the method's purpose here.
 */
    public void testAddToFrontNonEmpty() {
        deque.addToFront("First");
        deque.addToFront("Second");
        deque.addToFront("New First");
        assertEquals(3, deque.size());
        assertEquals("New First", deque.getFront());
        assertEquals("First", deque.getBack());
    }


    /**
     * test for addToBack
     * for an empty deque
     */
/**
 * void: Describe the method's purpose here.
 */
    public void testAddToBackEmpty() {
        deque.addToBack("New Last");
        assertEquals(1, deque.size());
        assertEquals("New Last", deque.getFront());
        assertEquals("New Last", deque.getBack());
    }


    /**
     * test for addToBack
     * for a nonempty deque
     */
/**
 * void: Describe the method's purpose here.
 */
    public void testAddToBackNonEmpty() {
        deque.addToBack("Last");
        deque.addToBack("Second Last");
        deque.addToBack("New Last");
        assertEquals(3, deque.size());
        assertEquals("Last", deque.getFront());
        assertEquals("New Last", deque.getBack());
    }


    /**
     * test for removeFront
     * for an empty deque
     */
/**
 * void: Describe the method's purpose here.
 */
    public void testRemoveFrontEmpty() {
        Exception exception = null;
        try {
            deque.removeFront();
            fail("removeFront() is not throwing an exception when it should");
        }
        catch (Exception e) {
            exception = e;
        }
        assertTrue("removeFront() is throwing the wrong type of exception",
            exception instanceof EmptyQueueException);
    }


    /**
     * test for removeFront
     * for a deque with only one element
     */
/**
 * void: Describe the method's purpose here.
 */
    public void testRemoveFrontOneElement() {
        deque.addToFront("A");
        assertEquals("A", deque.removeFront());
        assertTrue(deque.isEmpty());
        assertEquals(0, deque.size());
    }


    /**
     * test for removeFront
     * for a nonempty deque
     */
/**
 * void: Describe the method's purpose here.
 */
    public void testRemoveFrontNonEmpty() {
        deque.addToFront("A");
        deque.addToFront("B");
        assertEquals("B", deque.removeFront());
        assertEquals("A", deque.getFront());
        assertFalse(deque.isEmpty());
        assertEquals(1, deque.size());
    }


    /**
     * test for removeBack
     * for an empty deque
     */
/**
 * void: Describe the method's purpose here.
 */
    public void testRemoveBackEmpty() {
        Exception exception = null;
        try {
            deque.removeBack();
            fail("removeBack() is not throwing an exception when it should");
        }
        catch (Exception e) {
            exception = e;
        }
        assertTrue("removeBack() is throwing the wrong type of exception",
            exception instanceof EmptyQueueException);
    }


    /**
     * test for removeBack
     * for a nonempty
     */
/**
 * void: Describe the method's purpose here.
 */
    public void testRemoveBackNonEmpty() {
        Exception exception = null;
        try {
            deque.removeBack();
            fail("removeBack() is not throwing an exception when it should");
        }
        catch (Exception e) {
            exception = e;
        }
        assertTrue("removeBack() is throwing the wrong type of exception",
            exception instanceof EmptyQueueException);
        //
        deque.addToBack("A");
        deque.addToBack("B");
        deque.addToBack("C");
        assertEquals("C", deque.removeBack());
        assertEquals("A", deque.getFront());
        assertEquals("B", deque.getBack());
        assertFalse(deque.isEmpty());
        assertEquals(2, deque.size());
    }


    /**
     * Test for removeBack
     * for a deque with only one item
     */
/**
 * void: Describe the method's purpose here.
 */
    public void testRemoveBackSingleItem() {
        deque.addToBack("A");
        assertEquals("A", deque.removeBack());
        assertTrue(deque.isEmpty());
    }


    /**
     * test getFront
     * for an empty deque
     */
/**
 * void: Describe the method's purpose here.
 */
    public void testGetFrontEmpty() {
        Exception exception = null;
        try {
            deque.getFront();
            fail("getFront() is not throwing an exception when it should");
        }
        catch (Exception e) {
            exception = e;
        }
        assertTrue("getFront() is throwing the wrong type of exception",
            exception instanceof EmptyQueueException);
    }


    /**
     * test for getFront
     * for a non empty deque
     */
/**
 * void: Describe the method's purpose here.
 */
    public void testGetFrontNonEmpty() {
        deque.addToFront("A");
        deque.addToFront("B");
        assertEquals("B", deque.getFront());
        assertFalse(deque.isEmpty());
        assertEquals(2, deque.size());
    }


    /**
     * test for getBack
     * for an empty deque
     */
/**
 * void: Describe the method's purpose here.
 */
    public void testGetBackEmpty() {
        Exception exception = null;
        try {
            deque.getBack(); // Changed from getFront() to getBack()
            fail("getBack() is not throwing an exception when it should");
        }
        catch (Exception e) {
            exception = e;
        }
        assertTrue("getBack() is throwing the wrong type of exception",
            exception instanceof EmptyQueueException);
    }


    /**
     * test for getBack
     * for a nonempty deque
     */
/**
 * void: Describe the method's purpose here.
 */
    public void testGetBackNonEmpty() {
        deque.addToBack("A");
        deque.addToBack("B");
        assertEquals("B", deque.getBack());
        assertFalse(deque.isEmpty());
        assertEquals(2, deque.size());
    }


    /**
     * test for isEmpty
     * for an empty deque
     */
/**
 * void: Describe the method's purpose here.
 */
    public void testIsEmpty() {
        assertTrue(deque.isEmpty());
    }


    /**
     * test for isEmpty
     * for a non empty deque
     */
/**
 * void: Describe the method's purpose here.
 */
    public void testIsEmptyNonEmpty() {
        deque.addToFront("a");
        deque.addToFront("b");
        assertFalse(deque.isEmpty());
    }


    /**
     * test for clear
     * for an empty deque
     */
/**
 * void: Describe the method's purpose here.
 */
    public void testClearEmpty() {
        deque.clear();
        assertTrue(deque.isEmpty());
    }


    /**
     * test for clear
     * for a non empty deque
     */
/**
 * void: Describe the method's purpose here.
 */
    public void testClearNonEmpty() {
        deque.addToFront("a");
        deque.addToBack("b");
        deque.clear();
        assertTrue(deque.isEmpty());
    }


    /**
     * testing the to String method
     */
/**
 * void: Describe the method's purpose here.
 */
    public void testToStirng() {
        Lab08Deque<Integer> deque2 = new Lab08Deque<Integer>();
        deque2.addToFront(1);
        deque2.addToFront(2);
        deque2.addToFront(3);
        deque2.addToFront(4);

        String expect = "[4, 3, 2, 1]";
        String acutal = deque2.toString();

        assertEquals(expect, acutal);

    }


    /**
     * test for removeSecond
     * for a deque with less than 2 elements
     */
/**
 * void: Describe the method's purpose here.
 */
    public void testRemoveSecondLessThanTwoElements() {
        Exception exception = null;
        try {
            deque.removeSecond();
            fail("removeSecond() is not throwing an exception when it should");
        }
        catch (Exception e) {
            exception = e;
        }
        assertTrue("removeSecond() is throwing the wrong type of exception",
            exception instanceof EmptyQueueException);
    }


    /**
     * test for removeSecond
     * for a deque with exactly 2 elements
     */
/**
 * void: Describe the method's purpose here.
 */
    public void testRemoveSecondTwoElements() {
        deque.addToBack("A");
        deque.addToBack("B");
        assertEquals("B", deque.removeSecond());
        assertEquals(1, deque.size());
        assertEquals("A", deque.getFront());
        assertEquals("A", deque.getBack());
    }


    /**
     * test for removeSecond
     * for a deque with more than 2 elements
     */
/**
 * void: Describe the method's purpose here.
 */
    public void testRemoveSecondMoreThanTwoElements() {
        deque.addToBack("A");
        deque.addToBack("B");
        deque.addToBack("C");
        assertEquals("B", deque.removeSecond());
        assertEquals(2, deque.size());
        assertEquals("A", deque.getFront());
        assertEquals("C", deque.getBack());
    }


    /**
     * test for removeSecondToLast
     * for a deque with less than 2 elements
     */
/**
 * void: Describe the method's purpose here.
 */
    public void testRemoveSecondToLastLessThanTwoElements() {
        Exception exception = null;
        try {
            deque.removeSecondToLast();
            fail("removeSecondToLast() is not "
                + "throwing an exception when it should");
        }
        catch (Exception e) {
            exception = e;
        }
        assertTrue(
            "removeSecondToLast() is throwing the wrong type of exception",
            exception instanceof EmptyQueueException);
    }


    /**
     * test for removeSecondToLast
     * for a deque with exactly 2 elements
     */
/**
 * void: Describe the method's purpose here.
 */
    public void testRemoveSecondToLastTwoElements() {
        deque.addToBack("A");
        deque.addToBack("B");
        assertEquals("B", deque.removeSecondToLast());
        assertEquals(1, deque.size());
        assertEquals("A", deque.getFront());
        assertEquals("A", deque.getBack());
    }


    /**
     * test for removeSecondToLast
     * for a deque with more than 2 elements
     */
/**
 * void: Describe the method's purpose here.
 */
    public void testRemoveSecondToLastMoreThanTwoElements() {
        deque.addToBack("A");
        deque.addToBack("B");
        deque.addToBack("C");
        assertEquals("B", deque.removeSecondToLast());
        assertEquals(2, deque.size());
        assertEquals("A", deque.getFront());
        assertEquals("C", deque.getBack());
    }

}
