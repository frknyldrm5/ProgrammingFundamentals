
/**
 * class Teller - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Teller
{
    private int waarde;
    
    public Teller() {
        waarde = 0;
    }
    
    public void verhoog() {
        waarde++;
    }

    public void verlaag() {
        waarde--;
    }
    
    public int getWaarde() {
        return waarde;
    }
    
    public void setWaarde(int newWaarde) {
        waarde = newWaarde;
    }
}
