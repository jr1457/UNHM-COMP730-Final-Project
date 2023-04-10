import java.util.Scanner;

import javax.xml.crypto.Data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Path;
import java.nio.file.Paths;

class UpdateNote {
    public static void main(String[] args) {
        Scanner noteScanner = new Scanner(System.in);
        String fileName;
        System.out.println("Enter a file name to update");

        fileName = noteScanner.nextLine();
        System.out.println("The note file name to be updated is " + fileName);

        Scanner appendScanner = new Scanner(System.in);
        String appendData;
        System.out.println("Enter additional note data: ");
        appendData = appendScanner.nextLine();

        Path filePath = Paths.get(fileName, args);


        try {
            String content = Files.readString(filePath);
            String output;
            output = content + " " + appendData;
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(output);
            myWriter.close();

            System.out.println("Written to file.");
            

        } catch (IOException e) {
            System.out.println("An error has occured");
            e.printStackTrace();
        }
        
    }


    // https://www.w3schools.com/java/java_files_read.asp
    // https://java2blog.com/convert-string-to-path-java/
    // https://stackoverflow.com/questions/326390/how-do-i-create-a-java-string-from-the-contents-of-a-file
}