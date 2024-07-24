import java.util.*;

public class stackcollectionframework {

    //function for push the data in first position of the stack not in peek
    public static void pushatbottom(Stack<Integer> s, int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int dat = s.pop();
        pushatbottom(s,data);
        s.push(dat);
    }

    //function for reverse the stack
    public static void reversestack(Stack<Integer> stk,Stack<Integer> temp)
    {
        if(stk.isEmpty())
        {
            return;
        }
        temp.push(stk.pop());
        reversestack(stk,temp);
    }

    public static void main(String args[])
    {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        pushatbottom(stk,0);
        System.out.println("Original stack: "+stk);

        Stack<Integer> temp = new Stack<>();    //temp stack which store the reversed string data
        reversestack(stk,temp);
        System.out.println("Reversed stack: "+temp);
    }
}

/*
OUTPUT :
Original stack: [0, 1, 2, 3, 4]
Reversed stack: [4, 3, 2, 1, 0]
 */
