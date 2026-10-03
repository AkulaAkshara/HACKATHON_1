import java.util.*;
public class Rooftop_Solar_Energy_Monitor_2 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the amount of energy generated in kWh:");
        double energy = sc.nextDouble();
        if(energy>=10)
            System.out.println("Good Energy Generation");
        else 
            System.out.println("Low Energy Generation");
        sc.close();
    }
}
