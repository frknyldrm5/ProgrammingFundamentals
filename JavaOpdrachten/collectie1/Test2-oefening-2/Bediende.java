
public class Bediende
{
    private String naam;
    private int salaris;
    private Afdeling afdeling;

    
    public Bediende(String naam,int salaris)
    {
        this.naam=naam;
        this.salaris=salaris;
        afdeling = new Afdeling("verkoop", "IT");
    }
    
    public void setAfdeling(Afdeling afdeling){
        this.afdeling=afdeling;
    }
    
    public String verhoogSalaris(int bedrag){
        if (salaris + bedrag > 1.1 * salaris) {
            return "MAximale verhoging is 10%";
        }
        else {
            salaris =salaris + bedrag ;
            return "Verhoging gelukt";
        }
    }
    
    public String toString(){
        return naam + " verdient " + salaris + "en is werkzaam in " + afdeling ;
    }

   
}
