import static org.junit.Assert.*;

import org.junit.Test;


public class CreateNoteTest {

	@Test
	public void test() {
		String testNoteName = "test.txt";
		String testNoteData = "hello world";
		Client client = new Client(testNoteName, testNoteData);
		client.buildImmediately();
		CreateNote.create(client);
		
		Read r = new Read("test.txt");
		String contents = r.readFromFile();
		assertEquals(contents, testNoteData);
		//fail("Not yet implemented");
	}

}
