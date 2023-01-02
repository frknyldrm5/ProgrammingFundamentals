public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String display;
    
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        updateDisplay();
        
    }
    
    private void updateDisplay(){
        String uren = hours.getDisplayValue();
        String minuten = minutes.getDisplayValue();
        String seconden = seconds.getDisplayValue();
        return uren + "h" + minuten + ":" + seconds;
    }


    public String getDisplayValue()
    {
        /*
        String uren = hours.getDisplayValue();
        String minuten = minutes.getDisplayValue();
        String seconden = seconds.getDisplayValue();
        return uren + "h" + minuten + ":" + seconds;
       */
      return display;
       
    }
    
    
    public void increment(){
        seconds.increment();
        if (seconds.getValue()==0){
          minutes.increment(); 
          if (minutes.getValue()==0){
              hours.increment();
          }
        }
        
    }
    
    public void decrement(){
        seconds.decrement();
        minutes.decrement();
        if (minutes.getValue()==minutes.getLimit()-1){
            hours.decrement();
        }
        updateDisplay();
    }
     
    public void setTime(int hourValue,int minuteValue,int secondValue){
        hours.setValue(hourValue);
        minutes.setValue(minuteValue);
        seconds.setValue(secondValue);
    }
    
    public void incrementHour(){
        hours.increment();
    }
    
    public void decrementHour(){
        hours.decrement();
    }
    
}


