public class CreateNoteClient {
    private Note note = null;
    public void build() {
        note = new Note.Builder()
            .setNoteName(null)
            .setNoteContent(null)
            .build();
    }
}