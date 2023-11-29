public class Funoverloading {
    public static int add(int a,int b) {
       return a+b;
   }
   
    public static int add(int a,int b,int c) {
        return a+b+c;
    }
   
    public static float add(float a,float b) {
        return a+b;
    }
   
    public static void main(String args[])
    {
       System.out.println(add(3,2));  
       System.out.println(add(3,2,1));
       System.out.println(add(2.3f,3.2f));
    
    }
}
