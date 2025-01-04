package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RecordBook {
    File recordBook = new File("recordBook.txt");

    public void createFile() {
        try {
            if (recordBook.createNewFile()) {
                System.out.println("File created: " + recordBook.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file...");
        }
    }

    public void addDataToFile(StudentDetails studentDetails) {
        try {
            //append – boolean if true,
            // then data will be written to the end of the file rather than the beginning.
            FileWriter fileWriter = new FileWriter("recordBook.txt", true);
            fileWriter.write((studentDetails.toString() + "\n"));
            fileWriter.close();
            System.out.println("Successfully added student data in the recordBook.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file...");
        }
    }

    public void emptyDataFromFile() {
        try {
            FileWriter fileWriter = new FileWriter("recordBook.txt");
            fileWriter.write("");
            fileWriter.close();
            System.out.println("File is cleared!!!");
        } catch (IOException e) {
            System.out.println("An error occurred while clearing the file...");
        }
    }

    public void readFile() {
        try {
            Scanner reader = new Scanner(recordBook);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file... No File Found");
        }
    }

    public void deleteFile() {
        if (recordBook.delete()) {
            System.out.println("The deleted file is : " + recordBook.getName());
        } else {
            System.out.println("An error occurred while deleting the file...");
        }
    }
}
