
public class Residence
{
    private int type;
    private int residenceNr;
    private String city;
    private boolean sold=false;
    private int askingPrice;
    public final static int APPARMENT=0;
    public final static int HOUSE=1;
    public final static int VILLA=2;
    public final static int CASTLE=3;
    public final static int OTHER=4;
    
    private String[] typeHouse;
    
    
    public Residence(int residenceNr,String city,boolean sold,int askingPrice)
    {
        this.residenceNr=residenceNr;
        this.city=city;
        if(askingPrice<100000){
            askingPrice=100000;
        }
        if(type==2 && askingPrice <300000){
            askingPrice=30000;
        }
        if(type==3 && askingPrice < 750000){
            askingPrice=750000;
        }
        this.askingPrice=askingPrice;
        int type=4;
        boolean sold=false;
        residenceType=newString[5];
        residenceType[0]="APPARTMENT";
        residenceType[1]="HOUSE";
        residenceType[2]="VILLA";
        residenceType[3]="CASTLE";
        residenceType[4]="OTHER";
        
        }

    public Residence(int type,int residenceNr,String city,,int askingPrice){
        this.residenceNr=residenceNr;
        this.type=type;
        this.city=city;
        if(askingPrice<100000){
            askingPrice=100000;
        }
        if(type==2 && askingPrice<30000){
            askingPrice=3000;
        }
        if(type==3 && askingPrice < 750000){
            askingPrice=750000;
        }
        
    }
    
    public int getType(){
        return type;
    }
    
    public void setType(int type){
        this.type=type;
    }
    
    public void setResidenceNr(int residenceNr){
        this.residenceNr=residenceNr;
    }
    
    public void setCity(String city){
        this.city=city;
    }
    
    public void setAskingPrice(int askingPrice){
        this.askingPrice=askingPrice;
    }
    
    public int getResidenceNr(){
        return residenceNr;
    }
    
    public String getCity(){
        return city;
    }
    
    public String toString(){
        if(sold==true){
            return ("sold ->" + type + "(NR-" + residenceNr + ",city " + city + ")" + "startprijs = " + askingPrice  )
        }
        return (type + "(NR-" + ", city" + city + ") startprijs" + askingPrice);
    }
    
}
