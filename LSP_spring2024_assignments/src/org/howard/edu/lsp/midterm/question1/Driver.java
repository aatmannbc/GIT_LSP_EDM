package org.howard.edu.lsp.midterm.question1;
/**
 * Driver class to demonstrate the usage of the SecurityOps class for text encryption.
 */
public class Driver {

    /**
     * Main method that encrypts two sample messages and prints the results.
     * 
     * @param args Command-line arguments (unused).
     */
    public static void main(String[] args) {
        String originalMessage = "I love CSCI363";
        System.out.println("Original message: " + originalMessage + ", Encrypted message: " + SecurityOps.encrypt(originalMessage));

        originalMessage = "This class is super fun";
        System.out.println("\nOriginal message: " + originalMessage + ", Encrypted message: " + SecurityOps.encrypt(originalMessage));
    }
}
