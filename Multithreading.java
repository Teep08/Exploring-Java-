class Threading1 extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread1: "+i+" is executed");
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

class Threading2 implements Runnable{
    @Override
    public void run()
    {
        for(int i=5;i>=1;i--)
        {
            System.out.println("Thread2: "+i+" is executed");

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class Multithreading extends Thread{
    public static void main(String args[])
    {
        Threading1 obj1 = new Threading1();
        Threading2 obj2 = new Threading2();
        Thread th = new Thread(obj2);

        obj1.start();
        th.start();
    }
}
