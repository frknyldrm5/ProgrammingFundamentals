

public class Bediende
{
    private String naam;
    private int salaris;
    private Afdeling afdeling;

    
    public Bediende(String naam,int salaris)
    {
        this.naam=naam;
        this.salaris=salaris;
    }
    
    public void setNaam(String naam){
        this.naam=naam;
    }
    
    public String getNaam(){
        return naam;
    }
    
    public void setSalaris(int salaris){
        this.salaris=salaris;
    }
    
    public int getSalaris(){
        return salaris;
    }
    
    
    
    public void setAfdeling(){
        this.afdeling=afdeling;
    }
    
    

    
}
