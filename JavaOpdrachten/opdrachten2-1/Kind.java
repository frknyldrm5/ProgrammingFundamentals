
/**
 * class Person - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Kind
{
    private String naam;
    private Datum geboorteDatum;
    private Datum inschrijvingsDatum;
    
    public Kind() {
        naam = "Onbekend";
        geboorteDatum = new Datum(1, 1, 2000); 
        inschrijvingsDatum = new Datum(3, 1, 2000);
    }
    
    public Kind(String myName) {
        naam = myName;
        geboorteDatum = new Datum(1, 1, 2000);
        inschrijvingsDatum = new Datum(3, 1, 2000);
    }
    
    public Kind(String myName, Datum geboren, Datum ingeschreven) {
        naam = myName;
        geboorteDatum = geboren;
        inschrijvingsDatum = ingeschreven;
    }
    
    public String getNaam() {
        return naam;
    }
    
    public Datum getGeboorteDatum() {
        return geboorteDatum;
    }
    
    public Datum getInschrijvingsDatum() {
        return inschrijvingsDatum;
    }

    public void setNaam(String myName) {
        naam = myName;
    }
    
    public String toString() {
        return naam + ", geboren op " + geboorteDatum + ", ingeschreven op " + inschrijvingsDatum.toString();
    }
}
