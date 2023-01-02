
/**
 * class Book - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Boek
{
    private Persoon author;
    private String title;
    private String ISBN;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Boek(Persoon bookAuthor, String bookTitle, String bookISBN)
    {
        author = bookAuthor;
        title = bookTitle;
        ISBN = bookISBN;
    }
    
    public void setAuthor(Persoon bookAuthor) {
        author = bookAuthor;
    }
    
    public Persoon getAuthor() {
        return author;
    }
    
    public void setTitle(String bookTitle) {
        title = bookTitle;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setISBN(String bookISBN) {
        ISBN = bookISBN;
    }
    
    public String getISBN() {
        return ISBN;
    }
    
    public String toString() {
        return title + " (" + ISBN + "), " + author;
    }
}
