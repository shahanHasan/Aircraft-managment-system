
/**
 * Write a description of class FirstClassPassenger here.
 * 
 *Md Mohidul Hasan , 15071717
 *Course work 2
 */
public class FirstClassPassenger extends PayingPassenger implements FirstClass
{
     private double Additional_luggage ;
     private double Weight ;
     private double Luggage ;
     
     public FirstClassPassenger(String firstName, String lastName, double weight, double baseFare , String FFC)
    {
        super(firstName, lastName, weight, FirstClass.Start_number, baseFare, FirstClass.typeCharge , FFC);
        Additional_luggage=0 ;
        this.Weight=Weight;
        this.Luggage=Luggage;
    }
    
     public String toString(){
        String prettyLine = "---------------------------" + "\n\n";
       
        //System.out.println("Economy Class\n" + prettyLine + super.toString());
        
        return "FirstClass\n" + prettyLine + super.toString();
    }
     public double getAdditional_Luggage(){
        return Additional_luggage;
    }
     public void setAdditional_Luggage(double Additional_luggage){
        this.Additional_luggage = Additional_luggage;
    }
    public double getWeighT(){
        return Weight+Luggage+Additional_luggage ;
    }
}

   