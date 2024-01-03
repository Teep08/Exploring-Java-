import java.util.*;

public class Temperature_converter {
     public static void cal(int value)
    {   
        System.out.println(value + 273.15);
    }

    public static void kel(float value)
    {
        System.out.println(Math.round(value - 273.15));
    }

    public static void main(String args[])
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("1.Celsius to Kelvin\n2.Kelvin to Celsius");
        int choice = scr.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter the Celsius temperature :");
                int cel = scr.nextInt();
                cal(cel);              
            break;

            case 2:
                System.out.print("Enter the Kelvin temperature :");
                float kel = scr.nextFloat();
                kel(kel);
            break;
        
            default:
            System.out.println("You chose the wrong opetion");
                break;
        }
    }
}
