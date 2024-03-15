package org.howard.edu.lsp.midterm.question2;

public class RangeTester {

    public static void main(String[] args) {
        // Create several IntegerRange instances representing different value sets
        IntegerRange numberSet1 = new IntegerRange(5, 10);
        IntegerRange numberSet2 = new IntegerRange(8, 12);
        IntegerRange numberSet3 = new IntegerRange(2, 4);

        // Verify the contains method functionality
        System.out.printf("Does the number set 1 include 7? %b\n", numberSet1.contains(7)); // Output: true
        System.out.printf("Does the number set 2 include 15? %b\n", numberSet2.contains(15)); // Output: false

        // Verify the overlaps method functionality
        System.out.printf("Do number set 1 and number set 2 overlap? %b\n", numberSet1.overlaps(numberSet2)); // Output: true
        System.out.printf("Do number set 1 and number set 3 overlap? %b\n", numberSet1.overlaps(numberSet3)); // Output: false (no shared values)

        // Verify the size method functionality
        System.out.println("Size of number set 1: " + numberSet1.size()); // Output: 6 

        // Verify the equals method functionality
        IntegerRange duplicateSet1 = new IntegerRange(5, 10);
        System.out.printf("Is number set 1 equal to duplicate set 1? %b\n", numberSet1.equals(duplicateSet1)); // Output: true
        System.out.printf("Is number set 1 equal to number set 2? %b\n", numberSet1.equals(numberSet2)); // Output: false (different boundaries)
    }
}
