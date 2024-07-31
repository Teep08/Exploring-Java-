import java.util.*;
public class Deq 
{
    public static void main(String args[])
    {
        //I used LinkedList apart from Queue because Queue is insterface and interface don't have object
        Deque<Integer> dq = new LinkedList<>();

        //For adding the data in First position in Deque
        dq.addFirst(3);
        dq.addFirst(2);
        dq.addFirst(1);
        //For adding the data in last position in Deque
        dq.addLast(4);
        dq.addLast(5);
        dq.addLast(6);
        //For checking the data in First position in Deque
        System.out.println("First Values is: "+dq.getFirst());
        //For checking the data in Last position in Deque
        System.out.println("Last Value is: "+dq.getLast());
        //For delete the data from First position in Deque
        dq.removeFirst();
        //For delete the data from First position in Deque
        dq.removeFirst();
        //For print the Deque
        System.out.println(dq);
    }  
}

/*
First Values is: 1
Last Value is: 6
[3, 4, 5, 6]
 */