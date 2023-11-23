import java.util.*;

public class Switch {
    public static void main(String args[]) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter the number between 1-4:");
        int choice= scr.nextInt();

        switch (choice) {
            case 1:
            System.out.println("You choose number 1");
            break;

            case 2:
            System.out.println("You choose number 2");
            break;
            
            case 3:
            System.out.println("You choose number 3");
            break;

            case 4:
            System.out.println("You choose number 4");
            break;

            default:
            System.out.println("You enter wrong number");
            break;
        }
    }
}