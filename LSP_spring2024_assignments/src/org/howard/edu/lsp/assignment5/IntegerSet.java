package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.howard.edu.lsp.assignment5.IntegerSet;
import org.howard.edu.lsp.assignment5.IntegerSet.IntegerSetException;

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
	public class IntegerSetException extends Exception{
		public IntegerSetException() {
			// print out the exception message
			super("The set is empty"); 	
		}
	}

    /**
     * Returns the largest element in the set.
     *
     * @throws EmptySetException if the set is empty.
     * @return The largest element.
     */
    public int largest() throws IntegerSetException {
		int size = size();
		if (size==0) {
			throw(new IntegerSetException());
		}
        return Collections.max(elements);
    }

    /**
     * Returns the smallest element in the set.
     *
     * @throws EmptySetException if the set is empty.
     * @return The smallest element.
     */
    public int smallest() throws IntegerSetException {
		int size = size();
		if (size==0) {
			throw(new IntegerSetException());
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
    	if (elements.contains(item)) {
    		elements.remove((Integer) item);
      }
  };
        /**
         * Checks if two sets are equal (contain the same elements).
         *
         * @param otherSet The other set to compare with.
         * @return True if the sets are equal, false otherwise.
         */
        public boolean equals(IntegerSet otherSet) {
            if (size() != otherSet.size()) {
                return false;
            }
            for (int element : elements) {
                if (!otherSet.contains(element)) {
                    return false;
                }
            }
            return true;
        }

        /**
         * Performs the union operation on two sets, returning a new set with the combined elements.
         * Does not modify the calling set.
         *
         * @param otherSet The other set to perform the union with.
         * @return A new set containing the union of the elements.
         */
        public void union(IntegerSet otherSet) {
        	elements.addAll(otherSet.elements);
        }

        /**
         * Performs the intersection operation on two sets, returning a new set with the common elements.
         * Does not modify the calling set.
         *
         * @param otherSet The other set to perform the intersection with.
         * @return A new set containing the intersection of the elements.
         */ 
    	public void intersect(IntegerSet otherSet) {
    		ArrayList<Integer> newList = new ArrayList<Integer>();
    		for(int i = 0; i < otherSet.elements.size(); i++) {
    			if(contains(otherSet.elements.get(i))) {
    				newList.add(otherSet.elements.get(i));
    			}
    		}
    		
    		elements = newList;
    	};

    	
        /**
         * Performs the difference operation on two sets, returning a new set with elements in the calling set
         * that are not present in the other set. Does not modify the calling set.
         *
         * @param otherSet The other set to perform the difference with.
         * @return A new set containing the difference of the elements.
         */
        public void diff(IntegerSet anothersetb) {
            elements.removeAll(anothersetb.elements);
        };

        /**
         * Performs the complement operation on a set, returning a new set containing all integers
         * not present in the calling set.
         *
         * @return A new set containing the complement of the elements.
         */
        public void complement(IntegerSet intSetb) {
        	elements.removeAll(intSetb.elements);
        };

        /**
         * Returns a string representation of the set in curly braces, with elements separated by commas.
         *
         * @return A string representation of the set.
         */
    	public String toString() {
    		// return String representation of your set
    		return elements.toString();
    	};	
    }
