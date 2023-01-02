

public class Docent
{
    private Vak vak;
    private String naam;
    private String diploma;

    
    public Docent(String diploma,String naam)
    {
        this.diploma=diploma;
        this.naam=naam;
    }
    
    public void setDiploma(String diploma){
        this.diploma=diploma;
    }
    
    public String getDiploma(){
        return diploma;
    }
    
    public void setNaam(String naam){
        this.naam=naam;
    }
    
    public String getNaam(){
        return naam;
    }
    
    public void aadVak(Vak vak){
        if(this.vak==null) 
            this.vak=vak;            
    }
    
    public void removeVak(Vak vak){
        this.vak=null;
    }
    
    public String toString(){
        if (vak==null){
            return naam + "(diploma: " + diploma + ") geeft  momenteel nog geen vak";
        }
        return naam + "(diploma: " + diploma + ") geeft" + vak.toString();
    }
    
    
    

    
    
}
