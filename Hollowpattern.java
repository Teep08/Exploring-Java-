public class Hollowpattern {
    
    public static void main(String[] args) {
      int row=4;
      int col=5;

      for(int i=1;i<=row;i++) {
         if(i==1 || i==row) {          // Only print a 1st and last line 
            for(int j=1;j<=col;j++) {
               System.out.print("*");
            }
            System.out.println();
         }
         else {
            for(int j=1;j<=col;j++) {
               if(j==1 || j==col) {    // Print a middle hollow pattern
               System.out.print("*"); }
               else {
                  System.out.print(" ");
               }
            }
            System.out.println();
         }
      }
    }
}

// OUTPUT
// *****
// *   *
// *   *
// *****
