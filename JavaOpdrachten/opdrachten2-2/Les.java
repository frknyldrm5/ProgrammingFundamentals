
/**
 * class Les - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Les
{
    private String vak;
    private Tijdstip tijdstip;
    private String lokaal;
    
    public Les(String vak, Tijdstip tijdstip, String lokaal) {
        this.vak = vak;
        this.tijdstip = tijdstip;
        this.lokaal = lokaal;
    }
    
    public String getVak() {
        return vak;
    }
    
    public Tijdstip getTijdstip() {
        return tijdstip;
    }
    
    public String getLokaal() {
        return lokaal;
    }
    
    public String toString() {
        return vak + " " + tijdstip + " " + lokaal;
    }
    
    public void print() {
        System.out.println(toString());
    }
}
