
/**
 * class Vakantiehuis - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Vakantiehuis
{
    private int aantalWeek;
    private int aantalPersoon;
    private double weekPrijs;
    private final int KORTINGSPERCENTAGE_2  = 10;
    private final int KORTINGSPERCENTAGE_3  = 18;
    private int maxPersoon;
    private double taxPersoonWeek;
    
    public Vakantiehuis(double weekPrijs, int maxPersoon, double taxPersoonweek) {
        this.weekPrijs = weekPrijs;
        this.maxPersoon = maxPersoon;
        this.taxPersoonWeek = taxPersoonWeek;
    }
    
    public boolean reserveer(int aantalWeek, int aantalPersoon) {
        if (aantalPersoon>maxPersoon || aantalWeek<1) {
            return false;
        }
        this.aantalWeek = aantalWeek;
        this.aantalPersoon = aantalPersoon;
        return true;
    }
    
    public double getPrijs() {
        double prijs = 0;
        if (aantalWeek>2) {
            prijs += (aantalWeek - 2) * weekPrijs * (100 - KORTINGSPERCENTAGE_3) / 100;
        }
        if (aantalWeek>1) {
            prijs += weekPrijs + (100 - KORTINGSPERCENTAGE_2) / 100;
        }
        prijs += weekPrijs;
        prijs *= 1.01;
        prijs += aantalPersoon * aantalWeek * taxPersoonWeek;
        return prijs;
    }
}
