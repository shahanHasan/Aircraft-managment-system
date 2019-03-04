
/**
 * Abstract class Passenger - write a description of the class here
 * 
* MD Mohidul Hasan , 15071717 
 * Course work 2
 */
public abstract class Passenger implements Weighable
{
    private int passengerNumber;
    private String firstName;
    private String lastName;
    private double weight;
    public static int ID_SEQUENCE = 0;
    private double luggage;
    
    public Passenger(String firstName, String lastName, double weight, int passengerNumberStart){
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        passengerNumber = passengerNumberStart + Passenger.ID_SEQUENCE;
        Passenger.ID_SEQUENCE++;
    }
    
    public int getPassengerNumber(){
        return passengerNumber;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public double getWeight(){
        return weight+luggage;
    }
    
    public double getLuggage(){
        return luggage;
    }
    
    public void setWeight(double weight){
        this.weight = weight;
    }
    
    public void setLuggage(double luggage){
        this.luggage = luggage;
    }
    
    public String toString(){
       String line1 = "Passenger Number: " + passengerNumber + "\n\n";
       String line2 = "First Name: " + firstName + "\n\n";
       String line3 = "Last Name: " + lastName + "\n\n";
       String line4 = "Weight: " + weight + "\n\n";
       String line5 = "Luggage: " + luggage + "\n\n";
       
       //System.out.println(line1 + line2 + line3 + line4 + line5);
       
       return line1 + line2 + line3 + line4 + line5;
    }
    
}
