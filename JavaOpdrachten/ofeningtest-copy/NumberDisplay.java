public class NumberDisplay
{
    // instance variables - replace the example below with your own
    private int limit;
    private  int value;
    
    public NumberDisplay(int LimitValue){
    limit = LimitValue;
    value = 0;
    }
    
    public int getValue() {
        return value;
    }
    
    public String getDisplayValue() {
        if (value<10) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }
    
    public void setValue(int newValue) {
    if (value < 0 || newValue >= limit){  
        newValue = 0;
    }
    else{
     value=newValue;   
    }
    }
    
    public void increment() {
    value=value+1;
    if (value == limit){
    value=0;
    }
    }







}
    

    

