import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * The CreateNote class creates a new .txt file and checks if it already exists.
 * The note data provided by the client, is written to the note file.
 * 
 * @author James, Eshwar, Jonathan
 *
 */

public class CreateNote {
	/**
	 * This static method writes the given client data onto the specified file by the given client.
	 * @param client The client specifies the file name and data to be written.
	 */
	public static void create(Client client) {

		try {
			// Creates a new file object with the note name, provided by the client and adds the .txt extension.
			File myNote = new File(client.getNoteName());
	
			if (myNote.createNewFile()) {
				System.out.println("File created: " + myNote.getName());
			} else {
				System.out.println("File already exists");
			}
			// Create a new file writer object for the note file.
			FileWriter myNoteWriter = new FileWriter(myNote);
			// Write the note data provided by the client to the note file.
			myNoteWriter.write(client.getNoteData());
			myNoteWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
