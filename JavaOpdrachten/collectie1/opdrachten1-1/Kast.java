public class Kast
{
    private int hoogte;
    private int breedte;
    private int diepte;
    
    public Kast(int hoog, int breed, int diep) {
        hoogte = hoog;
        breedte = breed;
        diepte = diep;
    }
    
    public int getHoogte() {
        return hoogte;
    }
    
    public int getBreedte() {
        return breedte;
    }
    
    public int getDiepte() {
        return diepte;
    }
    
    public void drukOverzicht() {
        System.out.println("De kast is: ");
        System.out.println("  " + hoogte + " hoog");
        System.out.println("  " + breedte + " breed");
        System.out.println("  " + diepte + " diep");
    }
    
    public int getOppervlakte() {
        return breedte * hoogte;
    }
    
    public int getInhoud() {
        return hoogte * breedte * diepte;
    }
}
