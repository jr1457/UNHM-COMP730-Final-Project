import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTesting {

	// Tester for getter and setter method of Read class.
	@Test
	public void testSetterGetter() {
		Read r1 = new Read();
		r1.setFileName("contents.txt");
		assertEquals("contents.txt", r1.getFileName());
	}
	
	// Tester for parameterized constructor of Read class.
	@Test
	public void testConstructor() {
		Read r1 = new Read("contents.txt");
		assertEquals("contents.txt", r1.getFileName());
	}
	
	// Tester for readFromFile() of Read class.
	@Test
	public void testReadFromFile() {
		Read r1 = new Read();
		r1.setFileName("contents.txt");
		String s = r1.readFromFile();
		assertEquals("Hello\r\n" + "This is a sample text file", s);
	}
}
