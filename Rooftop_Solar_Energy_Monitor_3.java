import java.util.*;
public class Rooftop_Solar_Energy_Monitor 
{
    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy)
    {
        double total = morningEnergy+eveningEnergy;
        return total;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter morning energy generated in kWh:");
        double morningEnergy = sc.nextDouble(); 
        System.out.println("Enter evening energy generated in kWh:"); 
        double eveningEnergy = sc.nextDouble();
        double total = calculateTotalEnergy(morningEnergy, eveningEnergy);
        System.out.println("Total Energy Generated = "+total+" kWh");
        sc.close();
    }
}
