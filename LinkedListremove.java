public class LinkedListremove {
    
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

//Creating a method for adding a node in the linked list
public void add(int data)
{
    //creating new node
    Node newnode = new Node(data);

    //If linked list is empty
    if(head ==null)
    {
        head = tail = newnode;
    }

    //If linked list already having a data
    tail.next = newnode;
    tail = newnode;
    tail.next = null;
    return;
}

public void remove(int data)
{
    //if Linked list is empty
    if(head == null)
    {
        System.out.println("Linked list is empty");
        return;
    }

    //If linked list having a single node
    if(head == tail)
    {
        head = tail = null;
        return;
    }

    //If user want to delete head
    if(head.data == data)
    {
        head = head.next;
        return;
    }

    //If linked list having more than single node
    Node prev = head;
    Node temp = head.next;
    while(prev != null)
    {
        if(temp.data == data)
        {
            prev.next = temp.next;
            return;
        }
        prev = prev.next;
        temp = temp.next;
    }
    return;
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
    LinkedListremove obj = new LinkedListremove();
    obj.add(1);
    obj.add(2);
    obj.add(3);
    obj.add(4);
    obj.print();
    obj.remove(1);
    obj.print();
}
}
