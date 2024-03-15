package org.howard.edu.lsp.midterm.question1;

/**
 * SecurityOps class provides a method for encrypting text by separating letters and digits from other characters
 * and then reordering the letters and digits based on their even or odd position.
 */
public class SecurityOps {

    /**
     * Encrypts a given string by performing the following steps:
     * 1. Filters out non-alphanumeric characters (letters and digits).
     * 2. Reorders the filtered characters by appending even-indexed characters first, followed by odd-indexed characters.
     * 
     * @param message The string to be encrypted.
     * @return The encrypted string.
     */
    public static String encrypt(String message) {
        StringBuilder filteredText = new StringBuilder();
        StringBuilder encryptedText = new StringBuilder();

        for (char c : message.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filteredText.append(c);
            }
        }

        for (int i = 0; i < filteredText.length(); i += 2) {
            encryptedText.append(filteredText.charAt(i));
        }
        for (int i = 1; i < filteredText.length(); i += 2) {
            encryptedText.append(filteredText.charAt(i));
        }

        return encryptedText.toString();
    }
}
