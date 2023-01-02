
/**
 * class Bediende - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Bediende
{
    private String naam;
    private int salaris;
    private Afdeling afdeling;
    
    public Bediende(String naam, int salaris) {
        this.naam = naam;
        this.salaris = salaris;
        afdeling = new Afdeling("?", "?");
    }
    
    public void setAfdeling(Afdeling afdeling) {
        this.afdeling = afdeling;
    }
    
    public String verhoogSalaris(int bedrag) {
        if (salaris + bedrag > 1.1 * salaris) {
            salaris *= 1.1;
            return "Maximale verhoging is 10%";
        }
        else {
            salaris += bedrag;
            return "Verhoging gelukt";
        }
    }
    
    public String toString() {
        return naam + " verdient " + salaris + " en is werkzaam in " + afdeling;
    }
}
