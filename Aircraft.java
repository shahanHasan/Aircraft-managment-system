
import java.util.ArrayList;
/**
 * Write a description of class Aircraft here.
 * 
 * MD Mohidul Hasan , 15071717 
 * Course work 2
 */
public class Aircraft
{
    private double totalPassengerWeight;
    private double revenue;
    private int maxPassengers;
    private double maxWeight;
    private String route;
    private ArrayList<Passenger> passengers = new ArrayList<Passenger>();

    /**
     * Constructor for objects of class Aircraft
     */
    public Aircraft(String route){
        this.route = route;
        
        switch(route){
            case "Cape Town": 
            this.maxPassengers = Route.CAPE_TOWN_MAX_PASSENGERS;
            this.maxWeight = Route.CAPE_TOWN_MAXIMUM_WEIGHT;
            break;
            case "Glasgow":
            this.maxPassengers = Route.GLASGOW_MAX_PASSENGERS;
            this.maxWeight = Route.GLASGOW_MAXIMUM_WEIGHT;
            
        }
    }
    
    public double getTotalPassengerWeight(){
        return totalPassengerWeight;
    }
    
    public double getRevenue(){
        return revenue;
    }
    
    public int getMaxPassengers(){
        return maxPassengers;
    }
    
    public double getMaxWeight(){
        return maxWeight;
    }
    
    public String getRoute(){
        return route;
    }

    public String listPassengers(){
        String list = "";
        
        for(int i=0; i<passengers.size(); i++){
            list += passengers.get(i).toString() + "\n\n";
        }
        
        return list;
    }
    
    public boolean addPassenger(Passenger passenger){
        if(passengers.size() == maxPassengers || passenger.getWeight()+totalPassengerWeight > maxWeight){
            return false;
        }
        else{
            passengers.add(passenger);
            totalPassengerWeight += passenger.getWeight();
            if(passenger instanceof PayingPassenger){
                PayingPassenger newPassenger = (PayingPassenger) passenger;
                revenue += newPassenger.getCharge();
            }
            return true;
        }
    }
    
    public Passenger findPassenger(int passengerNumber){
        for(int i=0; i<passengers.size(); i++){
            if(passengers.get(i).getPassengerNumber() == passengerNumber){
                return passengers.get(i);
            }
        }
        return null;
    }
    
    public void removePassenger(int passengerNumber){
        Passenger exPassenger = findPassenger(passengerNumber);
        
        if(exPassenger == null){
            System.out.println("Sorry. This passenger does not exist.");
        }
        else{
            passengers.remove(exPassenger);
            totalPassengerWeight -= exPassenger.getWeight();
            if(exPassenger instanceof PayingPassenger){
                PayingPassenger oldPassenger = (PayingPassenger) exPassenger;
                revenue -= oldPassenger.getCharge();
            }
        }
    }
    
    public String toString(){
       String line1 = "Total passenger weight: " + totalPassengerWeight + "\n\n";
       String line2 = "Revenue: " + revenue + "\n\n";
       String line3 = "Maximum amount of passengers: " + maxPassengers + "\n\n";
       String line4 = "Maximum amount of weight: " + maxWeight + "\n\n";
       String line5 = "Destination: " + route + "\n\n";
       
       //System.out.println(line1 + line2 + line3 + line4 + line5);
       
       return line1 + line2 + line3 + line4 + line5;
    }
}

