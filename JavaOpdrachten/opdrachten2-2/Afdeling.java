
/**
 * class Afdeling - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Afdeling
{
    private String naam;
    private String locatie;
    
    public Afdeling(String naam, String locatie) {
        this.naam = naam;
        this.locatie = locatie;
    }
    
    public String getNaam() {
        return naam;
    }
    
    public String getLocatie() {
        return locatie;
    }
    
    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }
    
    public String toString() {
        return naam + " op de locatie " + locatie;
    }
    
}
