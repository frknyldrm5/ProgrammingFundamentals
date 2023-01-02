

public class Vakantiehuis
{
    
    private String naam;
    private double prijsPerWeek;
    private int maxPersonen;
    private double belastingWeekPersoon = 1;
    private boolean gereserveerd = false;
    private final int  KORTINGSPERCENTAGE_2 = 15;
    private final int  KORTINGSPERCENTAGE_3= 25;
    private int personen;
    private int weken;
    
    public Vakantiehuis(String naam,double prijsWeek,int maxPersoon){
        this.naam = naam;
        prijsPerWeek = prijsWeek;
        maxPersonen = maxPersoon;
    }
    
    public boolean reserveer(int aantalPersonen,int aantalWeken){
        if (aantalPersonen > maxPersonen || aantalWeken < 1) {
            gereserveerd = false ;
        }else{
            personen = aantalPersonen;
            weken=aantalWeken;
            gereserveerd=true;
            
        }
            return gereserveerd;
    }
    
    public double getPrijs(){
        double prijs = prijsPerWeek;
        
        if (weken > 1) prijs += prijsPerWeek * (1-KORTINGSPERCENTAGE_2/100);
    }

    
    
}
