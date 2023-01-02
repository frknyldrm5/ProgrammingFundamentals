public class Vak
{
    private String omschrijving;
    private int aantalUren;
    
    
    public Vak(String omschrijving,int aantalUren){
        this.omschrijving=omschrijving;
        this.aantalUren=aantalUren;
    }
    
    public void setOmschrijving(String omschrijving){
        this.omschrijving=omschrijving;
    }
    
    public String getOmschrijving(){
        return omschrijving;
    }
    
    public void setAantalUren(int aantalUren){
        this.aantalUren=aantalUren;
    }
    
    public int getAantalUren(){
        return aantalUren;
    }
    
    public String toString(){
        return omschrijving + " (" + aantalUren + " uren)";
    }

    
}
