/**
 * The Magazine class represents a magazine, which is a type of literature.
 * It extends the Literature class and provides a specific implementation for getting the title of the magazine.
 */
public class Magazine extends Literature {

    // The title of the magazine
    private String title;

    /**
     * Constructs a new Magazine with the specified title.
     *
     * @param title The title of the magazine.
     */
    public Magazine(String title) {
        this.title = title;
    }

    /**
     * Retrieves the title of the magazine.
     *
     * @return The title of the magazine.
     */
    @Override
    public String getTitle() {
        return title;
    }
}
