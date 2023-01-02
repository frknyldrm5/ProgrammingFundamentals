
/**
 * class Person - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Persoon
{
    private String naam;
    private Datum geboorteDatum;
    
    public Persoon() {
        naam = "Onbekend";
        geboorteDatum = new Datum(1, 1, 2000);        
    }
    
    public Persoon(String myName) {
        naam = myName;
        geboorteDatum = new Datum(1, 1, 2000);
    }
    
    public Persoon(String myName, Datum geboren) {
        naam = myName;
        geboorteDatum = geboren;
    }
    
    public String getNaam() {
        return naam;
    }
    
    public Datum getGeboorteDatum() {
        return geboorteDatum;
    }
    
    public void setNaam(String myName) {
        naam = myName;
    }
    
    public String toString() {
        return "De naam van deze persoon is " + naam + ", geboren op " + geboorteDatum.toString();
    }
}
