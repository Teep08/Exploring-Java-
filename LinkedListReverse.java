public class LinkedListReverse {
    //Create a node class
    public class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;    //first node
    public static Node tail;    //last node
    
    //Method for adding a node in the linked list
    public void add(int data)
    {
        //creating new node
        Node newnode = new Node(data);

        //if linked list is empty
        if(head == null)
        {
            head = tail = newnode;
            return;
        }

        //If linked list already having a data
        tail.next = newnode;
        newnode.next = null;
        tail = newnode;
        return;
    }

    //Method for printing nodes of the linked list
    public void print()
    {
        //if linked list is empty
        if(head == null)
        {
            System.out.println("Linked list is empty");
            return;
        }

        //create a temprory node or assign it as a head
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    //Method for reverse the linked list
    public void reverse()
    {
        //if linked list is empty
        if(head == null)
        {
            System.out.println("Linked list is empty");
            return;
        }

        //create temp nodes
        Node prev = null;
        Node current = tail = head;
        Node nxt;

        while(current != null)
        {
            nxt = current.next;
            current.next = prev;
            prev = current;
            current = nxt;
        }
        head = prev;
        return;
    }

    //main function
    public static void main(String args[])
    {
        LinkedListReverse obj = new LinkedListReverse();
        
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.print();
        obj.reverse();    
        obj.print();    
    }
    
}

/* OUTPUT : 
1->2->3->4->NULL
4->3->2->1->NULL
 */