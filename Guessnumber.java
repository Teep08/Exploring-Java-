// Genereated 8 numbers by program.
// User input 3 numbers.
// If user input number present under 8 random number array then he/she will be winner otherwise looser.

import java.util.*;
public class Guessnumber {

    public static void gen(int ran[])
    {
        //Random class object generate 
        Random ra = new Random();
        for(int i=0;i<ran.length;i++)
        {
            ran[i] = ra.nextInt(10); //It's generate the random numbers and store that under array
        }
        guess(ran); //calling the Guess method
    }

    public static void guess(int ran[])
    {
        Scanner scr = new Scanner(System.in);
        int a=0; 
        for(int i=1;i<=3;i++)  //input the 3 numbers by user
        {
            System.out.print("Guess your "+i+" number :");
            int guss = scr.nextInt();
            for( int j :ran)
            {
                if(guss == j)  //checking user number is matched with array numbers
                {
                    a++; //increase the value of a varaible if number matched
                }
            }
        }
        if(a>3)
        {
            System.out.println("Congratulations you are the winner :)");
        }
        else
        {
            System.out.println("Sorry better luck next time :(");
        }
        System.out.print("The Random numbers are: "); //print the numbers of array
        for( int j :ran)
            {
                System.out.print(j+" ");
            }
    }
    public static void main(String args[])
    {
        int ran[] = new int[8];
        gen(ran); 
    }
}

/* OUTPUT : 
GGuess your 1 number :2
Guess your 2 number :7
Guess your 3 number :4
Sorry better luck next time :(
The Random numbers are: 7 1 2 3 9 1 7 3
 */
