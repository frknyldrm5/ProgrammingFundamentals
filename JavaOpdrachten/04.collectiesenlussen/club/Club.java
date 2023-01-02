import java.util.ArrayList;
import java.util.Iterator;

public class Club
{
    private ArrayList<Membership> members;

    public Club()
    {
        members = new ArrayList<>();
    }

    public void join(Membership member)
    {
        members.add(member);
    }

    public int numberOfMembers()
    {
        return members.size();
    }

    public int joinedInMonth(int month) {
        if (month<1 || month>12) {
            System.out.println("De maand moet tussen 1 en 12 liggen, beide inbegrepen!");
            return 0;
        }
        int aantal = 0;
        for (Membership member : members) {
            if (member.getMonth()==month) {
                aantal++;
            }
        }
        return aantal;
    }

    public ArrayList<Membership> purge(int month, int year) {
        ArrayList<Membership> purgedMembers = new ArrayList<>();
        Iterator<Membership> it = members.iterator();
        while (it.hasNext()) {
            Membership member = it.next();
            if (member.getMonth()==month && member.getYear()==year) {
                purgedMembers.add(member);
                it.remove();
            }
        }
        return purgedMembers;
    }
    
    public ArrayList<Membership> getMembers() {
        return members;
    }
}