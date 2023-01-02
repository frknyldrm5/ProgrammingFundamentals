public class Vak
{
    private String omschrijving;
    private int aantalUren;
    
    public Vak(String omschrijving,int aantalUren){
        this.omschrijving = omschrijving;
        this.aantalUren= aantalUren;
    }
    
    public String getOmschrijving(){
        return omschrijving;
    }
    
    public void setOmschrijving(String omschrijving){
        this.omschrijving=omschrijving;
    }
    
    public int getAantalUren(){
        return aantalUren;
    }
    
    public void setAantalUren(int aantalUren){
        this.aantalUren=aantalUren;
    }
    
    public String toString(){
        return omschrijving + "(" + aantalUren + "uren)";
    }
    
    

    
    
}
