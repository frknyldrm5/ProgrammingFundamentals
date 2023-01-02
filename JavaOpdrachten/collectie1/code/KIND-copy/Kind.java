
public class Kind
{
    private String naam;
    private int leeftijd;
    
    public Kind(){
        naam="onbekend";
        leeftijd=0;
    }
    
    public Kind(String kindNaam,int kindLeeftijd){
        naam=kindNaam;
        leeftijd=kindLeeftijd;
        
    }
    
    public void setNaam(String nieuweNaam){
        naam=nieuweNaam;
    }
    
    public void set(int nieuweLeeftijd ){
        leeftijd=nieuweLeeftijd;
        
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
        }else{
            return false;
        }
    }
    
    public void drukAf(){
        System.out.println("Naam kind; " + naam);
        if (leeftijd<13){
            System.out.println("leeftijd: " + leeftijd);   
        }
        else{
            System.out.println("Dit is geen kind.");
        }
    }
    
   
}
