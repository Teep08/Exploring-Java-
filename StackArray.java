import java.util.*;

public class StackArray {

    public static void main(String args[])
    {
        Stack obj = new Stack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.print();
        System.out.println("Peek is: "+obj.peek());
        System.out.println("Removed data: "+obj.pop());
        obj.print();
    }
}

class Stack
{
    int arr[] = new int[5];     //array
    int top = -1;               //variable to keep track of the top element
    
    //Print function to print the stack data
    public void print()
    {
        if(top == -1)
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

    //push function for insert the data into stack
    public void push(int data)
    {
        if(top == arr.length - 1)
        {
            System.out.println("Stack overflow");
            return;
        }
        arr[++top] = data;
    }

    //peek function to check the peek/top data from stack
    public int peek()
    {
        //if stack is empty
        if(top == -1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    //pop function for remove the data from stack
    public int pop()
    {
        //if stack is empty
        if(top == -1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        //remove the last value from array and return the value
        return arr[top--];
    }  
}

/*
OUTPUT : 
1 2 3 4 5 
Peek is: 5
Removed data: 5
1 2 3 4 5
 */