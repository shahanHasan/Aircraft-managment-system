
/**
 * Write a description of class PassengerTest here.
 * 
 * MD Mohidul Hasan , 15071717 
 * Course work 2
 */
public class PassengerTest
{
    public static void main(){
        EconomyPassenger economyPassenger = new EconomyPassenger("Bob", "Sagit", 140, 20 ,"ABDF231");
        System.out.println(economyPassenger);
        economyPassenger.setWeight(111);
        economyPassenger.setLuggage(37);
        System.out.println(economyPassenger);
        
        Crew crewPassenger = new Crew(Crew.CAPTAIN, "Harry", "Gee", 217 );
        System.out.println(crewPassenger);
        crewPassenger.setWeight(57);
        crewPassenger.setLuggage(213);
        System.out.println(crewPassenger);
    }
}
