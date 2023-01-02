public class Product
{
    private String omschrijving;
    private int aantal;
    private double prijs;

    public Product(String pOmschrijving, int pAantal, double pPrijs) {
        aantal = pAantal;
        omschrijving = pOmschrijving;
        prijs = pPrijs;
    }
    
    public void verhoog(double cost) {
        prijs = prijs + cost;
    }
    
    public void verhoog() {
        prijs = prijs + 1;
    }
    
    public void verdubbel() {
        prijs = prijs*2;
    }
    
    public void halveer() {
        prijs = prijs/2;
    }
    
    public void verhoog10procent() {
        prijs = prijs*1.1;
    }

    public void verhoog20procent() {
        prijs = prijs*1.2;
    }
    
    public void druk() {
        System.out.println(aantal + " " + omschrijving + ", stukprijs is " + prijs);
    }
}
