
/**
 * class Datum - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Datum
{
    private int dag;
    private int maand;
    private int jaar;

    public Datum(int nDag, int nMaand, int nJaar) {
        if (nJaar<0 || nJaar>2100) {
            nJaar = 2000;
        }
        if (nMaand<1 || nMaand>12) {
            nMaand = 1;
        }
        if (nMaand==1 || nMaand==3 || nMaand==5 || nMaand==7 || nMaand==8 || nMaand==10 || nMaand==12) {
            if (nDag<1 || nDag>31) {
                nDag = 1;
            }
        } else {
            if (nMaand==2) {
                if (nJaar % 4 == 0 && nJaar % 100 != 0) {
                    if (nDag<1 || nDag>29) {
                        nDag = 1;
                    }                    
                } else {
                    if (nDag<1 || nDag>28) {
                        nDag = 1;
                    }
                }
            } else {
                if (nDag<1 || nDag>30) {
                    nDag = 1;
                }
            }
        }
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
