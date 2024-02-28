import java.util.ArrayList;
public class ArrList {
    public static void main(String args[])
    {
       //ArrayList declare 
       ArrayList<Integer> list = new ArrayList<>(); 

       //add operation 
       list.add(1);
       list.add(2);
       list.add(4);
       list.add(5);

       System.out.println(list);   //[1,2,4,5]

       list.add(2,3);
       System.out.println(list);   //[1,2,3,4,5]

       //get operation
       int check = list.get(1);
       System.out.println(check);  //2

       //remove operation
       list.remove(2);
       System.out.println(list);   //[1,2,4,5]

       //set operation
       list.set(1,8);
       System.out.println(list);   //[1,8,4,5]

       //contains element operation
       System.out.println(list.contains(8));   //true
       System.out.println(list.contains(6));   //false
   }
}
