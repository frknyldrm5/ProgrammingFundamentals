
public class Docent
{
    
    private String naam;
    private String diploma;
    private Vak vak;

    public Docent(String naam,String diploma){
        this.naam=naam;
        this.diploma=diploma;
    }
    
    public String getNaam(){
        return naam;
    }
    
    public void setNaam(String naam){
        this.naam=naam;
    }
    
    public String getDiploma(){
        return diploma;
    }
    
    public void setDiploma(String diploma){
        this.diploma=diploma;
    }

    public void aadVak(Vak vak){
        if (this.vak==null){
            this.vak=vak;
        }
        
    }
    
    public void removeVak(){
        this.vak=null;
    }
    
    public String toString(){
        if (vak==null){
            return naam + "(diploma: " + diploma + ") geeft momenteel nog geen vak";
        }
        return naam + "(diploma: " + diploma + ") geeft " + vak.getAantalUren();
    }
}
