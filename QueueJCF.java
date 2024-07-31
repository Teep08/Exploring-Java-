import java.util.*;
public class QueueJCF {

    public static void main(String args[])
    {
        //using Java collection framework we implemented Queue
        //I used LinkedList apart from Queue because Queue is insterface and interface don't have object
        Queue<Integer> Q = new LinkedList<>(); 

        Q.add(1);
        Q.add(5);
        Q.add(8);
        System.out.println(Q);  //print Queue 
        System.out.println("Peek is:"+ Q.peek());   //Print peek value or Front value
        Q.remove(); //it will remove frist value or front value of Queue
        System.out.println(Q);  //print Queue 
    }
}

/*
OUTPUT :
[1, 5, 8]
Peek is:1
[5, 8]
 */
