public class QueueArray {

    static class Queue
    {
        static int arr[];   //creating array
        static int size;    //size of the array
        static int rear;    //it's represent the rear of the queue

        Queue(int siz)
        {
            arr = new int[siz]; //initializing the size of the array
            size = siz; 
            rear = -1;
        }

        //Method for add data in queue
        public void add(int data)
        {
            //when queue is full
            if(rear == size-1)
            {
                System.out.println("Queue is overloaded");
                return;
            }
            rear++;
            arr[rear] = data;
            return;
        }

        //Method for remove data from queue
        public int remove()
        {
            //if queue is empty
            if(rear == -1)
            {
                System.out.println("Queue is empty");
                return -1; 
            }

            int removevalue = arr[0];
            for(int i=0;i<rear;i++)
            {
                arr[i] = arr[i+1];
            }
            rear--;
            return removevalue;
        }

        //disply front value of the queue
        public int peek()
        {
            //if queue is empty
            if(rear == -1)
            {
                System.out.println("Queue is empty");
                return -1; 
            }

            return arr[0];
        }

        //print function
        public void print()
        {
            //if queue is empty
            if(rear == -1)
            {
                System.out.println("Queue is empty");
                return; 
            }

            for(int i=0;i<=rear;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }

    }

    public static void main(String args[])
    {
        Queue obj = new Queue(5);   //5 is a size of array
        obj.add(6);
        obj.add(2);
        obj.add(8);
        obj.print();
        System.out.println("front is: "+obj.peek());
        System.out.println("Removed data is: "+obj.remove());
        obj.print();
    }    
}

/*
OUTPUT :
6 2 8 
front is: 6
Removed data is: 6
2 8
 */