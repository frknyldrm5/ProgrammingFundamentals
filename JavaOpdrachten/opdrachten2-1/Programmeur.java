
/**
 * class Programmeur - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Programmeur
{
    private String naam;
    private String specialiteit;
    
    public Programmeur(String mNaam, String mSpecialiteit) {
        naam = mNaam;
        specialiteit = mSpecialiteit;
    }
    
    public void print() {
        System.out.println("Naam = " + naam +", specialiteit = " + specialiteit);
    }
}
