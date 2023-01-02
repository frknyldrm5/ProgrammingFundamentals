
public class Afdeling
{
    private String locatie;
    private String naam;

    
    public Afdeling(String naam,String locatie)
    {
        this.locatie=locatie;
        this.naam=naam;
    }
    
    public void setNaam(String naam){
        this.naam=naam;
    }
    public String getNaam(){
        return naam ;
    }
    public void setLocatie(String locatie){
        this.locatie=locatie;
    }
    public String getLocatie(){
        return locatie;
    }
    public String toString(){
        return naam + " op de locatie " + locatie;
    }

}
