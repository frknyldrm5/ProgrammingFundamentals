
/**
 * class Tijdstip - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Tijdstip
{
    private String dag;
    private int uur;
    
    public Tijdstip() {
        dag = "maandag";
        uur = 1;
    }
    
    public Tijdstip(String dag, int uur) {
        setDag(dag);
        setUur(uur);
    }
    
    public void setDag(String dag) {
        if (!dag.equals("maandag") && !dag.equals("dinsdag") && !dag.equals("woensdag") 
            && !dag.equals("donderdag") && !dag.equals("vrijdag") && !dag.equals("zaterdag")) {
            dag = "maandag";
        }
        this.dag = dag;
    }
    
    public void setUur(int uur) {
        if (uur<1 || uur>8) {
            uur = 1;
        }
        this.uur = uur;
    }
    
    public String getDag() {
        return dag;
    }
    
    public int getUur() {
        return uur;
    }
    
    public String toString() {
        return dag + " " + uur + "e uur";
    }
    
    public void print() {
        System.out.println(toString());
    }
}
