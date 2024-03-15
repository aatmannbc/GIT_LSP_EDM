package org.howard.edu.lsp.midterm.question2;

import org.w3c.dom.DOMException;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.Node;
import org.w3c.dom.ranges.Range;
import org.w3c.dom.ranges.RangeException;

public class IntegerRange implements Range {

    private final int lowerBound;
    private final int upperBound;

    /**
     * Constructs an IntegerRange with the specified lower and upper bounds.
     * 
     * @param lowerBound The lower bound (inclusive).
     * @param upperBound The upper bound (inclusive).
     * @throws IllegalArgumentException if lowerBound is greater than upperBound.
     */
    public IntegerRange(int lowerBound, int upperBound) {
        if (lowerBound > upperBound) {
            throw new IllegalArgumentException("Lower bound cannot be greater than upper bound.");
        }
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    /**
     * Checks if the given value is within the range (inclusive).
     * 
     * @param value The value to check.
     * @return True if the value is within the range, false otherwise.
     */
    public boolean contains(int value) {
        return value >= lowerBound && value <= upperBound;
    }

    /**
     * Checks if this range overlaps with another range.
     * 
     * @param other The other range to compare with.
     * @return True if there's at least one value in common, false otherwise.
     */
    public boolean overlaps(Range other) {
        // Check if this range's lower bound is less than other's upper bound
        // and this range's upper bound is greater than other's lower bound
        return this.lowerBound <= ((IntegerRange) other).upperBound() && this.upperBound >= ((IntegerRange) other).lowerBound();
    }

    /**
     * Calculates the size of the range (number of integers within).
     * 
     * @return The size of the range.
     */
    public int size() {
        return upperBound - lowerBound + 1; // Add 1 for inclusive upper bound
    }

    /**
     * Gets the lower bound of the range.
     * 
     * @return The lower bound.
     */
    public int lowerBound() {
        return lowerBound;
    }

    /**
     * Gets the upper bound of the range.
     * 
     * @return The upper bound.
     */
    public int upperBound() {
        return upperBound;
    }

    /**
     * Checks if two IntegerRange objects are equal.
     * 
     * @param obj The object to compare with.
     * @return True if both objects have the same lower and upper bounds.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntegerRange) {
            IntegerRange other = (IntegerRange) obj;
            return lowerBound == other.lowerBound && upperBound == other.upperBound;
        }
        return false;
    }

    /**
     * Generates a hash code based on the lower and upper bounds.
     * 
     * @return The hash code for this object.
     */
    @Override
    public int hashCode() {
        return 31 * lowerBound + upperBound;
    }

    /**
     * Returns a string representation of the range in the format "[lowerBound, upperBound]".
     * 
     * @return The string representation of the range.
     */
    @Override
    public String toString() {
        return "[" + lowerBound + ", " + upperBound + "]";
    }

	@Override
	public Node getStartContainer() throws DOMException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getStartOffset() throws DOMException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Node getEndContainer() throws DOMException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getEndOffset() throws DOMException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getCollapsed() throws DOMException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Node getCommonAncestorContainer() throws DOMException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setStart(Node refNode, int offset) throws RangeException, DOMException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEnd(Node refNode, int offset) throws RangeException, DOMException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStartBefore(Node refNode) throws RangeException, DOMException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStartAfter(Node refNode) throws RangeException, DOMException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEndBefore(Node refNode) throws RangeException, DOMException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEndAfter(Node refNode) throws RangeException, DOMException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void collapse(boolean toStart) throws DOMException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectNode(Node refNode) throws RangeException, DOMException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectNodeContents(Node refNode) throws RangeException, DOMException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public short compareBoundaryPoints(short how, Range sourceRange) throws DOMException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteContents() throws DOMException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DocumentFragment extractContents() throws DOMException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DocumentFragment cloneContents() throws DOMException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertNode(Node newNode) throws DOMException, RangeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surroundContents(Node newParent) throws DOMException, RangeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Range cloneRange() throws DOMException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void detach() throws DOMException {
		// TODO Auto-generated method stub
		
	}
}