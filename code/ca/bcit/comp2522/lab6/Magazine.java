package ca.bcit.comp2522.lab6;

/**
 * The Magazine class represents a magazine, which is a type of literature.
 * It extends the Literature class and provides specific implementations for
 * getting the title and year published of the magazine.
 *
 * @author Yuho Lim
 * @author Daniil Yarygin
 * @author Kyle Lau
 * @author Gem Baojimin Sha
 * @version 1.0
 */
public class Magazine extends Literature
{
    private final String title;
    private final int    yearPublished;

    /**
     * Constructs a new Magazine with the specified title and year published.
     *
     * @param title         The title of the magazine.
     * @param yearPublished The year the magazine was published.
     */
    public Magazine(final String title,
                    final int yearPublished)
    {
        this.title = title;
        this.yearPublished = yearPublished;
    }

    /**
     * Retrieves the title of the magazine.
     *
     * @return The title of the magazine.
     */
    @Override
    public String getTitle()
    {
        return title;
    }

    /**
     * Retrieves the year the magazine was published.
     *
     * @return The year the magazine was published.
     */
    @Override
    public int getYearPublished()
    {
        return yearPublished;
    }
}