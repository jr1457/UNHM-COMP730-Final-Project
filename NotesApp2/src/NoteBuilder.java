/**
 * The note builder follows the builder design pattern. It creates a note using 
 * @author Jonathan
 *
 */
public class NoteBuilder {
	// Create two private strings to hold note name and data
	private String noteName;
	private String noteData;
	// NoteBuilder class to hold params
	public NoteBuilder() { }
	public static class Params {
		public String noteName;
		public String noteData;
		
		public void apply(NoteBuilder notebuilder) {
			notebuilder.noteName = this.noteName;
			notebuilder.noteData = this.noteData;
		}
	}
	// Builder class to build note by params
    public static class Builder {
        private final Params params;
        public Builder() { params = new Params(); }
        //setter for setting note name
        public Builder setNoteName(String noteName) {
            params.noteName = noteName;
            return this;
        }
        //setter for setting note data
        public Builder setNoteData(String noteData) {
            params.noteData = noteData;
            return this;
        }
        // build method to build note
        public NoteBuilder build() {
            NoteBuilder notebuilder = new NoteBuilder();
            params.apply(notebuilder);
            return notebuilder;
        }
	
    }
    // method to return note name
	public String getNoteName() {
		return noteName;
		}
	// method to return note data
	public String getNoteData() {
		return noteData;
		}
}