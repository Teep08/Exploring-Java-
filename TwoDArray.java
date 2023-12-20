public class TwoDArray {
    public static void main(String args[]){
                //Create 4X3 2-D Array
                for(int row=0;row<=3;row++)  //Loop for Rows
                {
                        for(int col=0;col<=2;col++)     //Loop for Columns
                        {
                                System.out.print("("+row+","+col+")");      //Print the Index of Array
                        }
                        System.out.println();   //For next line
                }
        }
}

/*
 OUTPUT :
(0,0)(0,1)(0,2)
(1,0)(1,1)(1,2)
(2,0)(2,1)(2,2)
(3,0)(3,1)(3,2)
 */