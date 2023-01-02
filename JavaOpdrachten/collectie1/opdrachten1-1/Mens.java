public class Mens
{
    private String naam;
    private int leeftijd;
    
    public Mens() {
    }
    
    public Mens(String mijnNaam, int mijnLeeftijd) {
        naam = mijnNaam;
        leeftijd = mijnLeeftijd;
    }
    
    public String getNaam() {
        return naam;
    }
    
    public int getLeeftijd() {
        return leeftijd;
    }
    
    public void setNaam(String mijnNaam) {
    	naam = mijnNaam;
    }
    
    public void setLeeftijd(int mijnLeeftijd) {
        leeftijd = mijnLeeftijd;
    }
    
    public void spreek() {
        System.out.println("Dag, ik ben " + naam + " en ik ben " + leeftijd + " jaar");
    }
}
