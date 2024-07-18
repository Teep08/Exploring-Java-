import java.util.Scanner;
public class LinkedListSearch {

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

    //Search method
    public void search(int data)
    {
        //if linked list is empty
        if(head == null)
        {
            System.out.println("Linked list is empty");
            return ;
        }

        //create a temprory node or assign it as a head
        Node temp = head;
        int i=1; // it's for index
        while(temp != null)
        {
            if(temp.data == data)
            {
                System.out.println("Search number found at :"+i+" index");
                return;
            }
            i++;
            temp = temp.next;
        }

        //if search data is not present in linked list
        System.out.println("Search data is not available");
        return;
    }

    //main function
    public static void main(String args[])
    {
        LinkedListSearch obj = new LinkedListSearch();
        Scanner scr = new Scanner(System.in);
        obj.add(1);
        obj.add(2);
        obj.add(7);
        obj.add(4);
        obj.print();
        System.out.print("Enter the search number: ");
        int data = scr.nextInt();
        obj.search(data);
        
    }
}

/*
Case 1 : when data found
1->2->7->4->NULL
Enter the search number: 7
Search number found at :3 index

Case 2 : When data not present in linked list
1->2->7->4->NULL
Enter the search number: 9
Search data is not available
 */