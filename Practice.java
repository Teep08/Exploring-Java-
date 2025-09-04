import java.util.Scanner;
public class Practice
{
    public static void main(String args[])
    {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter the number 1:");
        int a = scr.nextInt();
        System.out.print("Enter the number 2:");
        int b = scr.nextInt();


        System.out.println(sum(a,b));
    }

    public static int sum(int a,int b)
    {
        return a+b;
    }
}