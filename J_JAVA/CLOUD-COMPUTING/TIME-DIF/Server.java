import java.rmi.*;
import java.rmi.server.*;

public class Server {
    public static void main(String[] args) {
        try{
        TimeImpl a=new TimeImpl();

        Naming.bind("TimeDiference", a);

        }catch(Exception e){
            System.out.println(e);
        }

    }
    
}
