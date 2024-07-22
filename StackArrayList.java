//implementation of stack using arraylist
import java.util.*;
public class StackArrayList {
    public static void main(String args[])
    {
        ArrayStack obj = new ArrayStack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.print();
        System.out.println("Peek is: "+obj.peek());
        System.out.println("Removed data: "+obj.pop());
        obj.print();
        System.out.println("Peek is: "+obj.peek());
    }
}

class ArrayStack
{
    ArrayList<Integer> arr = new ArrayList<>();

    //push function for insert the data into stack
    public void push(int data)
    {
        arr.add(data);
    }

    //pop function for remove the data from stack
    public int pop()
    {
        //if stack is empty
        if(arr.size()==0)
        {
            return -1;
        }

        int peek = arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        return peek;
    }

    //peek function to check the peek/top data from stack
    public int peek()
    {
        //if stack is empty
        if(arr.size()==0)
        {
            return -1;
        }

        return arr.get(arr.size()-1);
    }

    //function for print the all values in stack
    public void print()
    {
        //if stack is empty
        if(arr.size()==0)
        {
            System.out.println("Stack is empty");
            return;
        }

        //loop for print stack values
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

/*
OUTPUT :
1 2 3 4 
Peek is: 4
Removed data: 4
1 2 3
Peek is: 3
 */
