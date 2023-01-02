
/**
 * class Scorebord - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Scorebord
{
    private Teller teller1;
    private Teller teller2;
    
    public Scorebord() {
        teller1 = new Teller();
        teller2 = new Teller();
    }
    
    public void verhoog1() {
        teller1.verhoog();
    }

    public void verlaag1() {
        teller1.verlaag();
    }

    public void verhoog2() {
        teller2.verhoog();
    }

    public void verlaag2() {
        teller2.verlaag();
    }
    
    public String toString() {
        return teller1.getWaarde() + "-" + teller2.getWaarde();
    }
    
    public void print() {
        System.out.println("De score is: " + toString());
    }
}
