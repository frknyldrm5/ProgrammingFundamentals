
/**
 * Write a description of class ClockDisplay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClockDisplay
{

    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String display;

    public ClockDisplay() {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
       updateDisplay();
        // display = new NumberDisplay();

    }
    public ClockDisplay(int hourValue, int minuteValue , int secondValue) {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        setTime(hourValue,minuteValue, secondValue);
               
    }
    
    private void updateDisplay(){
         String uren = hours.getDisplayValue();
        String minuten = minutes.getDisplayValue();
        String seconden = seconds.getDisplayValue();
        display = uren + ":" + minuten + ":" + seconden;
    }
    

    public String getDisplayValue() {
        //String uren = hours.getDisplayValue();
        //String minuten = minutes.getDisplayValue();
        //String seconden = seconds.getDisplayValue();
       // return uren + ":" + minuten + ":" + seconden;
        return display;
    }

    public void increment(){
        seconds.increment();
        if(seconds.getValue() ==0) {

            minutes.increment();

            if( minutes.getValue()==0) {
                hours.increment();

            }}
            updateDisplay();
    }

    public void setTime(int hourValue, int minuteValue, int secondValue){
        hours.setValue(hourValue);
        minutes.setValue(minuteValue);
        seconds.setValue(secondValue);

        updateDisplay();
    }
    public void setTijd(int hourValue, int minuteValue) {
        hours.setValue(hourValue);
        minutes.setValue(minuteValue);
        updateDisplay();
    }

    public void decrement() {
        seconds.decrement();
        if(seconds.getValue() == seconds.getLimit() - 1) {
            minutes.decrement();
            if(minutes.getValue() == minutes.getLimit() - 1) {
                hours.decrement();

            }
             updateDisplay();
        }

   
   
   
   
    }
    }
