public class StackLinkedList 
{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack 
    {
        static Node head = null;

        //push function for insert the data into stack
        public void push(int data)
        {
            Node newnode = new Node(data);

            //if stack is empty
            if(head == null)
            {
                head = newnode;
                return;
            }

            //if data is already present in stack
            newnode.next = head;
            head = newnode;
            return;
        }

        //pop function for remove the data from stack
        public int pop()
        {
            //if stack is empty
            if(head == null)
            {
                return -1;
            }
            
            int top = head.data;
            head = head.next;
            return top;
        }

        //peek function to check the peek/top data from stack
        public int peek()
        {
            //if stack is empty
            if(head == null)
            {
                return -1;
            }

            return head.data;
        }

        //function for print the all values in stack
        public void print()
        {
            //if stack is empty
            if(head == null)
            {
                System.out.println("Stack is empty");
                return;
            }

            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("NULL");
            return;
        }
    }

    public static void main(String args[])
    {
        Stack obj = new Stack();
        obj.push(6);
        obj.push(9);
        obj.push(3);
        obj.push(7);
        obj.push(5);
        obj.print();
        System.out.println("Peek is: "+obj.peek());
        System.out.println("Removed data: "+obj.pop());
        obj.print();
    }
}

/*
OUTPUT :
5->7->3->9->6->NULL
Peek is: 5
Removed data: 5
7->3->9->6->NULL
 */