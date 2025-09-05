import java.util.Scanner;
public class Practice
{
    public static void main(String args[])
    {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scr.nextInt();

        if(num >0 && num != 0)
        {
            System.out.println("It's a positive number");
        }
        else if(num == 0)
        {
            System.out.println("It's a nutral number");
        }
        else {
            System.out.println("It's a negative number");
        }
    }
}