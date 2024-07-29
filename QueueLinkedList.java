public class QueueLinkedList {
    //creation of Node
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    //Declaring head and tail Nodes 
    public static Node head;
    public static Node tail;

    //Method for add data in queue
    public void add(int data)
    {
        //New node creation
        Node newnode = new Node(data);

        //if queue is empty
        if(head == null)
        {
            head = tail = newnode;   
            return;
        }
        tail.next = newnode;
        tail = newnode;
        return;
    }

    //Method for remove data from queue
    public int remove()
    {
        //if queue is empty
        if(head == null)
        {
            System.out.println("Queue is empty");;   
            return -1;
        }

        int dat = head.data;
        head = head.next;
        return dat;
    }

    //disply front value of the queue
    public int peek()
    {
        //if queue is empty
        if(head == null)
        {
            System.out.println("Queue is empty");;   
            return -1;
        }

        return head.data;
    }

    //method for display the data of queue
    public void print()
    {
        //if queue is empty
        if(head == null)
        {
            System.out.println("Queue is empty");;   
            return;
        }

        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
        return;
    }

    //main method
    public static void main(String args[])
    {
        QueueLinkedList obj = new QueueLinkedList();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.print();
        System.out.println("Peek data is: "+ obj.peek());
        System.out.println("Removed data is:"+obj.remove());
        obj.print();
    }
    
}
