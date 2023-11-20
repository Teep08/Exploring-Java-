import java.util.*;
public class Datatype {
    public static void main(String args[]) {

        Scanner scr = new Scanner(System.in);

        //String for single token
        System.out.println("Enter the string :");  //Deepak
        String sttr1 = scr.next();
        
        scr.nextLine(); //For enter without this it will skip the Double token string.

        //String for Double token
        System.out.println("Enter the string :");  //Deepak Dobhal
        String sttr2 = scr.nextLine();

        //Integer value
        System.out.println("Enter the Integer :");  // any number
        int sttr3 = scr.nextInt();

        //Byte value
        System.out.println("Enter the Byte value :");  //-128 to 127
        Byte sttr4 = scr.nextByte();

        //Float value
        System.out.println("Enter the Float value :");  //12.34
        Float sttr5 = scr.nextFloat();

        //Double value
        System.out.println("Enter the Double value :");  //LArge decimal value
        Double sttr6 = scr.nextDouble();

        //Boolean value
        System.out.println("Enter the Boolean value :");  //True/False
        Boolean sttr7 = scr.nextBoolean();

        //Short value
        System.out.println("Enter the Short value :");  //-32,768 to 32767
        Short sttr8 = scr.nextShort();

        //Long  value
        System.out.println("Enter the Long int value :"); //Large integer value
        Long sttr9 = scr.nextLong();

        //Display the inputs

        System.out.println("\nString for single token:"+sttr1);
        System.out.println("String for double token:"+sttr2);
        System.out.println("Integer value:"+sttr3);
        System.out.println("Byte value:"+sttr4);
        System.out.println("Float value:"+sttr5);
        System.out.println("Double value:"+sttr6);
        System.out.println("Boolean value:"+sttr7);
        System.out.println("Short value:"+sttr8);
        System.out.println("Long value:"+sttr9);

    }
}
