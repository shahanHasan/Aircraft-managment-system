import javax.swing.JOptionPane;

/**
 * Write a description of class BookingAdmin here.
 * 
 * MD Mohidul Hasan , 15071717 
 * Course work 2
 */
public class BookingAdmin
{
    private Aircraft plane;
    
    private String command = "C";

    public BookingAdmin(Aircraft plane){//Constructor or main, ask Paul
        this.plane = plane;
        setupAdmin();
        menu();
    }
    
    private void setupAdmin(){
        for(int c = 0; c< 100; c++){
                String pfn = c+"FName";
                String pln = c+"LName"; 
                EconomyPassenger ep = new EconomyPassenger(pfn, pln,75, Economy.GLASGOW_BASE_FARE , Economy.FFC );
                
                ep.setLuggage(15.0);
                plane.addPassenger(ep);
        }
    }
    
    private void menu(){
        while(command.equals("C")){
            String [] menuOptions = {"Show all passengers", "Show current revenue", "Show current weight", "Add passenger", "Exit"}; //Creating an array for the menu options
            String displayMainMenu = (String) JOptionPane.showInputDialog(null, "Please choose an option", "Main Menu", JOptionPane.PLAIN_MESSAGE, null, menuOptions, menuOptions[0]); //Creating the menu box
            
            if (displayMainMenu == "Show all passengers"){
                allPassengers();
            }    
            else if (displayMainMenu == "Show current revenue"){
                currentRevenue();
            }
            else if (displayMainMenu == "Show current weight"){
                currentWeight();
            }
            else if (displayMainMenu == "Add passenger"){
                passengerType();
            }
            else if (displayMainMenu == "Exit"){
                System.out.println("Thank you for using QueasyJet");
                command = "e";
            }
            else{
                System.out.println("Thank you for using QueasyJet");
                break;
            }
        }
    }
    
    private void allPassengers(){
        System.out.println(plane.listPassengers());
    }
    
    private void currentRevenue(){
        System.out.println("The current revenue is £" + plane.getRevenue() + "\n\n");
    }
    
    private void currentWeight(){
        System.out.println("The current weight, in kilos, is " + plane.getTotalPassengerWeight() + "kg\n\n");
    }
    
    private void passengerType(){
        String [] menuOptions = {"Economy"}; //Creating an array for the menu options
        String passengerClass = (String) JOptionPane.showInputDialog(null, "Please choose a cabin", "Class choice",JOptionPane.PLAIN_MESSAGE, null, menuOptions, menuOptions[0]); //Creating the menu box
        
        if (passengerClass == "Economy"){
                addEconomyPassenger();
            }
    }
 
    private void addEconomyPassenger(){
        String firstName = JOptionPane.showInputDialog("Please state your first name");
        String lastName = JOptionPane.showInputDialog("Please state your last name");
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Please state your weight in kilos"));
        double luggage = Double.parseDouble(JOptionPane.showInputDialog("Please state your luggage in kilos"));
        EconomyPassenger newPassenger;
        switch (plane.getRoute()){
            case "Cape Town": 
            newPassenger = new EconomyPassenger(firstName, lastName, weight, Economy.CAPETOWN_BASE_FARE , Economy.FFC);
            break;
            case "Glasgow":
            newPassenger = new EconomyPassenger(firstName, lastName, weight, Economy.GLASGOW_BASE_FARE, Economy.FFC);
            break;
            default:
            return;
        }

        newPassenger.setLuggage(luggage);
        plane.addPassenger(newPassenger);
    }
   
}