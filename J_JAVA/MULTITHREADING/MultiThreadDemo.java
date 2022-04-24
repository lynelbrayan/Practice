class Threder extends Thread
{
    int time,i;
    String msg; 
    Threder(int a,String s)
    {
        i=0;
        time=a;
        msg=s;
        this.start();
    }
    public void run()
    {
        try{
            while(i<10000)
            {
            Thread.sleep(time);
            System.out.println(msg);
            i=i+time;
            }
            
        }
        catch(InterruptedException e)
        {
            System.out.println("error");
        }

    }
}

public class MultiThreadDemo {
    

    public static void main(String[] args) {
        new Threder(1000, "hello!");
        new Threder(2000, "wear mask!");
        new Threder(5000, "use sanitiser!");
     
        
    }
}