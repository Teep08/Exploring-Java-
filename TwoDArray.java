import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {

        public static void ArrayInput(int arr[][])      //Function for giving the input in array
        {
                Scanner scr = new Scanner(System.in);
                for(int row=0;row<arr.length;row++)     //Loop for Rows
                {
                        for(int col=0;col<arr[0].length;col++)  //Loop for Columns
                        {       
                                System.out.print("Enter the element for "+row+","+col+" : ");
                                arr[row][col] = scr.nextInt();
                        }
                }
        }

        public static void ArrayPrint(int arr[][])      //Function for printing the elements of array
        {
                for(int row=0;row<arr.length;row++)
                {
                        for(int col=0;col<arr[0].length;col++)
                        {
                                System.out.print(arr[row][col]+" ");
                        }
                        System.out.println();
                }
        }
        public static void main(String args[])
        {
                int arr[][] = new int[3][3];            //2-D array Declare

                ArrayInput(arr);        //Calling the Input function
                ArrayPrint(arr);        //Calling the output function
        }
}

/* RUN : 

Enter the element for 0,0 : 1
Enter the element for 0,1 : 2
Enter the element for 0,2 : 3
Enter the element for 1,0 : 4
Enter the element for 1,1 : 5
Enter the element for 1,2 : 6
Enter the element for 2,0 : 7
Enter the element for 2,1 : 8
Enter the element for 2,2 : 9
1 2 3
4 5 6
7 8 9

 */