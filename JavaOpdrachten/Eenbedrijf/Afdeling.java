
public class Afdeling
{
    private String naam;
    private String locatie;
    
    public Afdeling(String naam,String locatie)
    {
        this.naam=naam;
        this.locatie=locatie;
    }
    
    public void setNaam(String naam){
        this.naam=naam;
    }
    
    public String getNaam(){
        return naam;
    }
    
    public void setLocatie(String locatie){
        this.locatie=locatie;
    }
    
    public String getLocatie(){
        return locatie;
    }

}   
