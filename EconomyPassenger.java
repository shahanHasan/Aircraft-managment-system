
/**
 * Write a description of class EconomyPassenger here.
 * 
* MD Mohidul Hasan , 15071717 
 * Course work 2
 */
public class EconomyPassenger extends PayingPassenger implements Economy
{

    public EconomyPassenger(String firstName, String lastName, double weight, double baseFare , String FFC)
    {
        super(firstName, lastName, weight, Economy.START_NUMBER, baseFare, Economy.TYPE_CHARGE , FFC);
    }
    
    public String toString(){
        String prettyLine = "---------------------------" + "\n\n";
       
        //System.out.println("Economy Class\n" + prettyLine + super.toString());
        
        return "Economy Class\n" + prettyLine + super.toString();
    }
    
}
