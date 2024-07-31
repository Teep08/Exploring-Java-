import java.util.*;
public class StackAndQueueUsingDQ {
//Class for Stack
static class Stack
{
    Deque<Integer> ds = new LinkedList<>();

    //Insert the data in Stack
    public void push(int data)
    {
        ds.addLast(data);
        return;
    }

    //Check the peek value of Stack
    public int peek()
    {
        return ds.getLast();
    }

    //Delete the peek value of Stack
    public int pop()
    {
        return ds.removeLast();
    }
}

//Class for Queue
static class Queue
{
    Deque<Integer> dq = new LinkedList<>();

    //Insert the data in Queue
    public void push(int data)
    {
        dq.addLast(data);
        return;
    }

    //Check the peek or front value of Queue
    public int peek()
    {
        return dq.getFirst();
    }

    //Delete the front value of Queue
    public int pop()
    {
        return dq.removeFirst();
    }

}
public static void main(String args[])
{
    //Object of Stack class
    Stack st = new Stack(); 
    st.push(1);
    st.push(0);
    st.push(7);
    System.out.println("Peek data of Stack: "+st.peek());
    System.out.println("Pop data from stack: "+st.pop());

    //Object of Queue class 
    Queue qu = new Queue();
    qu.push(5);
    qu.push(9);
    qu.push(2);
    System.out.println("Peek data of Queue: "+qu.peek());
    System.out.println("Pop data from Queue: "+qu.pop());

} 
}

/*
OUTPUT: 
Peek data of Stack: 7
Pop data from stack: 7
Peek data of Queue: 5
Pop data from Queue: 5
 */
