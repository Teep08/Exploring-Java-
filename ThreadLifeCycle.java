class Threading extends Thread
{
    public void run()
    {
        System.out.println("Thread Stage Running, run() method executing");
        try{
            Thread.sleep(2000);
            System.out.println("Thread Stage Non Runnable, sleep() method executing");
        }catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}

public class ThreadLifeCycle
{
    public static void main(String args[])
    {
        Threading t = new Threading();  //New stage
        System.out.println("Thread stage is New, Object created");

        System.out.println("Thread stage is Runnable, run() method call");
        t.start();  //runnable stage
        
        //Thread stage is Terminated
    }
}

/*
output :
Thread stage is New, Object created
Thread stage is Runnable, run() method call
Thread Stage Running, run() method executing
Thread Stage Non Runnable, sleep() method executing
 */