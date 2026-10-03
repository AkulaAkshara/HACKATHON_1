import java.util.*;
public class Rooftop_Solar_Energy_Monitor_1 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int panel_ID;
        double energy;
        int panels;
        char status;
        System.out.println("Enter panel ID:");
        panel_ID = sc.nextInt();
        System.out.println("Enter the amount of energy generated in kWh:");
        energy = sc.nextDouble();
        System.out.println("Number of solar panels:");
        panels = sc.nextInt();
        System.out.println("System status:"); //A = active, I= inactive
        status = sc.next().charAt(0);
        System.out.println("Details of a rooftop solar system are");
        System.out.println("Panel ID = "+panel_ID);
        System.out.println("The amount of energy generated in kWh = "+energy);
        System.out.println("Number of Solar Panels = "+panels);
        System.out.println("System status = "+status);
        sc.close();
    }
}
