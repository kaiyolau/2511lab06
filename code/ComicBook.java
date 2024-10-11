/**
 * The ComicBook class represents a comic book, which is a type of literature.
 * It extends the Literature class and provides a specific implementation for getting the title of the comic book.
 */
public class ComicBook extends Literature {

    // The title of the comic book
    private String title;

    /**
     * Constructs a new ComicBook with the specified title.
     *
     * @param title The title of the comic book.
     */
    public ComicBook(String title) {
        this.title = title;
    }

    /**
     * Retrieves the title of the comic book.
     *
     * @return The title of the comic book.
     */
    @Override
    public String getTitle() {
        return title;
    }
}
