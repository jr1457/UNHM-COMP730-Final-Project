import java.io.File;
import static org.junit.Assert.*;
import org.junit.Test;

public class DeleteNoteTest {

	@Test
	public void test() {
		String testNoteName = "test";
		String testNoteData = "hello world";
		Client client = new Client(testNoteName, testNoteData);
		client.buildImmediately();
		CreateNote.create(client);
		
		DeleteNote.main(testNoteName);
		File file = new File("test");
		assertFalse(file.exists());
		
	}

}
