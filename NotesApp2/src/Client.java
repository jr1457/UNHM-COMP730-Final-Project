
public class Client {
	// Set the declared instance variable of the NoteBuilder class to null.
	private NoteBuilder note = null;

	private String input;
	private String userData;
	
	public Client(String input, String userData) {
		// Set the private instance variables, input and user data to the values passed as parameters.
		this.input = input;
		this.userData = userData;
	}

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

	public String getNoteName() {
		// Get the name of the note.
		return note.getNoteName();
	}

	public String getNoteData() {
		// Get the data of the note.
		return note.getNoteData();
	}
}
