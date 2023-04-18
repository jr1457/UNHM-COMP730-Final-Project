import javax.xml.crypto.Data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Update {
	public static void main(String input, String userData) {
		String fileName = input;
		String appendData = userData;
		
		Path filePath = Paths.get(fileName);
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
}
