
/**
 * class Team - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Team
{
    private Programmeur prog1;
    private Programmeur prog2;
    private Programmeur prog3;
    private Programmeur prog4;
    
    public Team() {
        prog1 = new Programmeur("Nisse", "PHP");
        prog2 = new Programmeur("Kaan,", "Java");
        prog3 = new Programmeur("Liam", "C++");
        prog4 = new Programmeur("Mohamed", "Python");
    }

    public void printAlleTeamLeden() {
        prog1.print();
        prog2.print();
        prog3.print();
        prog4.print();
    }
}
