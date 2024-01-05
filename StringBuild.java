public class StringBuild {
    public static void main(String args[])
    {
        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);  //Hello

        //for Amend the string
        str.append("Guys");
        System.out.println(str);    //original string is changed now output is HelloGuys 

        //reverse the string
        str.reverse();
        System.out.println(str);    //orignal string is - HelloGuys and after revser output is syuGolleH
    }  
}
