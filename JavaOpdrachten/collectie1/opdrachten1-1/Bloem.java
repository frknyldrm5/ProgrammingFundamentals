public class Bloem
{
    private String naam;
    private String kleur;
    private double stukPrijs;

    public Bloem(String bNaam, String bKleur, double prijs) {
        naam = bNaam;
        kleur = bKleur;
        stukPrijs = prijs;
    }
    
    public void print() {
        System.out.println(naam + " heeft als kleur " + kleur + " en kost " + stukPrijs);
    }
    
    public void setKleur() {
        kleur = "geel";
    }
    
    public void setKleur(String bKleur) {
        kleur = bKleur;
    }
}
