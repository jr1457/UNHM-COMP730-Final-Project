import java.io.File;
/**
 * The delete class deletes a file. It is not specific on file type, it deletes file from fileName.
 * The delete confirmation occurs in Frame1 with JOptionPane.showConfirmDialog
 * @author Jonathan
 *
 */
public class DeleteNote {
	public static void main(String fileName) {
		// Creates new file object with the name from fileName
		File file = new File(fileName);
		// Simple if statement that deletes the file when invoked, else prints an error.
		if (file.delete()) {
			  System.out.println("Deleted the file: ");
		} else {
			System.out.println("Failed to delete file");
		}
	}
}
