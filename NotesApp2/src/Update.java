import javax.xml.crypto.Data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Path;
import java.nio.file.Paths;
/**
 * The update class updates a files contents by appending new data specified by the user.
 * 
 * @author James
 *
 */
public class Update {
	/**
	 * 
	 * @param input - The file name specified.
	 * @param userData - the data to append to the file.
	 */
	
	public static void main(String input, String userData) {
		String fileName = input;
		String appendData = userData;
		// The user specified inputs are fileName and appendData which are passed from Frame1.
		Path filePath = Paths.get(fileName);
		// The file path of the specified file name is obtained with Paths.get().
		// A Try Catch statement is used to handle IO exception errors.
		try {
			// The string content reads the file.
			String content = Files.readString(filePath);
			// The string output is initialized.
			String output;
			// The output data is concatenated with the append data.
			output = content + " " + appendData;
			// A new file writer object is created.
			FileWriter myWriter = new FileWriter(fileName);
			// The file is written to.
			myWriter.write(output);
			// The file is closed
			myWriter.close();
			// Print to console that file was written.
			System.out.println("Written to file.");
			
		} catch (IOException e) {
			// If an error occurs, it is printed to the console.
			System.out.println("An error has occured");
            e.printStackTrace();
		}
	}
}
