

public class Book
{
   private String title;
   private String author;
   private int pages;
   private boolean translation;
   //private double price;
   
   public Book () {
       title = "Kaas";
       author = "Willem Elsschot";
       pages = 136;
       translation = false;       
    
    }
    
    public Book (String bookTitle, String bookAuthor, int bookPages,
    boolean bookTranslation) {
        title = bookTitle;
        author = bookAuthor;
        pages = bookPages;
        translation = bookTranslation;
        
    }
    
    public Book(String title, String author, int pages) {
        translation = false;
         
        
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String bookTitle) {
        title = bookTitle;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String bookAuthor) {
        author = bookAuthor;
    }
    
    public int getPages(){
        return pages;
    }
    
    public void setPages(int bookPages){
        pages = bookPages;
    }
    
    public boolean isTranslation(){
        return translation;
    }
    
    public void setTranslation(boolean bookTranslation){
        translation = bookTranslation;
    }
   
    public boolean isLongRead() {
        if (pages > 200) {
            return true;
        }
        return false;
    }
    
    public double getPrice() {
         double price;
        
        if(isLongRead() == true) {
            price = 25.9;
                    
        } 
        else {
        price = 15.9;
       
    }
     return price;
    }
    
    public void printInfo() {
        
        if (translation == true){
          System.out.println(title + ", " + author + ", " + pages + 
          " paggina's (vertaald)" + " - " + getPrice() + "€")  ;
           
        }
        else{
        System.out.println(title + ", " + author + ", " + pages +
        " paggina's" + " - " + getPrice() + "€")  ;
    }
    }
    
    
    
}
