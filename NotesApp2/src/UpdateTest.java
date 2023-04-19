import static org.junit.Assert.*;

import org.junit.Test;

public class UpdateTest {

	@Test
	public void test() {
		String input = "test.txt";
		String userData = "hello world";
		
		String updateData = "have a good day";
		String testUpdateData = "hello world have a good day";
		
		Client client = new Client(input, userData);
		client.buildImmediately();
		CreateNote.create(client);
		
		Update.main(input, updateData);
		
		Read r = new Read("test.txt");
		String contents = r.readFromFile();
		assertEquals(contents, testUpdateData);
	}

}
