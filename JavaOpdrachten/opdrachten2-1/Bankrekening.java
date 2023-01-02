
/**
 * class Bankrekening - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Bankrekening
{
    private String nummer;
    private double saldo;
    
    public Bankrekening(String rekeningNummer) {
        nummer = rekeningNummer;
        saldo = 0;
    }
    
    public double neemOp(double bedrag) {
        if (bedrag>0 && bedrag<=saldo) {
            saldo = saldo - bedrag;
            return bedrag;
        } else {
            return 0;
        }
    }
    
    public void stort(double bedrag) {
        if (bedrag>0) {
            saldo = saldo + bedrag;
        }
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public boolean isSaldoPositief() {
        if (saldo>0) {
            return true;
        }
        return false;
    }
    
    public String toString() {
        return "Saldo van bankrekening " + nummer + " bedraagt " + saldo; 
    }
}
