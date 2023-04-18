
public class NoteBuilder {
	private String noteName;
	private String noteData;
	
	public NoteBuilder() { }
	public static class Params {
		public String noteName;
		public String noteData;
		
		public void apply(NoteBuilder notebuilder) {
			notebuilder.noteName = this.noteName;
			notebuilder.noteData = this.noteData;
		}
	}
	
    public static class Builder {
        private final Params params;
        public Builder() { params = new Params(); }
        
        public Builder setNoteName(String noteName) {
            params.noteName = noteName;
            return this;
        }
        
        public Builder setNoteData(String noteData) {
            params.noteData = noteData;
            return this;
        }
        
        public NoteBuilder build() {
            NoteBuilder notebuilder = new NoteBuilder();
            params.apply(notebuilder);
            return notebuilder;
        }
	
    }
	public String getNoteName() {
		return noteName;
		}
	
	public String getNoteData() {
		return noteData;
		}
}