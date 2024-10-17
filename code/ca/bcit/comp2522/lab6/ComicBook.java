package ca.bcit.comp2522.lab6;

/**
 * The ComicBook class represents a comic book, which is a type of literature.
 * It extends the Literature class and provides specific implementations for
 * getting the title and year published of the comic book.
 *
 * @author Yuho Lim
 * @author Daniil Yarygin
 * @author Kyle Lau
 * @author Gem Baojimin Sha
 * @version 1.0
 */
public class ComicBook extends Literature
{
    private final String title;
    private final int    yearPublished;

    /**
     * Constructs a new ComicBook with the specified title and year published.
     *
     * @param title         The title of the comic book.
     * @param yearPublished The year the comic book was published.
     */
    public ComicBook(final String title,
                     final int yearPublished)
    {
        this.title = title;
        this.yearPublished = yearPublished;
    }

    /**
     * Retrieves the title of the comic book.
     *
     * @return The title of the comic book.
     */
    @Override
    public String getTitle()
    {
        return title;
    }

    /**
     * Retrieves the year the comic book was published.
     *
     * @return The year the comic book was published.
     */
    @Override
    public int getYearPublished()
    {
        return yearPublished;
    }
}