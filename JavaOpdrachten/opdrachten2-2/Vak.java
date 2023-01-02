
/**
 * class Vak - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Vak
{
    private int uren;
    private String naam;
    
    public Vak(String naam, int uren) {
        this.naam = naam;
        this.uren = uren;
    }
    
    public String toString() {
        return naam + " (uren: " + uren + ")";
    }
}
