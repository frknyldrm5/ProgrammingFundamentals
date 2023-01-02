import java.util.ArrayList;

public class Portfolio
{
    private Agent agent;
    List<Residence>houses=new ArrayList<>();
    
    
    public Portfolio(Agent agent){
        this.agent=agent;
    }
    public Agent getAgent(){
        return agent;
    }
    public void setAgent(Agent agent){
        this.agent=agent;
    }
    public int getPortfolioSize(){
        return houses.size();
    }
    
    public List<Residence>getHouses(){
        return houses;
    }
    
    public void setHouses(List<Residence>houses){
        this.houeses=houses;
    }
    
    public addResidence(Residence residence){
        int housesSize = houses.size();
        houses.add(residence);
        if(housesSize < houses.size())
        return true;
        else{
        return false;        
        }
    }
    
    
}
