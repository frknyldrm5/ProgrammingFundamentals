public class Programmeur
{
    private String naam;
    private String specialiteit;
    
    public Programmeur(String mNaam, String mSpecialiteit) {
        naam = mNaam;
        specialiteit = mSpecialiteit;
    }
    
    public void print() {
        System.out.println("Naam = " + naam);
        System.out.println("Specialiteit = " + specialiteit);
    }
}
