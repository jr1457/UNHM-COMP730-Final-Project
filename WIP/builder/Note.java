public class Note {
    private String noteName;
    private String noteContents;

    public Note(String noteName, String noteContents) {
        this.noteName = noteName;
        this.noteContents = noteContents;
    }

    public static class Builder {
        private String noteName;
        private String noteContents;

        public Builder() {}
        public Builder setNoteName(String noteName) {
            this.noteName = noteName;
            return this;
        }
        public Builder setNoteContent(String noteContents) {
            this.noteContents = noteContents;
            return this;
        }

        public Note build() {
            return new Note(noteName, noteContents);
        }
    }

    public String getNoteName() {
        return noteName;
    }

    public String getNoteContents() {
        return noteContents;
    }
}