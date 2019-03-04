
/**
 * Abstract class PayingPassenger - This class gets the base fare and type charge for each passenger 
 * and then calculates the total charge for that passenger and then prints out all the data for that
 * passenger.
 * 
 * MD Mohidul Hasan 15071717
 * Course work 2
 */
public abstract class PayingPassenger extends Passenger implements Chargeable
{
    private double baseFare;
    private double typeCharge;
    private String FFC;
    /**
     * Constructor method ensures that when a passenger is created, the base fare and type charge
     * are included in the instantiation
     * 
     * @param firstName passengers first name
     * @param lastName passengers last name
     * @param weight passengers body weight
     * @param passengerNumber passengers ID number
     * @param baseFare passengers base amount to pay based on the route
     * @param typeCharge passengers amount to pay based on cabin class type
     */
    public PayingPassenger(String firstName, String lastName, double weight, int passengerNumber, double baseFare, double typeCharge, String FFC ){
        super(firstName, lastName, weight, passengerNumber);
        this.baseFare = baseFare;
        this.typeCharge = typeCharge;
        this.FFC = FFC ;
    }
    /**
     * gets the ffc field 
     * 
     */
    
    public String getFFC(){
        return FFC ;
    }
    /**
     * Gets the base fare for the passenger
     * 
     * @return A double that is the base fare for the passenger based on their route
     */
    public double getBaseFare(){
        return baseFare;
    }
    /**
     * Gets the type charge for the passenger
     * 
     * @return A double that is the type charge for the passenger based on their cabin class
     */
    public double getTypeCharge(){
        return typeCharge;
    }
    /**
     * Gets the total charge for the passenger
     * 
     * @return A double that is the total amount the passenger has to pay based on the passengers base 
     * fare, weight and type charge
     */
    public double getCharge(){
        return baseFare+(getWeight()*typeCharge);
    }
    /**
     * Neatly displays the costs that the passenger has
     * 
     * @return A set of strings, where each string is an amount of money the passenger has to pay
     */
    public String toString(){
        return super.toString() + "\n\n" + "Base Fare: " + baseFare + "\n\n" + "Type Charge: " +  typeCharge + "\n\n" + "Total cost: " + getCharge() + "\n\n" + "Frequent Flyer Code" + getFFC()+ "\n\n" ;
    }
}
