public class Recursion {
    public static void print(int n)
    {
        //Base call - it's for when recursion stop
        if(n==0)
        {
            return;
        }
        //print the value
        System.out.print(n+" ");
        //recursion function
        print(n-1);
    }
    public static void main(String args[])
    {
        //print function calling
        print(5);
    }
}

// OUTPUT : 5 4 3 2 1