
/**
 * class Docent - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Docent
{
    private String naam;
    private String diploma;
    private Vak vak;
    private final int MAXIMUM_AANTALVAKKEN = 1;
    
    public Docent(String naam, String diploma) {
        this.naam = naam;
        this.diploma = diploma;
    }
    
    public boolean voegVakToe(Vak vak) {
        if (this.vak==null) {
            this.vak = vak;
            return true;
        }
        return false;
    }
    
    public String toString() {
        String retourVak = "geeft momenteel nog geen vak";
        if (vak!=null) {
            retourVak = "geeft " + vak;
        }
        return naam + " (diploma: " + diploma + ") " + retourVak;
        
    }
}
