public class LinkedListadd {

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

    //Creating a method for adding a node in the head of the linked list
    public void addfirst(int data)
    {
        //create a node
        Node newnode = new Node(data);

        //if Linked list is empty
        if(head==null)
        {
            head = tail = newnode;
            return;
        }

        //if Linked list already having node

        newnode.next = head;    //linked with first node
        head = newnode;         //make new node is head so our first node is new node
    }

    //Creating a method for adding a node in the last of the linked list
    public void addlast(int data)
    {
        //create a node
        Node newnode = new Node(data);

        //if Linked list is empty
        if(head == null)
        {
            head = tail = newnode;
            return;
        }
        //if Linked list already having node

        tail.next = newnode;    //linked with last node tail
        tail = newnode;         //make new node is tail so our last node is new node
    }

    //Creating a method for adding a node in the middle of the linked list
    public void addmid(int data,int index)
    {
        //create a node
        Node newnode = new Node(data);

        //if Linked list is empty
        if(head == null)
        {
            head = tail = newnode;
            return;
        }

        //create a temprory node or assign it as a head
        Node temp = head;
        int i=0;

        //Loop for going to our index / location
        while(i<index-1)
        {
            temp = temp.next;
            i++;
        }

        newnode.next = temp.next;   //linked with the next node
        temp.next = newnode;        //linked with the previous node
    }

    //Creating a method for printing nodes of the linked list
    public void print()
    {
        //if Linked list is empty
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

    public static void main(String args[])
    {
        LinkedListadd obj = new LinkedListadd();
        obj.addfirst(3);
        obj.addfirst(2);
        obj.addfirst(1);
        obj.addlast(5);
        obj.print();
        obj.addmid(4, 3);
        obj.print();
    }
    
}

/*
 * OUTPUT 
1->2->3->5->NULL
1->2->3->4->5->NULL
 */