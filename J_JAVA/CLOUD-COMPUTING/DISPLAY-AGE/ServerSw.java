//ServerSw.java
import java.rmi.*;
public class ServerSw  {
    public static void main(String[] args) {
        try{
        FinderImpl dat=new FinderImpl();
        Naming.bind("age", dat);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
