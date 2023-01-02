
/**
 * class Bank - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Bank
{
    private Bankrekening rekening1;
    private Bankrekening rekening2;
    private Bankrekening rekening3;
    
    public Bank() {
        rekening1 = new Bankrekening("BE9874569");
        rekening2 = new Bankrekening("BE1245789");
        rekening3 = new Bankrekening("BE3568945");
        rekening1.stort(852);
        rekening2.stort(1542);
        rekening3.stort(78);
    }
    
    public void printAlleRekeningen() {
        System.out.println(rekening1);
        System.out.println(rekening2);
        System.out.println(rekening3);
    }
    
    public double getTotaalSaldo() {
        return rekening1.getSaldo() + rekening2.getSaldo() + rekening3.getSaldo();
    }
    
    public void printTotaalSaldo() {
        System.out.println("Het totale saldo van de bank bedraagt " + getTotaalSaldo());
    }
}
