public class Book
{
    
    private String title;
    private String author;
    private int pages;
    private boolean translation;
    
    
    private int price;

    public Book(){
      title="Kaas";
      author="Willem Elsschot";
      pages=136;
      translation=false;
    }
    
    public Book(String newTitle,String newAuthor,int newPages,boolean newTranslation){
        title=newTitle;
        author=newAuthor;
        pages=newPages;
        translation=newTranslation;
        
    }
    
    public Book(String title,String author,int pages){
        
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String newTitle){
        title=newTitle;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public void setAuthor(String newAuthor){
        author=newAuthor;
    }
    
    public int getPages(){
        return pages;
    }
    
    public void setPages(int newPages){
        pages=newPages;
    }
    
    public boolean isTranslation(){
        return translation;
    }
    
    public void setTranslation(boolean newTranslation){
        translation=newTranslation;
    }
    
    public boolean isLongRead(){
        if (pages>200){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void getPrice(boolean isLongRead,double price){
       
        
        if (isLongRead==true) {
           price=25.9;  
           
       }
       else{
           price=15.9;
       }
    }
    
   
    // public double getPrice(){
        // return price;
    // }
    
    public void printInfo(){
        if (translation==false){
            System.out.println(title + "(" + author + ")," + pages + "pagina's  -  " + price + "€" );
        }
        else{
            System.out.println(title + "," + author +"," + pages + "pagina's (vertaald) -  " + price + "€");
        }
    }
    
    
    
}
