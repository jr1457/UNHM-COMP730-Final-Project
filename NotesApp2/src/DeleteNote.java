import java.io.File;
public class DeleteNote {
	public static void main(String fileName) {
		File file = new File(fileName);
		if (file.delete()) {
			  System.out.println("Deleted the file: ");
		} else {
			System.out.println("Failed to delete file");
		}
	}
}
