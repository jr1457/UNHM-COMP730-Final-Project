/**
 * 
 * The Client class provides an interface to access properties from the NoteBuilder class
 * by encapsulating the NoteBuilder object.
 * 
 * @author Jonathan and Eshwar
 *
 */
public class Client {
	// Set the declared instance variable of the NoteBuilder class to null.
	private NoteBuilder note = null;

	private String input;
	private String userData;
	
	/**
	 * This public constructor creates a Client object that has the file name and data.
	 * @param input The file name.
	 * @param userData The data of the file.
	 */
	public Client(String input, String userData) {
		// Set the private instance variables, input and user data to the values passed as parameters.
		this.input = input;
		this.userData = userData;
	}

	/**
 	 * This method creates a NoteBuilder object and sets the file name and data.
	 */
	public void buildImmediately() {
		// Creates a new NoteBuilder object, using a method from the NoteBuilder class.
		note = new NoteBuilder.Builder()
			// Sets the NoteName with the value of input instance variable.
			.setNoteName(input)
			// sets the NoteData with the value of userData instance variable.
			.setNoteData(userData)
			// Builds the note object.
			.build();
	}

	/**
	 * Get the name of the file.
	 * @return String type file name.
	 */
	public String getNoteName() {
		// Get the name of the note.
		return note.getNoteName();
	}

	/**
	 * Getter to the data of the file.
	 * @return String type file data.
	 */
	public String getNoteData() {
		// Get the data of the note.
		return note.getNoteData();
	}
}
