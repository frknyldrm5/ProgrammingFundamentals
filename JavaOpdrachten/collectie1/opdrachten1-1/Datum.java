public class Datum
{
    private int dag;
    private int maand;
    private int jaar;

    public Datum(int nDag, int nMaand, int nJaar) {
        dag = nDag;
        maand = nMaand;
        jaar = nJaar;
    }

    public Datum() {
        dag = 1;
        maand = 1;
        jaar = 2000;
    }
    
    public String toString() {
        return dag + "-" + maand + "-" + jaar;
    }
}
