/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine()
    {
        price = 1000;
        balance = 0;
        total = 0;
    }
     public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
    }
    public TicketMachine(int cost , int startTotal){
        price = cost;
        balance = 0;
        total = startTotal;
    }
    public void empty(){
        total = 0;
        
    }
     //Return the price of a ticket.
     
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int cost) {
        
        price = cost;       
        
        
    }  
    public void increase(int extraPrice) {
        price = price + extraPrice;      
        
        
    }
    public void discount(int amount){
        price -= amount;
        
    }

    /**)
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }
    public int getTotal() {
        return total;
    }
    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {
        balance = balance + amount;
    }
    
    public void prompt() {
        System.out.println("Gelieve het correcte bedrag in te werpen.");
        
    }
    public void showPrice(){
        System.out.println("De prijs van een kaartje is " + price + " cent." );
    }
    public void groen () {
        System.out.println("Mijn kat heeft groene ogen.");

    }
    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
    }
}
