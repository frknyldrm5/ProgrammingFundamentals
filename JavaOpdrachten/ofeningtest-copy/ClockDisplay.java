
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private NumberDisplay hours;
    private NumberDisplay minutes;
    
    public ClockDisplay () {
    
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
    
    }
    
    public String getDisplayValue(){
        
        String uren = hours.getDisplayValue();
        String minuten =minutes.getDisplayValue();
        return uren + ":" + minutes;
    }























}

    