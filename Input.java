import java.util.Scanner;

public class Input {
    public static void main(String args[]) {

        Scanner scr = new Scanner (System.in);
        System.out.println("Enter the 1st number:");
        int num1=scr.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2=scr.nextInt();
        
        int sum=num1+num2;

        System.out.println("Sum is: "+sum);
        
    }
}