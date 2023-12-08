import java.util.*;

public class Array {
    public static void main(String argsp[]) {
        Scanner scr = new Scanner(System.in);

        // Entering the length of array
        System.out.println("Enter the length of array : ");
        int len=scr.nextInt();

        //Creating an array
        int arr[] = new int[len];

        //Taking input and store in array
        for(int i=0;i<arr.length;i++) {
            arr[i]=scr.nextInt();
        }

        //print the value of array 
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

    }
}