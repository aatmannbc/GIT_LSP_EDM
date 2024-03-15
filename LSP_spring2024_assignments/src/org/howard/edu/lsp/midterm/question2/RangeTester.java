package org.howard.edu.lsp.midterm.question2;
public class RangeTester {

    public static void main(String[] args) {
        // Create some IntegerRange objects
        IntegerRange range1 = new IntegerRange(5, 10);
        IntegerRange range2 = new IntegerRange(8, 12);
        IntegerRange range3 = new IntegerRange(2, 4);

        // Test contains method
        System.out.println("range1 contains 7: " + range1.contains(7)); // Output: true
        System.out.println("range2 contains 15: " + range2.contains(15)); // Output: false

        // Test overlaps method
        System.out.println("range1 overlaps range2: " + range1.overlaps(range2)); // Output: true
        System.out.println("range1 overlaps range3: " + range1.overlaps(range3)); // Output: false (no common values)

        // Test size method
        System.out.println("Size of range1: " + range1.size()); // Output: 6 

        // Test equals method
        IntegerRange sameRange1 = new IntegerRange(5, 10);
        System.out.println("range1 equals sameRange1: " + range1.equals(sameRange1)); // Output: true
        System.out.println("range1 equals range2: " + range1.equals(range2)); // Output: false (different bounds)
    }
}
