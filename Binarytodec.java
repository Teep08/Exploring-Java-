import java.util.Scanner;
import java.util.Math;

public class Binarytodec {

     public static void conver(int bin) {
         int pow=0; //Power
         int ans=0; //Answer
         while (bin>0) {

            int last=bin%10;    //For last number in our input number
            ans = ans +(last*(int)Math.pow(2,pow));     
            pow++;      
            bin=bin/10;     //For remaning number in our input number
         }
         System.out.println(ans);
    }


   public static void main(String args[]) {
      Scanner scr = new Scanner(System.in);
      System.out.print("Enter the number:");
      int bin=scr.nextInt();
      conver(bin);  //Function calling
   }
    
}


//Rough working

/*
 * bin = 101
 * pow = 0
 * ans = 0
 * last = 1
 * 
 * ans = 0 + (1*2^0)
 * ans = 0 + (1*1)
 * ans = 1
 * pow = 1
 * bin = 0
 * 
 * ans = 1 + (0*2^1)
 * ans = 1 + (0*1)
 * ans = 1
 * pow = 2
 * bin = 1
 * 
 * ans = 1 + (1*2^2)
 * ans = 1 + (1*4)
 * ans = 5

 */
