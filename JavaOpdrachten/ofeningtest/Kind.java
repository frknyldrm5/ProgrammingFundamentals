/**
 * Write a description of class Kind here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kind
{
    // instance variables - replace the example below with your own
    private int leeftijd;
    private String naam;
    private String Baby;

    /**
     * Constructor for objects of class Kind
     */
    public Kind()
    {
        // initialise instance variables
        naam = "onbekend";
        leeftijd = 0;
    }
    public Kind(String kindNaam, int kindLeeftijd){
        naam = kindNaam;
        leeftijd = kindLeeftijd;
    }
    public void setLeeftijd(int nieuweLeeftijd){
        leeftijd = nieuweLeeftijd;
    }
    
    public void setNaam(String nieuweNaam){
        naam = nieuweNaam;
    }
    
    public String getNaam(){
        return naam;
    }
    
    public int getLeeftijd(){
        return leeftijd;
    }
    
    public boolean isBaby(){
        if (leeftijd < 3){
            return  true;
        }
        else{
            return  false;
        }
    }
    public void drukAf(){
        if (leeftijd < 13){
            System.out.println( naam );
            System.out.println( leeftijd );

        }
        else{
            System.out.println("Dit is geen kind.");
        }
    }

}