// class myth extends Thread{
//     // String msg=" ";
//     myth(String name)
//     {
//         super(name);
//         start();
//     }
class myth implements Runnable{
    Thread t;        //reference of thread
    myth(String name)
    {
    t=new Thread(this,name);
    System.out.println(t.getName());
    System.out.println(Thread.currentThread());
    t.start();
    }

  public void run()
    {
        for(int i =0;i<10;i++)
        {
            try{
            Thread.sleep(1000);
            System.out.println("child"+i);
        }
        catch(InterruptedException e)
        {
            System.out.println("interrupted");
        }
    }
    }
}

public class Mainth{
  public static void main(String s[])
  {
        myth m=new myth("first");
        myth m1=new myth("second");
        for(int i =11;i<21;i++)
        {
            System.out.println(i);
        }  
        // m1.run();
  }
}