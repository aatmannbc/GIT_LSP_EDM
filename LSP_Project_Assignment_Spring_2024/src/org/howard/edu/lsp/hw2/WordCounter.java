package org.howard.edu.lsp.hw2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        try {
            // Print the current working directory
            System.out.println("Current Working Directory: " + System.getProperty("user.dir"));

            // Use a relative path to the file
            File myObj = new File("words.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

