public class Agent
{
    
    private int number;
    private String name;
    
    public Agent(int number,String name)
    {
        this.number=number;
        this.name=name;
    
    }

    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setNumber(int number){
        this.number=number;
    }
    
    public int getNumber(){
        return number;
    }
    
    public String toString(){
        return "Agent (" + number + ", naam =" + name + ")";
    }
}
