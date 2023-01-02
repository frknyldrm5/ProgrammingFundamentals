
public class Kind2 {
    private String naam;
    private int leeftijd;

    public Kind2() {
        naam = "onbekend";
        leeftijd = 0;
    }

    public Kind2(String kindNaam, int kindLeeftijd) {
        naam = kindNaam;
        leeftijd = kindLeeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setNaam(String kindNaam) {
        naam = kindNaam;
    }

    public void setLeeftijd(int kindLeeftijd) {
        leeftijd = kindLeeftijd;
    }

    public boolean isBaby() {
        if (leeftijd<3) {
            return true;
        }
        return false;
    }

    public void drukAf() {
        System.out.println("Naam kind: " + naam);
        if (leeftijd<13) {
            System.out.println("Leeftijd kind: " + leeftijd);
        } else {
            System.out.println("Dit is geen kind");
        }
    }
}