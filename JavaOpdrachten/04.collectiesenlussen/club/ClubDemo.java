
import java.util.ArrayList;

public class ClubDemo
{
    private Club club;

    public ClubDemo()
    {
        club = new Club();
    }

    public void demo()
    {
        club.join(new Membership("David", 2, 2004));
        club.join(new Membership("Michael", 1, 2004));
        System.out.println("The club has " + club.numberOfMembers() + " members.");

        for (int month=1; month<13; month++) {
            System.out.println("In maand " + month + " zijn er " + club.joinedInMonth(month) + " leden");
        }
        
        ArrayList<Membership> purgedMembers = club.purge(2, 2004);
        System.out.println("De verwijderde leden:");
        for (Membership member : purgedMembers) {
            System.out.println("  " + member);
        }
        
        ArrayList<Membership> members = club.getMembers();
        System.out.println("De nog aanwezige leden:");
        for (Membership member : members) {
            System.out.println("  " + member);
        }
        
    }
}