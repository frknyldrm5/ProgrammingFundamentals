
/**
 * Write a description of class Kind here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kind
{
    private String naam;
    private int leeftijd;


    public  Kind()
    {
        naam = "onbekend";
        leeftijd = 0;
        
    }   
    public Kind (String kindNaam, int kindLeeftijd){
        naam = kindNaam;
        leeftijd = kindLeeftijd;
    }
    public void setNaam(String newNaam){
        this.naam = newNaam;
    
    }
    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }
    
    public String getNaam()
    {
        return naam;
    }
    public int getLeeftijd (){
        return leeftijd;
        
    }
    
    public boolean isBaby(){
        if(leeftijd <3){
            return true;
            
        }
        else {
            return false;
        }
    }
    public void drukAf(){
           if(leeftijd < 13){
               System.out.println(leeftijd);
           }
           else{
               System.out.println("Dit is geen kind.");
           }
        }
        
        
    }
    
    
    

   