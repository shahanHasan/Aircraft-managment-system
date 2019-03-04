
/**
 * Write a description of class Crew here.
 * 
* MD Mohidul Hasan , 15071717 
 * Course work 2
 */
public class Crew extends Passenger
{
    public static final String CAPTAIN = "Captain";
    public static final String FIRST_OFFICER = "First Officer";
    public static final String CABIN_CREW = "Cabin Crew";
    
    private String position;

    /**
     * Constructor for objects of class Crew
     */
    public Crew(String position, String firstName, String lastName, double weight){
        super(firstName, lastName, weight, 0);
        this.position = position;
    }
    
    public String toString(){
        return "Crew\n\n" + "---------------------------\n\n" + "Position: " + position + "\n\n" + super.toString();
    }
    
}    