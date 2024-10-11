/**
 * The Literature class represents a general concept of literary works.
 * It is an abstract class that defines a contract for all subclasses to implement the method for retrieving the title of the literary work.
 * Subclasses such as Novel, ComicBook, and Magazine must provide their own implementation of the {@code getTitle()} method.
 */
public abstract class Literature {

    /**
     * Retrieves the title of the literary work.
     * This method must be implemented by any class that extends the Literature class.
     *
     * @return The title of the literary work.
     */
    public abstract String getTitle();
}
