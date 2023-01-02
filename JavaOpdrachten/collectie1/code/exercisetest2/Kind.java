

public class Kind
{
    private String naam;
    private int leeftijd;
    
    public Kind(){
        naam = "onbekend";
        leeftijd = 0;
    }
    
    public Kind(String kindNaam,int kindLeeftijd){
        naam=kindNaam;
        leeftijd=kindLeeftijd;
        
        
    }
    
    public void setNaam(String kindNaam){
        naam=kindNaam;
    }
    
    public void setLeeftijd(int kindLeeftijd){
        leeftijd=kindLeeftijd;   
    }
    
    public String getNaam(){
        return naam;
    }
    
    public int getLeeftijd(){
        return leeftijd;
    }
    
    public boolean isBaby(){
        if (leeftijd<3){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void drukAf(){
        System.out.println("Kind Naam; " + naam);
        
        if (leeftijd < 13) {
            System.out.println("Leeftijd:" + leeftijd);
        }
        else {
            System.out.println("Dit is geen kind.");
        }
    }
    }
    
    
    
    
    
    
    
    
    
    

