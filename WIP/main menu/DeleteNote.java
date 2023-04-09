import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class DeleteNote {
    public static void main(String[] args) {
        Scanner noteScanner = new Scanner(System.in);
        String fileName;
        System.out.println("Enter a file name to delete");

        fileName = noteScanner.nextLine();
        System.out.println("The note file name that will be deleted is " + fileName);

       
        File myNote = new File(fileName + ".txt");
        if (myNote.delete()) {
            System.out.println("File delete: " + myNote.getName());
        } else {
            System.out.println("File does not exist.");
        }

        // NOT NEEDED PROBABLY
        // Scanner noteDataScanner = new Scanner(System.in);
        // String noteDataInput;
        // System.out.println("Enter note data:");
        
        // noteDataInput = noteDataScanner.nextLine();
        // System.out.println("Note data inputted");

        // FileWriter myNoteWriter = new FileWriter(myNote);
        // myNoteWriter.write(noteDataInput);
        // myNoteWriter.close();


        /* try {
            Scanner noteDataScanner = new Scanner(System.in);
            String noteDataInput;
            System.out.println("Enter note data:");
            
            noteDataInput = noteDataScanner.nextLine();
            System.out.println("Note data inputted");

            FileWriter myNoteWriter = new FileWriter(myNote);
            myWriter.write(noteDataInput);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } */
        
    }
    
}