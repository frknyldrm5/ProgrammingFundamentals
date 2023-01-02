
public class WhileOefeningen
{
    // instance variables - vervang deze door jouw variabelen
    private int x;

    
    public WhileOefeningen()
    {
        // geef de instance variables een beginwaarde
        x = 0;
    }
    //1
    public void halveKerstboom() {
        int stars = 1;
        while (stars < 6) {
            System.out.println("*".repeat(stars));
            stars++;
        }
        System.out.println("**");
    }
    //2
    public void halveKerstboom(int maxStars){
        int stars = 1;
        while (stars <= maxStars) {
            System.out.println("*".repeat(stars));
            stars++;
        }
        System.out.println("**");
    }
    //3---degistirme
    
    //4- 3den 100e kadar
    public void getallen3tot100(){
        int index=3;
        while(index <= 100){
            System.out.println(index);
            index++;
        }
    }
    //5-
    public void getallen200tot101(){
        int getal=200;
        while(getal>100){
            System.out.println(getal);
            getal--;
        }
    }
    //6
    public boolean isPriemgetal(int getal){
        int i=2;
        while(i < getal){
            if(getal % i ==0) 
            return false;
            i++;
        }
        return true;
    }
    
    public void priemgetallen3tot100(){
        int i =3;
        while(i<=100){
            if(isPriemgetal(i))
            System.out.println(i);
            i++;
            
        }
    }
    
    public void priemgetallen200tot101(){
        int i =200;
        while(i>100){
            if(isPriemgetal(i))
            System.out.println(i);
            i--;
        }
    }
}
