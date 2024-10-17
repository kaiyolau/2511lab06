package ca.bcit.comp2522.lab6;

/**
 * The Literature class represents a general concept of literary works.
 * It is an abstract class that defines a contract for all subclasses to implement methods for retrieving the title and year published of the literary work.
 * Subclasses such as Novel, ComicBook, and Magazine must provide their own implementation of the {@code getTitle()} and {@code getYearPublished()} methods.
 *
 * @author Yuho Lim
 * @author Daniil Yarygin
 * @author Kyle Lau
 * @author Gem Baojimin Sha
 * @version 1.0
 */
public abstract class Literature
{
    /**
     * Retrieves the title of the literary work.
     * This method must be implemented by any class that extends the Literature class.
     *
     * @return The title of the literary work.
     */
    public abstract String getTitle();

    /**
     * Retrieves the year the literary work was published.
     * This method must be implemented by any class that extends the Literature class.
     *
     * @return The year the literary work was published.
     */
    public abstract int getYearPublished();
}