public class Loop {

    public static void main(String args[]) {

        //While loop

        int i=1; //initialisation
        while(i<=5) //Condition
        {
            System.out.println("Hello While");
            i++; //Increment / Decrement
        }

        //For loop
        for(int j=1;j<=5;j++) {
            System.out.println("Hello for");
        }

        //Do while loop
        int z=1;
        do {
            System.out.println("Hello Do");
            z++;
        }while(z<=5);

    }
    
}
