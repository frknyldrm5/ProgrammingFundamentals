
public class NumberDisplay
{
      private int limit;
      private int value;
      
    public NumberDisplay(int limitValue) {
        limit = limitValue;
        value = 0;
        
}
    public int getValue() {
        return value;
        
    }
    public int getLimit() {
        return limit;
    }
    
    public String getDisplayValue() {
    if(value < 10 ) {
        return "0" + value ;
    }
    else {
        return "" + value;
    }
    }
    
    public void setValue(int newValue) {
        if (newValue < 0 || newValue >= limit) {
            newValue = 0;
            
        }
        else {
            value = newValue;
            
        }
    }
    public void increment () {
        value = value + 1;
        if(value ==limit) {
            value = 0;
        }
    }
    public void decrement() {
        value = value-1;
        if(value == -1) {
            value = limit - 1 ;
            
        }
        
    }

  
    }

