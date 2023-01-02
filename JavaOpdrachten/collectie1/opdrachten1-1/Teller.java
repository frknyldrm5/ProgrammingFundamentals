public class Teller
{
    private int waarde;
    
    public Teller() {
        waarde = 0;
    }
    
    public void verhoog() {
        waarde = waarde + 1;
    }

    public void verlaag() {
        waarde = waarde -1;
    }
    
    public int getWaarde() {
        return waarde;
    }
    
    public void setWaarde(int newWaarde) {
        waarde = newWaarde;
    }
}
