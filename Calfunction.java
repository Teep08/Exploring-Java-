import java.util.Scanner;

public class Calfunction {

    public static int add(int a,int b) {
        int add=a+b;
        return add;
    }
    public static int sub(int a,int b){
        int sub=a-b;
        return sub;
    }
    public static int mul(int a,int b){
        int mul=a*b;
        return mul;
    }
    public static float div(int a,int b){
        float div=a/b;
        return div;
    }
    public static float mod(int a,int b){
        float mod=a%b;
        return mod;
    }

    public static void main(String args[]){
        Scanner scr = new Scanner(System.in);
        
        System.out.print("Enter the 1st number :");
        int a=scr.nextInt();
        System.out.print("Enter the 2nd number :");
        int b=scr.nextInt();

        System.out.print("Choose your operator +,-,*,/,% :");
        String opr = scr.next();

        switch (opr) {
            case "+":
                int sum=add(a,b);
                System.out.println("Answer is :"+sum);
            break;
            case "-":
                int sub=sub(a,b);
                System.out.println("Answer is :"+sub);
            break;
            case "*":
                int prod=mul(a,b);
                System.out.println("Answer is :"+prod);
            break;
            case "/":
                float div=div(a,b);
                System.out.println("Answer is :"+div);
            break;
            case "%":
                float mod=mod(a,b);
                System.out.println("Answer is :"+mod);
            break;    
        
            default:
            System.out.println("You choose wrong operator");
            break;
        }

    }
    
}
