package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * Class representing a set of integers.
 */
public class IntegerSet {

    /**
     * Stores the set elements.
     */
    private List<Integer> elements;

    /**
     * Default constructor that initializes an empty set.
     */
    public IntegerSet() {
        elements = new ArrayList<>();
    }

    /**
     * Constructor that initializes a set with the provided elements.
     * Ensures no duplicates are present.
     *
     * @param initialElements The initial elements for the set.
     */
    public IntegerSet(List<Integer> initialElements) {
        HashSet<Integer> uniqueElements = new HashSet<>(initialElements);
        elements = new ArrayList<>(uniqueElements);
    }

    /**
     * Removes all elements from the set.
     */
    public void clear() {
        elements.clear();
    }

    /**
     * Returns the number of elements in the set.
     *
     * @return The size of the set.
     */
    public int size() {
        return elements.size();
    }

    /**
     * Checks if the set is empty.
     *
     * @return True if the set is empty, false otherwise.
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Checks if the set contains a specific element.
     *
     * @param value The element to search for.
     * @return True if the element is present, false otherwise.
     */
    public boolean contains(int value) {
        return elements.contains(value);
    }

    /**
     * Custom exception class for empty set operations.
     */
    public static class EmptySetException extends Exception {
        public EmptySetException() {
            super("The set is empty");
        }
    }

    /**
     * Returns the largest element in the set.
     *
     * @throws EmptySetException if the set is empty.
     * @return The largest element.
     */
    public int largest() throws EmptySetException {
        if (isEmpty()) {
            throw new EmptySetException();
        }
        return Collections.max(elements);
    }

    /**
     * Returns the smallest element in the set.
     *
     * @throws EmptySetException if the set is empty.
     * @return The smallest element.
     */
    public int smallest() throws EmptySetException {
        if (isEmpty()) {
            throw new EmptySetException();
        }
        return Collections.min(elements);
    }

    /**
     * Adds an element to the set if it's not already present.
     *
     * @param item The element to add.
     */
    public void add(int item) {
        if (!contains(item)) {
            elements.add(item);
        }
    }

    /**
     * Removes an element from the set if it's present.
     *
     * @param item The element to remove.
     */
    public void remove(int item) {
        if (contains(item)) {
            elements.remove(item);
        }
    }
}
    /**
     * Performs the union operation on two sets, modifying the calling set.
     * Adds all elements from the other set that are not already present.
     *
     * @param otherSet The other set to perform the union with.
    **/
